package com.sys.dao;

import java.io.Serializable;

import com.core.dao.BaseDao;
import com.sys.domain.ContractProduct;

public interface ContractProductDao extends BaseDao<ContractProduct>{

	//我们这里可以直接使用继承的BaseDao的增删改查方法  
    //创建一系列其它Dao的原因是因为其它Dao有可能需要拓展
	
	//拓展的级联删除方法
	public void deleteByContractProductById(Serializable[] ids) throws Exception;
}
