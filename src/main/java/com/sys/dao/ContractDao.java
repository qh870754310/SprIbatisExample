package com.sys.dao;

import java.io.Serializable;
import java.util.Map;

import com.core.dao.BaseDao;
import com.sys.domain.Contract;
import com.sys.vo.ContractVO;

public interface ContractDao extends BaseDao<Contract> {

	//我们这里可以直接使用继承的BaseDao的增删改查方法  
    //创建一系列其它Dao的原因是因为其它Dao有可能需要拓展 
	
	@SuppressWarnings("rawtypes")
	public void updateState(Map map);//修改状态 
	
	/**
	 * 拓展的级联删除方法
	 * @param ids
	 * @throws Exception
	 */
	public void deleteByContractById(Serializable[] ids) throws Exception;
	
	/**
	 * 拓展的级联删除方法
	 * @param ids
	 * @throws Exception
	 */
	public void deleteExtByContractById(Serializable[] ids) throws Exception;
	
	/**
	 * 查询合同加关联关系的详细信息 
	 * @param contractId
	 * @return
	 */
	public ContractVO view(String contractId);
}
