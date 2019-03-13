package com.sys.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.core.pagination.Page;
import com.sys.domain.Factory;

public interface FactoryService {

	/**
	 * 分页查询
	 * @param page
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List<Factory> findPage(Page page);
	
	/**
	 * 带条件查询，条件可以为null，既没有条件；返回list对象集合
	 * @param paraMap
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List<Factory> find(Map paraMap); 
	
	/**
	 * 只查询一个，常用于修改
	 * @param id
	 * @return
	 */
	public Factory get(Serializable id); 
	
	/**
	 * 插入，用实体作为参数
	 * @param factory
	 */
	public void insert(Factory factory); 
	
	/**
	 * 修改，用实体作为参数
	 * @param factory
	 */
	public void update(Factory factory); 
	
	/**
	 * 按id删除，删除一条；支持整数型和字符串类型ID
	 * @param id
	 */
	public void deleteById(Serializable id); 
	
	/**
	 * 批量删除；支持整数型和字符串类型ID
	 * @param ids
	 */
	public void delete(Serializable[] ids);
	
	/**
	 * 启用
	 * @param ids
	 */
	public void start(Serializable[] ids);
	
	/**
	 * 停用
	 * @param ids
	 */
	public void stop(Serializable[] ids);
	
	/**
	 * 获取生产厂家列表
	 * @return
	 */
	public List<Factory> getFactoryList();
}
