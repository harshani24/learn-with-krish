package PizzaCategory;

import Ingredient.CheeseI;
import Ingredient.ChickenI;
import Ingredient.VegetableI;

public class ChickenPizza extends PizzaCategory {

	protected void makePizza() {
		ingredientsList.add(new VegetableI());
		ingredientsList.add(new ChickenI());
	}
}
