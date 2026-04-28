package com.example.entity;

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

	public final int getId() {
		return id;
	}

	public final String getName() {
		return name;
	}

	public final int getPrice() {
		return price;
	}
}
