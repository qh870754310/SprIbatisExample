package com.sys.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.pagination.Page;
import com.sys.dao.ExportDao;
import com.sys.domain.Export;
import com.sys.service.ExportService;

@Service
public class ExportServiceImpl implements ExportService{

	@Autowired
	private ExportDao exportDao;

	@SuppressWarnings("rawtypes")
	@Override
	public List<Export> findPage(Page page) {
		return exportDao.findPage(page);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Export> find(Map paraMap) {
		return exportDao.find(paraMap);
	}

	@Override
	public Export get(Serializable id) {
		return exportDao.get(id);
	}

	@Override
	public void insert(Export export) {
		exportDao.insert(export);
	}

	@Override
	public void update(Export export) {
		exportDao.update(export);
	}

	@Override
	public void deleteById(Serializable id) {
		exportDao.deleteById(id);
	}

	@Override
	public void delete(Serializable[] ids) {
		exportDao.delete(ids);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void submit(Serializable[] ids) {
		Map map = new HashMap();
		map.put("state", 1); //1启用
		map.put("ids", ids);
		exportDao.updateState(map);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void cancel(Serializable[] ids) {
		Map map = new HashMap();
		map.put("state", 0); //0启用
		map.put("ids", ids);
		exportDao.updateState(map);
	}
	
}
