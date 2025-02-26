package com.learning.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
//import jakarta.persistence.Transient;


@Entity
@Table(name="productInfo") //if we give tablename that name will be used or else classname will be used as tablename
public class Product {
	@Id //to make productId as primary key 
	@GeneratedValue(generator="UUID")
	@TableGenerator(name="primaryKeyGenerator",table = "id_generaator",
	pkColumnName = "gen_name",  
	valueColumnName = "gen_value",
    pkColumnValue ="object",initialValue = 0)
	private int productId;
	
	@Column(name="product_Name",nullable=false)
	private String productName;
	private Double productPrice;
	

	private String productCategory;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	

}
