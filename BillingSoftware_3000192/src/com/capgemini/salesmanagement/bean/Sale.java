package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sale {
private int saleId;
private int prodCode;
private String productName;
private String category;
private LocalDate saleDate;
private int quantity;
private float lineTotal;
public Sale() {}
public Sale(int saleId, int prodCode, String productName, String category, LocalDate saleDate, int quantity,
		float lineTotal) {
	super();
	this.saleId = saleId;
	this.prodCode = prodCode;
	this.productName = productName;
	this.category = category;
	this.saleDate = saleDate;
	this.quantity = quantity;
	this.lineTotal = lineTotal;
}
public Sale(String productName, String category, LocalDate saleDate, int quantity, float lineTotal) {
	super();
	this.productName = productName;
	this.category = category;
	this.saleDate = saleDate;
	this.quantity = quantity;
	this.lineTotal = lineTotal;
}
public Sale(int productId, String string, String category2, float price, LocalDate now, int qty, String string2) {
	// TODO Auto-generated constructor stub
}
public int getSaleId() {
	return saleId;
}
public void setSaleId(int saleId) {
	this.saleId = saleId;
}
public int getProdCode() {
	return prodCode;
}
public void setProdCode(int prodCode) {
	this.prodCode = prodCode;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public LocalDate getSaleDate() {
	return saleDate;
}
public void setSaleDate(LocalDate saleDate) {
	this.saleDate = saleDate;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public float getLineTotal() {
	return lineTotal;
}
public void setLineTotal(float lineTotal) {
	this.lineTotal = lineTotal;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((category == null) ? 0 : category.hashCode());
	result = prime * result + Float.floatToIntBits(lineTotal);
	result = prime * result + prodCode;
	result = prime * result + ((productName == null) ? 0 : productName.hashCode());
	result = prime * result + quantity;
	result = prime * result + ((saleDate == null) ? 0 : saleDate.hashCode());
	result = prime * result + saleId;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Sale other = (Sale) obj;
	if (category == null) {
		if (other.category != null)
			return false;
	} else if (!category.equals(other.category))
		return false;
	if (Float.floatToIntBits(lineTotal) != Float.floatToIntBits(other.lineTotal))
		return false;
	if (prodCode != other.prodCode)
		return false;
	if (productName == null) {
		if (other.productName != null)
			return false;
	} else if (!productName.equals(other.productName))
		return false;
	if (quantity != other.quantity)
		return false;
	if (saleDate == null) {
		if (other.saleDate != null)
			return false;
	} else if (!saleDate.equals(other.saleDate))
		return false;
	if (saleId != other.saleId)
		return false;
	return true;
}
@Override
public String toString() {
	return "Sale [saleId=" + saleId + ", prodCode=" + prodCode + ", productName=" + productName + ", category="
			+ category + ", saleDate=" + saleDate + ", quantity=" + quantity + ", lineTotal=" + lineTotal + "]";
}

}
