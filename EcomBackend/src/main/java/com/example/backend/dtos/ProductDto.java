package com.example.backend.dtos;

import com.example.backend.pojos.Product;

public class ProductDto {

	
	private String product_name;
	private double product_price;
	private Boolean stock;
	private int product_quantity;
	private Boolean live;
	private String product_imageName;
	private String product_desc;
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public Boolean getStock() {
		return stock;
	}
	public void setStock(Boolean stock) {
		this.stock = stock;
	}
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	public Boolean getLive() {
		return live;
	}
	public void setLive(Boolean live) {
		this.live = live;
	}
	public String getProduct_imageName() {
		return product_imageName;
	}
	public void setProduct_imageName(String product_imageName) {
		this.product_imageName = product_imageName;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	
	public ProductDto( String product_name, double product_price, Boolean stock, int product_quantity,
			Boolean live, String product_imageName, String product_desc) {
		super();
		
		this.product_name = product_name;
		this.product_price = product_price;
		this.stock = stock;
		this.product_quantity = product_quantity;
		this.live = live;
		this.product_imageName = product_imageName;
		this.product_desc = product_desc;
	}
	
	
	
	
	
	
	
	
	
	
}
