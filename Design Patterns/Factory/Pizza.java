import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		
		boolean order = true;
		
		System.out.println("----Welcome to Pizza Hut----");
		
		do {
			System.out.println("\n\nPlease Enter the Pizza Type[1.Vegetable , 2.Chicken, 3.Cheese]");
			
			Scanner sc = new Scanner(System.in);
			int type = sc.nextInt();
			
			switch(type) {
			case 1:
				System.out.println(PizzaFactory.orderPizza(PizzaCode.VEG)); 
				break;
			case 2:
				System.out.println(PizzaFactory.orderPizza(PizzaCode.CHICKEN));
				break;
			case 3:
				System.out.println(PizzaFactory.orderPizza(PizzaCode.CHEESY));
				break;
			default:
				System.out.println("!!!Please enter valid order type");
				
			}
			
			
			System.out.println("Do you want to make another order [1.Yes , 2.No]");
			
			Scanner sc1 = new Scanner(System.in);
			int status = sc1.nextInt();
			
			if(status == 1) {
				order = true;
			}
			else if(status == 2) {
				order = false;
			}
			else {
				System.out.println("Please input the valid value");
			}
			
		}while(order == true);
		

	}

}
