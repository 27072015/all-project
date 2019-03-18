package com.capgemini.salesmanagement.service;

import java.util.HashMap;


import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exceptions.InvalidProductName;
import com.capgemini.salesmanagement.exceptions.ProductCategoryNotValid;

import com.capgemini.salesmanagement.exceptions.ProductIdNotValid;
import com.capgemini.salesmanagement.exceptions.ProductPriceInvalidException;
import com.capgemini.salesmanagement.exceptions.ProductQuantityNotFound;

public class SaleService implements ISaleService{
ISaleDAO saleDAO=new SaleDAO();
	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
	
		return saleDAO.insertSalesDetails(sale);
	}

	@Override
	public boolean validateProductCode(int productId) throws ProductIdNotValid{
	if(productId==1001||productId==1002||productId==1003||productId==1004)
		return true;
	else throw new ProductIdNotValid("PRODUCT CODE NOT FOUND");

	}

	@Override
	public boolean validateQuantity(int qty)throws ProductQuantityNotFound {
	if(qty>0&&qty<5)
		return true;
	else throw new ProductQuantityNotFound ();
	}

	@Override
	public boolean validateProductCat(String prodCat)throws ProductCategoryNotValid {
	if(prodCat.equals("Electronics")||prodCat=="Toys")
		return true;
	else throw  new ProductCategoryNotValid();
	}

	@Override
	public boolean validateProductName(String prodName) throws InvalidProductName{
		if(prodName=="TV"||prodName=="SmartPhone"||prodName=="Video Game"||prodName=="SoftToy"||prodName=="Telescope"||prodName=="barbie doll")
			
		return true;
		else throw new InvalidProductName();
	}

	@Override
	public boolean validateProductPrice(float price)throws ProductPriceInvalidException {
		if(price>=200)
		return true;
		else throw new ProductPriceInvalidException();
	}

}
