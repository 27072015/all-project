package com.capgemini.salesmanagement.service;

import java.util.HashMap;


import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.InvalidProductName;
import com.capgemini.salesmanagement.exceptions.ProductCategoryNotValid;

import com.capgemini.salesmanagement.exceptions.ProductIdNotValid;
import com.capgemini.salesmanagement.exceptions.ProductPriceInvalidException;
import com.capgemini.salesmanagement.exceptions.ProductQuantityNotFound;

public interface ISaleService {
public HashMap<Integer, Sale>insertSalesDetails(Sale sale);
public boolean validateProductCode(int productId) throws ProductIdNotValid;
boolean validateQuantity(int qty)throws ProductQuantityNotFound;
public boolean validateProductCat(String prodCat) throws ProductCategoryNotValid;
public boolean validateProductName(String prodName)throws InvalidProductName;
public boolean validateProductPrice(float price)throws ProductPriceInvalidException;
}
