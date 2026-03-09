package com.codinghub.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	 @Column(name="p_id")
	private int id;
	
    @Column(name="p_price")
	private double price;
    
    
    @Column(name="p_name")
	private String name;
    
	@Column(name="availability_status")
	private String availabilityStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(String availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + ", availabilityStatus="
				+ availabilityStatus + "]";
	}
	
}