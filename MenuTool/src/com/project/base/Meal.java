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
		if(food != null || !food.isEmpty()) {
			this.food = food;
			computePrice();
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
	
}
/*for(int i = 0; i < this.food.length; i++) {
	this.food[i] = new Ingredient(food[i].getName(), food[i].getPrice(),person);
}*/