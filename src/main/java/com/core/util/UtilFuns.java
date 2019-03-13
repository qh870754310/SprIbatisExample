package com.core.util;
/**
 * 
 * @ClassName: UtilFuns
 * @Description: 工具类（它是关于所有(对象、字符串、列表)判断是否为空的类）
 * @author R096
 * @date: 2017年1月19日 下午4:01:08
 */
public class UtilFuns {
	
	public static boolean isNotEmpty(String str) {
		try {
			if (str == null || str.equals("null") || str.equals("") ) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return true;
		}
	}
	
	public static boolean isNotEmpty(Object object) {
		try {
			if (object == null || object.toString().equals("null") || object.toString().equals("")) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return true;
		}
	}
}
