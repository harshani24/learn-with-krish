package MementoKirsh;

import java.util.Stack;

public class CareTaker {
	//This is the person who whole the previous state of object
	//If you want to rollback the previous state, thet means you want to get last in thing first out
	//So, we need to have a Stack
	
    //1.Stack to keep histroy
	Stack<Cart.CartMemento> history = new Stack<>();
	
	//2.using CareTaker, we can call and say this method to save our items to CareTaker
	public void save(Cart cart) {
		history.push(cart.save());
	}
	
	
	//3.this is method to revert things in the care taker
	public void revert(Cart cart) {
		if(!history.isEmpty())
			cart.revert(history.pop());
		else
			System.out.println("Cannot undo");
	}

}
