package com.core.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

public class DownloadUtil {

	/**
	 * 
	 * @param filePath  要下载的文件路径
	 * @param returnName 返回的文件名
	 * @param response 
	 * @param delFlag 是否删除文件
	 */
	protected void download(String filePath, String returnName, HttpServletResponse response, boolean delFlag) {
		this.prototypeDownload(new File(filePath), returnName, response, delFlag);
	}

	/**
	 * 
	 * @param file  要下载的文件
	 * @param returnName  返回的文件名
	 * @param response
	 * @param delFlag 是否删除
	 */
	protected void download(File file, String returnName, HttpServletResponse response, boolean delFlag) {
		this.prototypeDownload(file, returnName, response, delFlag);
	}
	
	/**
	 * 
	 * @param file   要下载的文件
	 * @param returnName  返回的文件名
	 * @param response  
	 * @param delFlag  是否删除文件
	 */
	private void prototypeDownload(File file, String returnName, HttpServletResponse response, boolean delFlag) {
		//下载文件
		FileInputStream inputStream = null;
		ServletOutputStream outputStream = null;
		try {
			if (!file.exists()) return;
			response.reset();
			//设置响应类型  (PDF文件为"application/pdf"，WORD文件为："application/msword"， EXCEL文件为："application/vnd.ms-excel"。)
			response.setContentType("application/octet-stream;charset=utf-8");
			//设置响应的文件名称，并转换成中文编码
			//returnName = URLEncoder.encode(returnName, "UTF-8");
			returnName = response.encodeURL(new String(returnName.getBytes(),"iso8859-1"));//保存的文件名，必须和页面编码保持一直，否则乱码
			//attachment作为附件下载；inline客户端机器有安装匹配程序，则直接打开；注意改变配置，清除缓存，否则可能不能看到效果  
			response.addHeader("Content-Disposition", "attachment;filename="+returnName);
			//将文件读入响应流
			inputStream = new FileInputStream(file);
			outputStream = response.getOutputStream();
			int length = 1024;
			int readLength = 0;
			byte[] buf = new byte[1024];
			readLength = inputStream.read(buf, 0, length);
			while(readLength != -1) {
				outputStream.write(buf, 0, readLength);
				readLength = inputStream.read(buf, 0, length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				outputStream.flush();
				outputStream.close();
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (delFlag) { //删除原文件
				file.delete();
			}
		}
	}
	
	/**
	 * 
	 * @param byteArrayOutputStream  将文件内容写入ByteArrayOutputStream 
	 * @param response   写入response
	 * @param returnName  返回的文件名
	 * @throws IOException
	 */
	public void download(ByteArrayOutputStream byteArrayOutputStream, HttpServletResponse response, String returnName) throws IOException {
		response.setContentType("application/octet-stream;charset=utf-8");
		returnName = response.encodeURL(new String(returnName.getBytes(),"iso8859-1")); //保存的文件名,必须和页面编码一致,否则乱码  
		response.addHeader("Content-Disposition",   "attachment;filename=" + returnName);
        response.setContentLength(byteArrayOutputStream.size());  
        ServletOutputStream outputStream = response.getOutputStream(); //取得输出流
        byteArrayOutputStream.writeTo(outputStream);
        byteArrayOutputStream.close(); //关闭
        outputStream.flush();  //刷新数据
	}
}
