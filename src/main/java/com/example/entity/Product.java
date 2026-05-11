package com.example.entity;

import lombok.Data;

@Data
public class Product {
	/**
	 * @param id
	 * @param name
	 * @param price
	 */
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	private int id;
	private String name;
	private int price;
}
