package com.example.backend.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long product_id;
	private String product_name;
	private double product_price;
	private Boolean stock;
	private int product_quantity;
	private Boolean live;
	private String product_imageName;
	private String product_desc;
	
	
	public Product() {
		super();
	}
	
	
	
	
	public Product( String product_name, double product_price, Boolean stock, int product_quantity,
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




	public Product(long product_id, String product_name, double product_price, Boolean stock, int product_quantity,
			Boolean live, String product_imageName, String product_desc) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.stock = stock;
		this.product_quantity = product_quantity;
		this.live = live;
		this.product_imageName = product_imageName;
		this.product_desc = product_desc;
	}




	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
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
	public Boolean isStock() {
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
	public Boolean isLive() {
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




	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", stock=" + stock + ", product_quantity=" + product_quantity + ", live=" + live
				+ ", product_imageName=" + product_imageName + ", product_desc=" + product_desc + "]";
	}
	
	
	
	
}
