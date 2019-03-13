package com.sys.vo;

import java.util.Date;
import java.util.List;

import com.sys.domain.ContractProduct;

/**
 * @ClassName: ContractVO
 * @Description: Contract的VO对象，用于封装从购销合同中取出的货物的信息
 * @author R096
 * @date: 2017年1月20日 下午2:14:11
 */
public class ContractVO {

	private String id;
	
	private List<ContractProduct> contractProducts; //货物的集合
	
	private String offeror; //收购方
	
	private String contractNo; //合同编号
	
	
	private String cpnum;
	
	private String extnum;
	
	
	private Date signingDate;  //签单日期
	
	private String inputBy; //制单人
	
	private String checkBy; //审单人
	
	private String inspector; //验货员
	
	private Double totalAmount; //总金额
	
	private Integer importNum; //重要程度
	
	private String crequest; //要求
	
	private String customName;
	
	private Date deliveryPeriod; //交货期限
	
	private Date shipTime;  //船期
	
	private String tradeTerms; //贸易条款
	
	private String remark; //说明
	
	private String printStyle;  //打印版式
	
	private Integer oldState;  //归档前状态  
	
	private Integer state; //状态
	
	private Integer outState; //走货状态
	
	private String createBy; 
	
	private String createDept; 
	
	private Date createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ContractProduct> getContractProducts() {
		return contractProducts;
	}

	public void setContractProducts(List<ContractProduct> contractProducts) {
		this.contractProducts = contractProducts;
	}

	public String getOfferor() {
		return offeror;
	}

	public void setOfferor(String offeror) {
		this.offeror = offeror;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getCpnum() {
		return cpnum;
	}

	public void setCpnum(String cpnum) {
		this.cpnum = cpnum;
	}

	public String getExtnum() {
		return extnum;
	}

	public void setExtnum(String extnum) {
		this.extnum = extnum;
	}

	public Date getSigningDate() {
		return signingDate;
	}

	public void setSigningDate(Date signingDate) {
		this.signingDate = signingDate;
	}

	public String getInputBy() {
		return inputBy;
	}

	public void setInputBy(String inputBy) {
		this.inputBy = inputBy;
	}

	public String getCheckBy() {
		return checkBy;
	}

	public void setCheckBy(String checkBy) {
		this.checkBy = checkBy;
	}

	public String getInspector() {
		return inspector;
	}

	public void setInspector(String inspector) {
		this.inspector = inspector;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getImportNum() {
		return importNum;
	}

	public void setImportNum(Integer importNum) {
		this.importNum = importNum;
	}

	public String getCrequest() {
		return crequest;
	}

	public void setCrequest(String crequest) {
		this.crequest = crequest;
	}

	public String getCustomName() {
		return customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public Date getDeliveryPeriod() {
		return deliveryPeriod;
	}

	public void setDeliveryPeriod(Date deliveryPeriod) {
		this.deliveryPeriod = deliveryPeriod;
	}

	public Date getShipTime() {
		return shipTime;
	}

	public void setShipTime(Date shipTime) {
		this.shipTime = shipTime;
	}

	public String getTradeTerms() {
		return tradeTerms;
	}

	public void setTradeTerms(String tradeTerms) {
		this.tradeTerms = tradeTerms;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPrintStyle() {
		return printStyle;
	}

	public void setPrintStyle(String printStyle) {
		this.printStyle = printStyle;
	}

	public Integer getOldState() {
		return oldState;
	}

	public void setOldState(Integer oldState) {
		this.oldState = oldState;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getOutState() {
		return outState;
	}

	public void setOutState(Integer outState) {
		this.outState = outState;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateDept() {
		return createDept;
	}

	public void setCreateDept(String createDept) {
		this.createDept = createDept;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	} 
	
}
