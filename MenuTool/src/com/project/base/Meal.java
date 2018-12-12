package com.project.base;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private String name = "";
	private float price = 0;
	private List<Ingredient> food;
	
	public Meal(String name, float price, int person, Ingredient[] food) {
		this.name = name;
		this.price = price;
		this.food = new ArrayList<Ingredient>();
		for(Ingredient i : food) {
			this.food.add(i);
		}
	}
	
	public void Show() {
		System.out.println(name + " : " + price + "€.");
		System.out.println("Composed of: ");
		for(Ingredient f: food)
			f.Show();
	}
	
}
/*for(int i = 0; i < this.food.length; i++) {
	this.food[i] = new Ingredient(food[i].getName(), food[i].getPrice(),person);
}*/