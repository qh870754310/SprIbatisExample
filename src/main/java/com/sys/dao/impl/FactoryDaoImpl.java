package com.sys.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.core.dao.impl.BaseDaoImpl;
import com.sys.dao.FactoryDao;
import com.sys.domain.Factory;

@Repository //为了包扫描的时候这个Dao被扫描到 
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao{

	public FactoryDaoImpl() {
		//设置命名空间
		super.setNs("com.sys.mapper.FactoryMapper");
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void updateState(Map map) {
		super.getSqlSession().update(super.getNs() + ".updateState", map);
	}
}
