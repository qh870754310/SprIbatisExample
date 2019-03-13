package com.sys.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.core.pagination.Page;
import com.sys.domain.Export;

public interface ExportService {

	/**
	 * 分页查询
	 * @param page
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List<Export> findPage(Page page);
	
	/**
	 * 带条件查询，条件可以为null，既没有条件；返回list对象集合
	 * @param paraMap
	 * @return
	 */
    @SuppressWarnings("rawtypes")
	public List<Export> find(Map paraMap);
    
    /**
     * 只查询一个，常用于修改
     * @param id
     * @return
     */
    public Export get(Serializable id);
    
    /**
     * 插入，用实体作为参数
     * @param export
     */
    public void insert(Export export);  
    
    /**
     * 修改，用实体作为参数
     * @param export
     */
    public void update(Export export);
    
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
     * 上报 
     * @param ids
     */
    public void submit(Serializable[] ids);
    
    /**
     * 取消
     * @param ids
     */
    public void cancel(Serializable[] ids);
}
