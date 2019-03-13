package com.sys.dao.impl;

import org.springframework.stereotype.Repository;

import com.core.dao.impl.BaseDaoImpl;
import com.sys.dao.ExtCproductDao;
import com.sys.domain.ExtCproduct;

@Repository ///为了包扫描的时候这个Dao被扫描到  
public class ExtCproductDaoImpl extends BaseDaoImpl<ExtCproduct> implements ExtCproductDao {

	public ExtCproductDaoImpl() {
		//设置命名空间
		super.setNs("com.sys.mapper.ExtCproductMapper");
	}

}
