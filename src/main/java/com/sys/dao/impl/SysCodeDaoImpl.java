package com.sys.dao.impl;

import org.springframework.stereotype.Repository;

import com.core.dao.impl.BaseDaoImpl;
import com.sys.dao.SysCodeDao;
import com.sys.domain.SysCode;

@Repository //为了包扫描的时候这个Dao被扫描到 
public class SysCodeDaoImpl extends BaseDaoImpl<SysCode> implements SysCodeDao {

	//设置命名空间
	public SysCodeDaoImpl() {
		super.setNs("com.sys.mapper.SysCodeMapper");
	}
}
