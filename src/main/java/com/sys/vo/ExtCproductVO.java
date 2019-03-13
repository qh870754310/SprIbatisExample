package com.sys.vo;

import com.sys.domain.ContractProduct;
import com.sys.domain.Factory;

/**
 * @ClassName: ExtCproductVO
 * @Description: ExtCproduct的VO对象  报运附件
 * @author R096
 * @date: 2017年1月20日 下午2:44:37
 */
public class ExtCproductVO {

	private String id;
	
	private ContractProduct contractProduct;  //多对一
	
	private Factory factory;  //一对多
	
	
	private String ctype; 
	
	private String productNo;
	
	private String productImage;
	
	private String productDesc;  //货物描述
	
	private Integer cnumber; //数量
	
	private String packingUnit; //包装单位
	
	private Double price; //单价
	
	private Double amount; //总价
	
	private String productRequest;//要求
	
	private Integer orderNo; //排序号

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ContractProduct getContractProduct() {
		return contractProduct;
	}

	public void setContractProduct(ContractProduct contractProduct) {
		this.contractProduct = contractProduct;
	}

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
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

	public String getProductRequest() {
		return productRequest;
	}

	public void setProductRequest(String productRequest) {
		this.productRequest = productRequest;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	
}
