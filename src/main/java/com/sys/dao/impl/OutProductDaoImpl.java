package com.sys.dao.impl;

import org.springframework.stereotype.Repository;

import com.core.dao.impl.BaseDaoImpl;
import com.sys.dao.OutProductDao;
import com.sys.vo.OutProductVO;

@Repository  //为了包扫描的时候这个Dao被扫描到
public class OutProductDaoImpl extends BaseDaoImpl<OutProductVO> implements OutProductDao{

	public OutProductDaoImpl() {
		//设置命名空间
		super.setNs("com.sys.mapper.OutProductMapper");
	}
}
