package com.sys.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.pagination.Page;
import com.sys.dao.ContractDao;
import com.sys.domain.Contract;
import com.sys.service.ContractService;
import com.sys.vo.ContractVO;

@Service
public class ContractServiceImpl implements ContractService {

	@Autowired
	private ContractDao contractDao;
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<Contract> findPage(Page page) {
		return contractDao.findPage(page);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Contract> find(Map paraMap) {
		return contractDao.find(paraMap);
	}

	@Override
	public Contract get(Serializable id) {
		return contractDao.get(id);
	}

	@Override
	public void insert(Contract contract) {
		//设置UUID
		contract.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		contract.setState(0);//默认为草稿
		contractDao.insert(contract);
	}

	@Override
	public void update(Contract contract) {
		contractDao.update(contract);
	}

	@Override
	public void deleteById(Serializable id) {
		Serializable[] ids = {id};
		try {
			//删除合同时删除合同货物下的所有附件
			contractDao.deleteExtByContractById(ids);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			//删除合同时，同时删除合同下的货物
			contractDao.deleteByContractById(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		contractDao.deleteById(id);
	}

	@Override
	public void delete(Serializable[] ids) {
		try {
			//删除合同时，删除合同货物下的所有附件
			contractDao.deleteExtByContractById(ids);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			//删除合同时，同时删除合同下的货物  
			contractDao.deleteByContractById(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		contractDao.delete(ids);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void submit(Serializable[] ids) {
		//默认刚建完的是草稿，建完之后确定没问题就上报  
        //0草稿 1已上报
		Map map = new HashMap();
		map.put("state", 1);//1 已上报
		map.put("ids", ids);
		contractDao.updateState(map);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void cancel(Serializable[] ids) {
		Map map = new HashMap();
		map.put("state", 0); //0
		map.put("ids", ids);
		contractDao.updateState(map);
	}

	@Override
	public ContractVO view(String contractId) {
		return contractDao.view(contractId);
	}

}
