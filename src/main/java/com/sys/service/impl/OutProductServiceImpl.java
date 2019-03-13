package com.sys.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.OutProductDao;
import com.sys.service.OutProductService;
import com.sys.vo.OutProductVO;

@Service
public class OutProductServiceImpl implements OutProductService {

	@Autowired
	private OutProductDao outProductDao;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<OutProductVO> find(String inpuDate) {
		Map paraMap = new HashMap();
		paraMap.put("inpuDate", inpuDate);
		return outProductDao.find(paraMap);
	}
}
