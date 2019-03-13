package com.sys.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.core.pagination.Page;
import com.sys.domain.ExtCproduct;
import com.sys.domain.SysCode;

public interface ExtCproductService {

	/**
	 * 分页查询
	 * @param page
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List<ExtCproduct> findPage(Page page);
	
	/**
	 * 带条件查询，条件可以为null，既没有条件；返回list对象集合
	 * @param paraMap
	 * @return
	 */
    @SuppressWarnings("rawtypes")
	public List<ExtCproduct> find(Map paraMap);
    
    /**
     * 只查询一个，常用于修改
     * @param id
     * @return
     */
    public ExtCproduct get(Serializable id);
    
    /**
     * 插入，用实体作为参数
     * @param extCproduct
     */
    public void insert(ExtCproduct extCproduct);
    
    /**
     * 修改，用实体作为参数
     * @param extCproduct
     */
    public void update(ExtCproduct extCproduct);
    
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
     * 获取分类列表
     * @return
     */
    public List<SysCode> getCtypeList();
}
