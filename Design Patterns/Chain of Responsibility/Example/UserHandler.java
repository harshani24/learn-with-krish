package ChainOfResponsibilty;

import java.util.ArrayList;

public abstract class UserHandler {	
	
	//You need to have successor, it is the one who say what is the next
	protected UserHandler successor;

	public void setSuccessor(UserHandler successor) {
		this.successor = successor;
	}
	
	
	//You need to have a method to handle request
	public abstract ArrayList<String> applyPrivilege(User user);
	
}
