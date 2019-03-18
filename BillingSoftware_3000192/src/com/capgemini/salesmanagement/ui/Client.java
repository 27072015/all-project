package com.capgemini.salesmanagement.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.InvalidProductName;
import com.capgemini.salesmanagement.exceptions.ProductCategoryNotValid;
import com.capgemini.salesmanagement.exceptions.ProductIdNotValid;
import com.capgemini.salesmanagement.exceptions.ProductPriceInvalidException;
import com.capgemini.salesmanagement.exceptions.ProductQuantityNotFound;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;

public class Client {

	public static void main(String[] args) throws InvalidProductName {
		ISaleService services=new SaleService();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product Code");
		 int productId=sc.nextInt();
		try {
			services.validateProductCode(productId);
		} catch (ProductIdNotValid e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		System.out.println("Enter quantity");
		int qty=sc.nextInt();
		try {
			services.validateQuantity(qty);
		} catch (ProductQuantityNotFound e) {
			System.out.println(e.getMessage());
 
	}
	
	System.out.println("EnterCategory");
	String category=sc.next();
	try {
		services.validateProductCat(category);
	} catch (ProductCategoryNotValid e) {
			System.out.println(e.getMessage());
	}
	System.out.println("Enter product name");
	String productName=sc.next();
	services.validateProductName(productName);
	System.out.println("Enter  price");
	float price=sc.nextFloat();
	try {
		services.validateProductPrice(price);
	} catch (ProductPriceInvalidException e) {
		System.out.println(e.getMessage());
	}
	
		 
      Sale sale=new Sale(productId, "iphone", category, price, LocalDate.now(), qty, "SmartPhone");
      float lineTotal=sale.getProdCode()*sale.getQuantity();
      sale.setLineTotal(lineTotal);
      System.out.println("Details saved");
      System.out.println(services.insertSalesDetails(sale));
     
}

}
