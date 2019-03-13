package com.sys.dao;

import com.core.dao.BaseDao;
import com.sys.domain.ExtCproduct;

public interface ExtCproductDao extends BaseDao<ExtCproduct> {

	//我们这里可以直接使用继承的BaseDao的增删改查方法  
    //创建一系列其它Dao的原因是因为其它Dao有可能需要拓展
	
}
