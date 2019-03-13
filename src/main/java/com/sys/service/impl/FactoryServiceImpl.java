package com.sys.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.pagination.Page;
import com.sys.dao.FactoryDao;
import com.sys.domain.Factory;
import com.sys.service.FactoryService;

@Service
public class FactoryServiceImpl implements FactoryService{

	@Autowired
	private FactoryDao factoryDao;
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<Factory> findPage(Page page) {
		return factoryDao.findPage(page);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Factory> find(Map paraMap) {
		return factoryDao.find(paraMap);
	}

	@Override
	public Factory get(Serializable id) {
		return factoryDao.get(id);
	}

	@Override
	public void insert(Factory factory) {
		//设置UUID
		factory.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		factory.setState("1");//默认为启用状态
		factoryDao.insert(factory);
	}

	@Override
	public void update(Factory factory) {
		factoryDao.update(factory);
	}

	@Override
	public void deleteById(Serializable id) {
		factoryDao.deleteById(id);
	}

	@Override
	public void delete(Serializable[] ids) {
		factoryDao.delete(ids);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void start(Serializable[] ids) {
		Map map = new HashMap();
		map.put("start", 1);  //1启用
		map.put("ids", ids);
		factoryDao.updateState(map);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void stop(Serializable[] ids) {
		Map map = new HashMap();
		map.put("start", 0);  //0 停用
		map.put("ids", ids);
		factoryDao.updateState(map);
	}

	@Override
	public List<Factory> getFactoryList() {
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("state", 1); //1启用，代表只查询启用的生产厂家列表
		return factoryDao.find(paraMap);
	}

}
