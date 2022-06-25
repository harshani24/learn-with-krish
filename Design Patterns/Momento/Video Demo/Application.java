package MementoKirsh;

public class Application {

	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		Cart cart = new Cart();
		
		cart.addItem(new Item("book"));
		cart.addItem(new Item("pen"));
		
		careTaker.save(cart);
		System.out.println(cart);            //Cart [items=[Item [name=book], Item [name=pen]]]
		
		cart.addItem(new Item("pencil"));    
		careTaker.save(cart);
		System.out.println(cart);            //[Item [name=book], Item [name=pen], Item [name=pencil]
		
		cart.addItem(new Item("phone"));
		careTaker.save(cart);
		System.out.println(cart);			//[Item [name=book], Item [name=pen], Item [name=pencil], Item [name=phone]
		
		cart.addItem(new Item("notebook"));
		//careTaker.save(cart);
		System.out.println(cart);           //[Item [name=book], Item [name=pen], Item [name=pencil], Item [name=phone], Item [name=notebook]
		
		careTaker.revert(cart);
		System.out.println(cart);          //[Item [name=book], Item [name=pen], Item [name=pencil], Item [name=phone], Item [name=notebook]
		
		careTaker.revert(cart);
		System.out.println(cart);		   //[Item [name=book], Item [name=pen], Item [name=pencil], Item [name=phone]
		
		careTaker.revert(cart);
		System.out.println(cart);		  //[Item [name=book], Item [name=pen], Item [name=pencil]
		
		careTaker.revert(cart);
		System.out.println(cart);   //[Item [name=book], Item [name=pen]
		
		careTaker.revert(cart);
		System.out.println(cart);  //Cannot undo
		                             //Cart [items=[Item [name=book], Item [name=pen]]]
  
	}

}
