package com.mapsa.exercise.seriesa.b;

public class MenuItemJafarian {

	private String item;
	private String type;
	private double price;

	public MenuItemJafarian(String item, String type, double price) {
		this.item = item;
		this.type = type;
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

}
