///////HANDS ON////////////
//Create a product java bean with fields like proID, prodName,prodDes and price
//Create getters and setters for these fields
//create at least 5 products
//Display details of most costly product.
//make sure you follow all java naming conventions 
package com.training.cg;

public class Products {
	private String prodId;
	private String prodName;
	private String prodDesc;
	private double price;
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
