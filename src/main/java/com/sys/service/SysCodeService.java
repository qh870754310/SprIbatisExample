package com.sys.service;

import java.util.List;
import java.util.Map;

import com.sys.domain.SysCode;

public interface SysCodeService {

	/**
	 * 查询
	 * @param paraMap
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List<SysCode> find(Map paraMap); 
}
