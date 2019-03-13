package com.sys.vo;

import java.util.List;

import com.sys.domain.Contract;
import com.sys.domain.ExtCproduct;
import com.sys.domain.Factory;

/**
 * @ClassName: ContractProduct
 * @Description: ContractProduct的VO对象， 合同货物
 * @author R096
 * @date: 2017年1月20日 下午2:12:25
 */
public class ContractProductVO {

	private String id;
	
	private Contract contract; //将复杂的关联关系变成单表操作 
	
	private List<ExtCproduct> extCproducts; //和附件一对多
	
	private Factory factory; //和生产厂家一对多
	
	private String factoryName;
	
	private String productNo;
	
	private String productImage;
	
	private String productDesc;  //货物描述
	
	private Integer cnumber;
	
	private Integer outNumber;  //出货数量
	
	private String loadingRate;  //装率
	
	private String boxNum; //箱数
	
	private String packingUnit;  //包装单位
	
	private Double price;  //单价
	
	private Double amount;  //总价
	
	private  Integer finished; //是否出货完毕
	
	private String exts;//附件
	
	private Integer orderNo; //排序号

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public List<ExtCproduct> getExtCproducts() {
		return extCproducts;
	}

	public void setExtCproducts(List<ExtCproduct> extCproducts) {
		this.extCproducts = extCproducts;
	}

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Integer getCnumber() {
		return cnumber;
	}

	public void setCnumber(Integer cnumber) {
		this.cnumber = cnumber;
	}

	public Integer getOutNumber() {
		return outNumber;
	}

	public void setOutNumber(Integer outNumber) {
		this.outNumber = outNumber;
	}

	public String getLoadingRate() {
		return loadingRate;
	}

	public void setLoadingRate(String loadingRate) {
		this.loadingRate = loadingRate;
	}

	public String getBoxNum() {
		return boxNum;
	}

	public void setBoxNum(String boxNum) {
		this.boxNum = boxNum;
	}

	public String getPackingUnit() {
		return packingUnit;
	}

	public void setPackingUnit(String packingUnit) {
		this.packingUnit = packingUnit;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getFinished() {
		return finished;
	}

	public void setFinished(Integer finished) {
		this.finished = finished;
	}

	public String getExts() {
		return exts;
	}

	public void setExts(String exts) {
		this.exts = exts;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	
}
