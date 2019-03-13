package com.sys.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Test {

	public void testPrint() throws Exception {
		String xlsFile = "F://out.xlsx";
		
		Workbook wb = new XSSFWorkbook();//XSSF操作Excel2007以上版本
		Sheet sheet=wb.createSheet("海量数据测试簿");
		
	    Row nRow=null;  
	    Cell nCell=null;  
	      
	    for (int i=0;i<10000;i++) {  
	        System.out.println(i);  
	        nRow=sheet.createRow(i);  
	        for (int j=0; j<20; j++) {  
	            nCell=nRow.createCell(2);  
	            nCell.setCellValue("我是单元格");  
	        }  
	    }  
	      
	    //创建单元格样式  
	    CellStyle tStyle=wb.createCellStyle();  
	    Font nFont=wb.createFont();  
	   /* nCell.setCellStyle(this.textStyle(wb,tStyle,nFont));  */
	      
	    OutputStream os=new FileOutputStream(new File(xlsFile));  
	    wb.write(os);  
	    os.flush();  
	    os.close();  
	}
}
