package com.project.base;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private String name = "";
	private float price = 0;		//sum of prices 
	private float unitPrice = 0; 	//price for 1 service
	private List<Ingredient> food;
	
	public Meal(String name, List<Ingredient> food) {
		this.name = name;
		this.food = new ArrayList<Ingredient>();
		if(food != null) {
			if(!food.isEmpty()) {
				this.food = food;
				computePrice();
			}
			else {
				System.out.println("No available food list for this meal");
			}
		}
	}
	
	private void computePrice() {
		for(Ingredient i : food) {
			price += i.getPrice();
			unitPrice += i.getUnitPrice();
		}
	}
	
	public void Show() {
		System.out.println(name + " : " + price + "€. Unit Cost: " + unitPrice + "€.");
		System.out.println("Composed of: ");
		for(Ingredient f: food)
			f.Show();
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

	public List<Ingredient> getFood() {
		return food;
	}

	public void setFood(List<Ingredient> food) {
		this.food = food;
	}
	
}
/*for(int i = 0; i < this.food.length; i++) {
	this.food[i] = new Ingredient(food[i].getName(), food[i].getPrice(),person);
}*/