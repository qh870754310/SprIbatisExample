package com.sys.dao;

import java.util.Map;

import com.core.dao.BaseDao;
import com.sys.domain.Factory;

public interface FactoryDao extends BaseDao<Factory>{
	//我们这里可以直接使用继承的BaseDao的增删改查方法  
    //创建一系列其它Dao的原因是因为其它Dao有可能需要拓展 
	
	/**
	 * 修改状态
	 * @param map
	 */
	@SuppressWarnings("rawtypes")
	public void updateState(Map map);
}
