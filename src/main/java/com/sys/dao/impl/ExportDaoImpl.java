package com.sys.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.core.dao.impl.BaseDaoImpl;
import com.sys.dao.ExportDao;
import com.sys.domain.Export;

@Repository //为了包扫描的时候这个Dao被扫描到 
public class ExportDaoImpl extends BaseDaoImpl<Export> implements ExportDao {

	public ExportDaoImpl() {
		//设置命名空间
		super.setNs("com.sys.mapper.ExportMapper");
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public void updateState(Map map) {
		super.getSqlSession().update(super.getNs() + ".updateState", map);
	}

}
