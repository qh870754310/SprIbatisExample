package com.sys.vo;

/**
 * @ClassName: OutProductVO
 * @Description: 出货表信息
 * @author R096
 * @date: 2017年1月22日 上午10:06:31
 */
public class OutProductVO {

	private String customName; //客户
	
	private String contract_no; //订单号
	
	private String productNo; //货号
	 
	private String cnumber; //数量
	
	private String factoryName; //工厂
	
	private String exts; //附件
	
	private String delivery_period; //工厂交期
	
	private String ship_time;  //船期
	
	private String tradeTerms; //贸易条款

	public String getCustomName() {
		return customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public String getContract_no() {
		return contract_no;
	}

	public void setContract_no(String contract_no) {
		this.contract_no = contract_no;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getCnumber() {
		return cnumber;
	}

	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public String getExts() {
		return exts;
	}

	public void setExts(String exts) {
		this.exts = exts;
	}

	public String getDelivery_period() {
		return delivery_period;
	}

	public void setDelivery_period(String delivery_period) {
		this.delivery_period = delivery_period;
	}

	public String getShip_time() {
		return ship_time;
	}

	public void setShip_time(String ship_time) {
		this.ship_time = ship_time;
	}

	public String getTradeTerms() {
		return tradeTerms;
	}

	public void setTradeTerms(String tradeTerms) {
		this.tradeTerms = tradeTerms;
	}
	
}
