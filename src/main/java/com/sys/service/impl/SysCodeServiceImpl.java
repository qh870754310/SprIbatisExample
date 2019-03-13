package com.sys.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.SysCodeDao;
import com.sys.domain.SysCode;
import com.sys.service.SysCodeService;

@Service
public class SysCodeServiceImpl implements SysCodeService {

	@Autowired
	private SysCodeDao sysCodeDao;
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<SysCode> find(Map paraMap) {
		return sysCodeDao.find(paraMap);
	}

}
