package com.project.base;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		test2();
	}

	public static void test1() {
		// TODO Auto-generated method stub
		Ingredient i = new Ingredient("Banana", 5.0f, 2);
		i.Show();
		Ingredient[] is;
		is = new Ingredient[5];
		for (Ingredient a : is) {
			a = new Ingredient(i.getName(), i.getPrice(), 2);
			a.Show();
		}
	}
	
	public static void test2() {
		List<Ingredient> compo = new ArrayList<Ingredient>();
		compo.add(new Ingredient("Apple", (float)2, 1));
		compo.add(new Ingredient("Pineapple", (float)5.1, 2));
		compo.add(new Ingredient("Banana", (float)5.0, 2));
		
		Meal m = new Meal("Salade de fruit", compo);
		m.Show();
	}
}
