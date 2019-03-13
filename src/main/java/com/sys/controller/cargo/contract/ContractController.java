package com.sys.controller.cargo.contract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.controller.BaseController;
import com.sys.domain.Contract;
import com.sys.service.ContractService;
import com.sys.vo.ContractVO;

@Controller
public class ContractController extends BaseController {

	@Autowired
	private ContractService contractService;
	
	@RequestMapping("/cargo/contract/list.action")
	public String list(Model model) {
		List<Contract> datalist = contractService.find(null);
		model.addAttribute("datalist", datalist);
		return "/cargo/contract/jContractList.jsp";
	}
	
	@RequestMapping("/cargo/contract/tocreate.action")
	public String tocreate() {
		return "/cargo/contract/jContractCreate.jsp";  //跳到添加编辑页面
	}
	
	@RequestMapping("/cargo/contract/insert.action")
	public String insert(Contract contract) {
		contractService.insert(contract);  //添加
		return "redirect:/cargo/contract/list.action";
	}
	
	@RequestMapping("/cargo/contract/toupdate.action")
	public String toupdate(String id, Model model) {
		Contract contract = contractService.get(id);
		model.addAttribute("contract", contract);
		return "/cargo/contract/jContractUpdate.jsp";  //跳转到编辑页面
	}
	
	@RequestMapping("/cargo/contract/update.action")
	public String update(Contract contract) {    //修改方法
		contractService.update(contract);  
		return "redirect:/cargo/contract/list.action";
	}
	
	@RequestMapping("/cargo/contract/delete.action")
	public String delete(String[] ids) {  //删除方法
		contractService.delete(ids);
		return "redirect:/cargo/contract/list.action";
	}
	
	@RequestMapping("/cargo/contract/toview.action")
	public String toview(String id, Model model) {
		
		/*Contract contract = contractService.get(id);*/
		ContractVO contract = contractService.view(id);
		model.addAttribute("contract", contract);
		return "/cargo/contract/jContractView.jsp";
	}
	
	@RequestMapping("/cargo/contract/submit.action")
	public String submit(String[] ids) {  //上报
		contractService.submit(ids);
		return "redirect:/cargo/contract/list.action";
	}
	
	@RequestMapping("/cargo/contract/cancel.action")
	public String cancel(String[] ids) {  //取消
		contractService.cancel(ids);
		return "redirect:/cargo/contract/list.action";
	}
}
