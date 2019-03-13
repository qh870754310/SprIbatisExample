package com.sys.controller.cargo.contract;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sys.domain.ContractProduct;
import com.sys.domain.Factory;
import com.sys.service.ContractProductService;
import com.sys.service.FactoryService;

@Controller
public class ContractProductController {

	@Autowired
	private ContractProductService contractProductService;
	
	@Autowired
	private FactoryService factoryService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/cargo/contractproduct/tocreate.action")
	public String tocreate(String contractId, Model model) {  //转向新增页面
		model.addAttribute("contractId", contractId);//传递购销合同Id
		//准备生产厂家的下拉列表
		List<Factory> factoryList = factoryService.getFactoryList();
		model.addAttribute("factoryList", factoryList);
		
		//某个合同下的货物
		Map paraMap = new HashMap();
		paraMap.put("contractId", contractId);
		List<ContractProduct> dataList = contractProductService.find(paraMap);
		model.addAttribute("dataList", dataList);
		return "/cargo/contractproduct/jContractProductCreate.jsp";  //货物的新增页面
	}
	
	@RequestMapping("/cargo/contractproduct/insert.action")
	public String insert(ContractProduct contractProduct, Model model) {
		contractProductService.insert(contractProduct);
		model.addAttribute("contractId", contractProduct.getContractId());
		return "redirect:/cargo/contractproduct/tocreate.action";
	}
	
	@RequestMapping("/cargo/contractproduct/toupdate.action")
	public String toupdate(String id, Model model) {  //转向修改页面
		ContractProduct contractProduct = contractProductService.get(id);
		model.addAttribute("contractProduct", contractProduct);
		//准备生产厂家的下拉列表
		List<Factory> factoryList = factoryService.getFactoryList();
		model.addAttribute("factoryList", factoryList);
		return "/cargo/contractproduct/jContractProductUpdate.jsp";  //货物的修改页面 
	}
	
	@RequestMapping("/cargo/contractproduct/update.action")
	public String update(ContractProduct contractProduct, Model model) {
		contractProductService.update(contractProduct);
		model.addAttribute("contractId", contractProduct.getContractId());
		return "redirect:/cargo/contractproduct/tocreate.action";
	}
	
	@RequestMapping("/cargo/contractproduct/delete.action")
	public String delete(String contractId, String id, Model model) {
		contractProductService.deleteById(id);
		model.addAttribute("contractId", contractId);
		return "redirect:/cargo/contractproduct/tocreate.action";
	}
	
}
