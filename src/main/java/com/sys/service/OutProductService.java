package com.sys.service;

import java.util.List;

import com.sys.vo.OutProductVO;

public interface OutProductService {

	public List<OutProductVO> find(String inpuDate);
}
