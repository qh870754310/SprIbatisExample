package com.sys.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.core.dao.impl.BaseDaoImpl;
import com.sys.dao.ContractProductDao;
import com.sys.domain.ContractProduct;

@Repository //为了包扫描的时候这个Dao被扫描到
public class ContractProductDaoImpl extends BaseDaoImpl<ContractProduct> implements ContractProductDao{

	public ContractProductDaoImpl() {
		//设置命名空间  
		super.setNs("com.sys.mapper.ContractProductMapper");
	}

	@Override
	public void deleteByContractProductById(Serializable[] ids) throws Exception {
		super.getSqlSession().delete(super.getNs() + ".deleteByContractProductById", ids);
	}
}
