package com.sys.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.pagination.Page;
import com.sys.dao.ExtCproductDao;
import com.sys.dao.SysCodeDao;
import com.sys.domain.ExtCproduct;
import com.sys.domain.SysCode;
import com.sys.service.ExtCproductService;

@Service
public class ExtCproductServiceImpl implements ExtCproductService {

	@Autowired
	private ExtCproductDao extCproductDao;
	
	@Autowired
	private SysCodeDao sysCodeDao;
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<ExtCproduct> findPage(Page page) {
		return extCproductDao.findPage(page);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<ExtCproduct> find(Map paraMap) {
		return extCproductDao.find(paraMap);
	}

	@Override
	public ExtCproduct get(Serializable id) {
		return extCproductDao.get(id);
	}

	@Override
	public void insert(ExtCproduct extCproduct) {
		//设置UUID
		extCproduct.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		extCproductDao.insert(extCproduct);
	}

	@Override
	public void update(ExtCproduct extCproduct) {
		extCproductDao.update(extCproduct);
	}

	@Override
	public void deleteById(Serializable id) {
		extCproductDao.deleteById(id);
	}

	@Override
	public void delete(Serializable[] ids) {
		extCproductDao.delete(ids);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<SysCode> getCtypeList() {
		Map paraMap = new HashMap();
		paraMap.put("parentId", "0104"); //0104是附件表的分类
		return sysCodeDao.find(paraMap);
	}

}
