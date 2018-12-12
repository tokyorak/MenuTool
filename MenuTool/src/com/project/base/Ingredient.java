package com.project.base;

public class Ingredient {
	private String name = "";
	private float price = 0; //price in EUR
	private float unitPrice = 0; //price for 1 or 2 person
	private int person = 1;
	
	public Ingredient(String name, float price, int person) {
		this.name = name;
		this.price = price;
		this.person = person;
		this.unitPrice = price / (float)person;
	}
	
	public void Show() {
		System.out.println(name + " : " + price + "€. Unit cost: " + unitPrice + "€.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}
}
