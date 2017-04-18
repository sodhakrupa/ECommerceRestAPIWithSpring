package com.restapi.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



import com.restapi.model.Product;
import com.restapi.utils.HibernateUtil;

public class ProductService {

	
	private static SessionFactory factory = HibernateUtil.getSessionFactory(); 
	
	static{
		factory = HibernateUtil.getSessionFactory();
	}
	

	
	 public List<Product> fetchProducts(){
		 List<Product> productList = null;
		 
	      Session session = factory.openSession();
	      Transaction tx = null;
	     
	      try{
	         tx = session.beginTransaction();
	         productList = session.createQuery("FROM Product").list(); 
	         for (Product product : productList){
	          
	            System.out.print("Product Name: " + product.getProductName()); 
	            System.out.print("Description: " + product.getDescription()); 
	            System.out.println("Price: " + product.getPrice()); 
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
		 Product p = new Product();
		 p.setDescription("Test desc");
		 p.setId(1L);
		 p.setProductName("Test Product");
		 p.setPrice(2500);
		 productList = new ArrayList<Product>();
		 productList.add(p);
	      return productList;
	   }
	
}
