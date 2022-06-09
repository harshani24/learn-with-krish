package PizzaCategory;

import Ingredient.VegetableI;

public class VeggiePizza extends PizzaCategory {

	protected void makePizza() {
		ingredientsList.add(new VegetableI());
	}
}
