package com.sys.controller.cargo.export;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.controller.BaseController;
import com.sys.domain.Export;
import com.sys.service.ExportService;

@Controller
public class ExportController extends BaseController {

	@Autowired
	private ExportService exportService;
	
	@RequestMapping("/cargo/export/list.action")
	public String list(Model model) {
		List<Export> dataList = exportService.find(null);
		model.addAttribute("dataList", dataList);
		return "/cargo/export/jExportList.jsp";
	}
}
