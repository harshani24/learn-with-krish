package MementoKirsh;

public class Application {

	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		Cart cart = new Cart();
		
		cart.addItem(new Item("book"));
		cart.addItem(new Item("pen"));
		System.out.println(cart);         //Cart [items=[Item [name=book], Item [name=pen]]]
		System.out.println(careTaker);    //CareTaker [history=[]]
		
		careTaker.save(cart);
		System.out.println(cart);            //Cart [items=[Item [name=book], Item [name=pen]]]
		System.out.println(careTaker);       //1->CareTaker [history=[
		                                     //1]CartMemento [items=[Item [name=book], Item [name=pen]]]]]
		
		cart.addItem(new Item("pencil"));    
		careTaker.save(cart);
		System.out.println(cart);            //[Item [name=book], Item [name=pen], Item [name=pencil]
		System.out.println(careTaker);       //2->CareTaker [history=[
		                                     //1]CartMemento [items=[Item [name=book], Item [name=pen]]], 
		                                     //2]CartMemento [items=[Item [name=book], Item [name=pen], Item [name=pencil]]]]]
		
		cart.addItem(new Item("phone"));
		careTaker.save(cart);
		System.out.println(cart);			//[Item [name=book], Item [name=pen], Item [name=pencil], Item [name=phone]
		System.out.println(careTaker);      //3->CareTaker [history=[
                                            //1]CartMemento [items=[Item [name=book], Item [name=pen]]], 
                                            //2]CartMemento [items=[Item [name=book], Item [name=pen], Item [name=pencil]]]
										    //3] CartMemento [items=[Item [name=book], Item [name=pen], Item [name=pencil], Item [name=phone]]]	
		
		careTaker.revert(cart);
		System.out.println(cart);          //[Item [name=book], Item [name=pen], Item [name=pencil], Item [name=phone]]]
		System.out.println(careTaker);     //2->CareTaker [history=[
                                           //1]CartMemento [items=[Item [name=book], Item [name=pen]]], 
                                           //2]CartMemento [items=[Item [name=book], Item [name=pen], Item [name=pencil]]]]]
		
		careTaker.revert(cart);
		System.out.println(cart);		   //[Item [name=book], Item [name=pen], Item [name=pencil]]]
		System.out.println(careTaker);     //1->CareTaker [history=[
                                           //1]CartMemento [items=[Item [name=book], Item [name=pen]]]]]
		
		careTaker.revert(cart);
		System.out.println(cart);		  //[Item [name=book], Item [name=pen]]]
		System.out.println(careTaker);    //CareTaker [history=[]]
		
		careTaker.revert(cart);
		System.out.println(cart);   //Cannot undo
									//Cart [items=[Item [name=book], Item [name=pen]]]
		System.out.println(careTaker);//CareTaker [history=[]]
		
	}

}
