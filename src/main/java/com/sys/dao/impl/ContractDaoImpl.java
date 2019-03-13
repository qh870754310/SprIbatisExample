package com.sys.dao.impl;

import java.io.Serializable;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.core.dao.impl.BaseDaoImpl;
import com.sys.dao.ContractDao;
import com.sys.domain.Contract;
import com.sys.vo.ContractVO;

@Repository //为了包扫描的时候这个Dao被扫描到  
public class ContractDaoImpl extends BaseDaoImpl<Contract> implements ContractDao {

	public ContractDaoImpl() {
		//设置命名空间
		super.setNs("com.sys.mapper.ContractMapper");
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public void updateState(Map map) {
		super.getSqlSession().update(super.getNs() + ".updateState	", map);
	}

	@Override
	public void deleteByContractById(Serializable[] ids) throws Exception {
		super.getSqlSession().delete(super.getNs() + ".deleteByContractById", ids);
	}

	@Override
	public void deleteExtByContractById(Serializable[] ids) throws Exception {
		super.getSqlSession().delete(super.getNs() + ".deleteExtByContractById", ids);
	}

	@Override
	public ContractVO view(String contractId) {
		return super.getSqlSession().selectOne(super.getNs() + ".view", contractId);
	}

}
