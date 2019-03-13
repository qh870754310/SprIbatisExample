package com.sys.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.pagination.Page;
import com.core.util.UtilFuns;
import com.sys.dao.ContractProductDao;
import com.sys.domain.ContractProduct;
import com.sys.service.ContractProductService;

@Service
public class ContractProductServiceImpl implements ContractProductService {

	@Autowired
	private ContractProductDao contractProductDao;
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<ContractProduct> findPage(Page page) {
		return contractProductDao.findPage(page);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<ContractProduct> find(Map paraMap) {
		return contractProductDao.find(paraMap);
	}

	@Override
	public ContractProduct get(Serializable id) {
		return contractProductDao.get(id);
	}

	@Override
	public void insert(ContractProduct contractProduct) {
		//设置UUID
		contractProduct.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		//自动计算总金额=数量*单价  ...修改，删除；同步合同金额
		if(UtilFuns.isNotEmpty(contractProduct.getCnumber())  
                &&UtilFuns.isNotEmpty(contractProduct.getPrice())) {
			contractProduct.setAmount(contractProduct.getCnumber()*contractProduct.getPrice());
		}
		contractProductDao.insert(contractProduct);
	}

	@Override
	public void update(ContractProduct contractProduct) {
		//自动计算总金额=数量*单价  ...修改，删除；同步合同金额
		if(UtilFuns.isNotEmpty(contractProduct.getCnumber())  
	            &&UtilFuns.isNotEmpty(contractProduct.getPrice())) {
			contractProduct.setAmount(contractProduct.getCnumber()*contractProduct.getPrice());
		}
		contractProductDao.update(contractProduct);
	}

	@Override
	public void deleteById(Serializable id) {  //删除一个
		Serializable[] ids = {id};
		try {
			//先删除所有货物下的附件
			contractProductDao.deleteByContractProductById(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		contractProductDao.deleteById(id);
	}

	@Override
	public void delete(Serializable[] ids) {  //删除多个
		try {
			//先删除所有货物下的附件
			contractProductDao.deleteByContractProductById(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		contractProductDao.delete(ids);
	}

}
