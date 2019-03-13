package com.sys.domain;

import java.util.Date;

//报运单
public class Export {

	private String id;
	
	private Date inputDate;
	
	private String epnum;
	
	private String extnum;
	
	private String contractIds; //打断设计，合同的ID集合 
	
	private String customerContract;//合同及确认书号 
	
	private String lcno;//信用证号
	
    private String consignee;//收货人及地址
    
    private String marks;//唛头
    
    private String remark; 
    
    private String shipmentPort;//装运港
    
    private String destinationPort;//目的港
    
    private String transportMode;//运输方式 
    
    private String priceCondition;//价格条件 
    
    //state状态,为了流程跟踪(0-草稿,1-已上报,2-装修,3-委托,4-发票,5-财务)
    
    private Integer state;
    
    private Double grossWeight; //毛重 
    
    private Double netWeight;//净重
    
    private String measurement;//体积(中间计算)  
      
    private String createBy;
    
    private String creatDept;
    
    private java.util.Date creatTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getInputDate() {
		return inputDate;
	}

	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}

	public String getEpnum() {
		return epnum;
	}

	public void setEpnum(String epnum) {
		this.epnum = epnum;
	}

	public String getExtnum() {
		return extnum;
	}

	public void setExtnum(String extnum) {
		this.extnum = extnum;
	}

	public String getContractIds() {
		return contractIds;
	}

	public void setContractIds(String contractIds) {
		this.contractIds = contractIds;
	}

	public String getCustomerContract() {
		return customerContract;
	}

	public void setCustomerContract(String customerContract) {
		this.customerContract = customerContract;
	}

	public String getLcno() {
		return lcno;
	}

	public void setLcno(String lcno) {
		this.lcno = lcno;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getShipmentPort() {
		return shipmentPort;
	}

	public void setShipmentPort(String shipmentPort) {
		this.shipmentPort = shipmentPort;
	}

	public String getDestinationPort() {
		return destinationPort;
	}

	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
	}

	public String getTransportMode() {
		return transportMode;
	}

	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	public String getPriceCondition() {
		return priceCondition;
	}

	public void setPriceCondition(String priceCondition) {
		this.priceCondition = priceCondition;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Double getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(Double grossWeight) {
		this.grossWeight = grossWeight;
	}

	public Double getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(Double netWeight) {
		this.netWeight = netWeight;
	}

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreatDept() {
		return creatDept;
	}

	public void setCreatDept(String creatDept) {
		this.creatDept = creatDept;
	}

	public java.util.Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(java.util.Date creatTime) {
		this.creatTime = creatTime;
	} 
	
}
