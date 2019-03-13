package com.sys.controller.basicinfo.factory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.core.controller.BaseController;
import com.sys.domain.Factory;
import com.sys.service.FactoryService;
/**
 * @ClassName: FactoryController
 * @Description: 继承BaseController是为了以后的扩充
 * @author R096
 * @date: 2017年1月17日 上午11:28:41
 */
@Controller
public class FactoryController extends BaseController{

	@Autowired
	private FactoryService factoryService;
	
	@RequestMapping("/basicinfo/factory/list.action")
	public String list(Model model) {
		List<Factory> dataList = factoryService.find(null);
		model.addAttribute("dataList", dataList); //将数据传递到页面
		return "/baseinfo/factory/jFactoryList.jsp"; //转向页面
	}
	
	@RequestMapping(value = "/basicinfo/factory/tocreate.action")
	public String tocreate() {
		return "/baseinfo/factory/jFactoryCreate.jsp"; //转向新增页面
	}
	
	@RequestMapping("/basicinfo/factory/insert.action")
	public String insert(Factory factory) {
		factoryService.insert(factory);
		return "redirect:/basicinfo/factory/list.action";//转向列表action
	}
	
	@RequestMapping("/basicinfo/factory/toupdate.action")
	public String toupdate(String id, Model model) {
		Factory factory = factoryService.get(id);
		model.addAttribute("factory", factory);
		return "/baseinfo/factory/jFactoryUpdate.jsp";   //转向修改页面
	}
	
	@RequestMapping("/basicinfo/factory/update.action")
	public String update(Factory factory) {
		factoryService.update(factory);   //修改保存
		return "redirect:/basicinfo/factory/list.action";
	}
	
	@RequestMapping("/basicinfo/factory/deleteById.action")
	public String deleteById(String id) {
		factoryService.deleteById(id);    //删除一个
		return "redirect:/basicinfo/factory/list.action";
	}
	
	@RequestMapping("basicinfo/factory/delete.action")
	public String delete(@RequestParam("id") String[] ids) {
		factoryService.delete(ids);
		return "redirect:/basicinfo/factory/list.action";
	}
	
	@RequestMapping("/basicinfo/factory/toview.action")
	public String toview(String id, Model model) {
		Factory factory = factoryService.get(id);
		model.addAttribute("factory", factory);
		return "/basicinfo/factory/jFactoryView.jsp";
	}
	
	@RequestMapping("/basicinfo/factory/start.action")
	public String start(@RequestParam("id") String[] ids) {
		factoryService.start(ids);      //批量启用
		return "redirect:/basicinfo/factory/list.action";
	}
	
	@RequestMapping("/basicinfo/factory/stop.action")
	public String stop(@RequestParam("id") String[] ids) {
		factoryService.start(ids);   //批量停用
		return "redirect:/basicinfo/factory/list.action";
	}
}
