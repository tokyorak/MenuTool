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
		List<Ingredient> food = new ArrayList<Ingredient>();
		Ingredient[] is = {};//à compléter
	}
}
