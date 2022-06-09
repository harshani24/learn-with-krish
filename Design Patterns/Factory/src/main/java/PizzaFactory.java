import PizzaCategory.CheesyPizza;
import PizzaCategory.ChickenPizza;
import PizzaCategory.PizzaCategory;
import PizzaCategory.VeggiePizza;

public class PizzaFactory {
	
	public static PizzaCategory orderPizza(PizzaCode pCode) {
		
		switch(pCode) {
		case VEG:
			return new VeggiePizza();
		case CHICKEN:
			return new ChickenPizza();
		case CHEESY:
			return new CheesyPizza();
		default:
			return null;	
		}
	}
}
