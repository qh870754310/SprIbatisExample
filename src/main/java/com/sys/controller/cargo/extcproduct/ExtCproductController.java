package com.sys.controller.cargo.extcproduct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sys.domain.ExtCproduct;
import com.sys.domain.Factory;
import com.sys.domain.SysCode;
import com.sys.service.ExtCproductService;
import com.sys.service.FactoryService;

@Controller
public class ExtCproductController {

	@Autowired
	private ExtCproductService extCproductService;
	
	@Autowired
	private FactoryService factoryService;
	
	@RequestMapping("/cargo/extcproduct/tocreate.action")
	public String tocreate(String contractProductId, Model model) {  //转向新增页面
		//传递购销合同Id
		model.addAttribute("contractProductId", contractProductId);
		
		//准备生产厂家的下拉列表
		List<Factory> factoryList = factoryService.getFactoryList();
		model.addAttribute("factoryList",factoryList);  
	      
	    //某个货物下的附件  
	    Map<String,String> paraMap=new HashMap<String,String>();  
	    paraMap.put("contractProductId", contractProductId);  
	    List<ExtCproduct> dataList=extCproductService.find(paraMap);  
	    model.addAttribute("dataList", dataList);  
	      
	    //准备分类下拉列表  
	    List<SysCode> ctypeList=extCproductService.getCtypeList();  
	    model.addAttribute("ctypeList", ctypeList);  
	      
	    return "/cargo/contract/jExtCproductCreate.jsp";//货物的新增页面
	}
	
	@RequestMapping("/cargo/extcproduct/toupdate.action")
	public String toupdate(String id, Model model) {  //转向修改页面
		ExtCproduct extCproduct = extCproductService.get(id);
		model.addAttribute("extCproduct", extCproduct);
		
		//准备生产厂家的下拉列表  
	    List<Factory> factoryList=factoryService.getFactoryList();  
	    model.addAttribute("factoryList",factoryList);  
	      
	    //准备分类下拉列表  
	    List<SysCode> ctypeList=extCproductService.getCtypeList();  
	    model.addAttribute("ctypeList", ctypeList);  
	      
	    return "/cargo/contract/jExtCproductUpdate.jsp";//货物的修改页面
	}
}
