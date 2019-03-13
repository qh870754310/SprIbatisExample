package com.sys.controller.cargo.outproduct;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.controller.BaseController;
import com.core.util.DownloadUtil;
import com.sys.service.OutProductService;
import com.sys.vo.OutProductVO;

@Controller
public class OutProductController extends BaseController {

	@Autowired
	private OutProductService outProductService;
	
	@RequestMapping("/cargo/outproduct/toedit.action")
	public String toedit() {  
		return "/cargo/outproduct/jOutProduct.jsp";   //转向输入年月的页面
	}
	
	@RequestMapping("/cargo/outproduct/print.action")
	public void print(String inputDate, HttpServletResponse response) throws IOException {  //inputDate格式:yyyy-MM   打印
		List<OutProductVO> dataList = outProductService.find(inputDate);
		/*System.out.println(dataList.size());
		System.out.println(inputDate);*/
		
		/*Workbook wb = new HSSFWorkbook();*///打开一个模板文件，2003Excel以下版本
		Workbook wb = new XSSFWorkbook();//打开一个模板文件，2007Excel以上版本
		//打开一个模板文件，2007Excel以上版本
		Sheet sheet = wb.createSheet();
		Row nRow = null;
		Cell nCell = null;
		
		int rowNo = 0; //行号
		int cellNo = 1;  //列号
		
		//声明样式对象和字体对象
		CellStyle nStyle = wb.createCellStyle();
		Font nFont = wb.createFont();
		
		//设置表格宽度
		sheet.setColumnWidth(1,1*300);//列宽
		sheet.setColumnWidth(2,26*300);//列宽
		sheet.setColumnWidth(2,12*300);//列宽  
	    sheet.setColumnWidth(3,29*300);//列宽  
	    sheet.setColumnWidth(4,10*300);//列宽  
	    sheet.setColumnWidth(5,12*300);//列宽  
	    sheet.setColumnWidth(6,8*300);//列宽  
	    sheet.setColumnWidth(7,10*300);//列宽  
	    sheet.setColumnWidth(8,10*300);//列宽  
	    sheet.setColumnWidth(9,8*300);//列宽 
		
		//大标题,合并单元格
		sheet.addMergedRegion(new CellRangeAddress(0,0,1,9)); ////开始行，结束行，开始列，结束列
		//合并单元格的内容是写在合并前的第一个单元格中
		nRow = sheet.createRow(rowNo++);
		nRow.setHeightInPoints(36);//行高
		
		nCell = nRow.createCell(1);
		nCell.setCellValue(inputDate.replaceFirst("-0", "-").replaceFirst("-", "年")+"月份出货表");//yyyy-MM
		nCell.setCellStyle(this.bigTitle(wb, nStyle, nFont));
		
		//配置标题行
		String[] title = new String[]{"客户","订单号","货号","数量","工厂","附件","工厂交期","船期","贸易条款"};
		
		nRow = sheet.createRow(rowNo++);
		nRow.setHeightInPoints(26.5f);//标题的高度
		nStyle = wb.createCellStyle();//重新初始化样式
		nFont = wb.createFont();//重新初始化字体
		
		for (int i = 0; i < title.length; i++) {
			nCell = nRow.createCell(i+1);
			nCell.setCellValue(title[i]);
			nCell.setCellStyle(this.Title(wb, nStyle, nFont));
		}
		
		nStyle=wb.createCellStyle();//重新初始化样式  
		nFont=wb.createFont();//重新初始化字体 
		
		//处理数据
		for (int i = 0; i < dataList.size(); i++) {
			OutProductVO op = dataList.get(i);
			
			nRow = sheet.createRow(rowNo++);
			nRow.setHeightInPoints(24);//数据框的高
			cellNo = 1; //列号初始化
			
			nCell = nRow.createCell(cellNo++);
			nCell.setCellValue(op.getCustomName());
			nCell.setCellStyle(this.Text(wb, nStyle, nFont));
			
			nCell = nRow.createCell(cellNo++);
			nCell.setCellValue(op.getContract_no());
			nCell.setCellStyle(this.Text(wb, nStyle, nFont));
			
			nCell = nRow.createCell(cellNo++);
			nCell.setCellValue(op.getProductNo());
			nCell.setCellStyle(this.Text(wb, nStyle, nFont));
			
			nCell = nRow.createCell(cellNo++);
			nCell.setCellValue(op.getCnumber());
			nCell.setCellStyle(this.Text(wb, nStyle, nFont));
			
			nCell = nRow.createCell(cellNo++);
			nCell.setCellValue(op.getFactoryName());
			nCell.setCellStyle(this.Text(wb, nStyle, nFont));
			
			nCell = nRow.createCell(cellNo++);
			nCell.setCellValue(op.getExts());
			nCell.setCellStyle(this.Text(wb, nStyle, nFont));
			
			nCell = nRow.createCell(cellNo++);
			nCell.setCellValue(op.getDelivery_period());
			nCell.setCellStyle(this.Text(wb, nStyle, nFont));
			
			nCell = nRow.createCell(cellNo++);
			nCell.setCellValue(op.getShip_time());
			nCell.setCellStyle(this.Text(wb, nStyle, nFont));
			
			nCell = nRow.createCell(cellNo++);
			nCell.setCellValue(op.getTradeTerms());
			nCell.setCellStyle(this.Text(wb, nStyle, nFont));
		}
		
		//下载
		/*OutputStream os = new FileOutputStream(new File("F:\\outproduct.xls"));
		wb.write(os);
		os.flush();
		os.close();*/
		DownloadUtil du = new DownloadUtil();
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		wb.write(bs);
		du.download(bs, response, "出货表.xls");
	}

	private CellStyle Text(Workbook wb, CellStyle nStyle, Font nFont) {  //文字样式
		nFont.setFontName("Times New Roman");
		nFont.setFontHeightInPoints((short) 10);
		//横向居中
		nStyle.setAlignment(CellStyle.ALIGN_CENTER);
		//纵向居中
		nStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		//表格线(上下左右的细线)
		nStyle.setBorderTop(CellStyle.BORDER_THIN);
		nStyle.setBorderBottom(CellStyle.BORDER_THIN);
		nStyle.setBorderRight(CellStyle.BORDER_THIN);
		nStyle.setBorderLeft(CellStyle.BORDER_THIN);
		nStyle.setFont(nFont);
		return nStyle;
	}

	private CellStyle Title(Workbook wb, CellStyle nStyle, Font nFont) { //标题样式
		nFont.setFontName("黑体");
		nFont.setFontHeightInPoints((short) 12);
		//设置字体加粗
		nFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		//横向居中
		nStyle.setAlignment(CellStyle.ALIGN_CENTER);
		//纵向居中
		nStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		//表格线（上下左右的细线）
		nStyle.setBorderTop(CellStyle.BORDER_THIN);  
	    nStyle.setBorderLeft(CellStyle.BORDER_THIN);  
	    nStyle.setBorderRight(CellStyle.BORDER_THIN);  
	    nStyle.setBorderBottom(CellStyle.BORDER_THIN);
	    
	    nStyle.setFont(nFont);
		return nStyle;
	}

	private CellStyle bigTitle(Workbook wb, CellStyle nStyle, Font nFont) { //大标题样式
		nFont.setFontName("宋体");
		nFont.setFontHeightInPoints((short) 16);
		//设置字体加粗
		nFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		//横向居中
		nStyle.setAlignment(CellStyle.ALIGN_CENTER);
		//纵向居中
		nStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		nStyle.setFont(nFont);
		return nStyle;
	}
}
