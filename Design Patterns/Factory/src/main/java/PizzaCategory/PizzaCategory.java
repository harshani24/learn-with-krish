package PizzaCategory;

import java.util.ArrayList;

import Ingredient.Ingredient;

public abstract class PizzaCategory {
    protected ArrayList<Ingredient>  ingredientsList = new ArrayList<>();
    
    public PizzaCategory() {
    	makePizza();
    }
	
	protected abstract void makePizza();
	
	@Override
	public String toString() {
		return "Dear Curstomer, Your Required Pizza has-> ["+ ingredientsList + "]";
	}
	
	
}
