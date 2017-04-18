package com.restapi.model;

import java.io.Serializable;

public class Product implements Serializable {

	private Long id;
	private String productName;
	private double price;
	private String description;
	private String imageURL;
	/*private Date lastModifiedAt;
	
	@JsonSerialize(using=DateSerializer.class)
	public Date getLastModifiedAt() {
		return lastModifiedAt;
	}
	
	public void setLastModifiedAt(Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
}
