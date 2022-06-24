package ChainOfResponsibilty;

import java.util.ArrayList;

public class Admin extends UserHandler {

	private ArrayList<String>  priviledges = new ArrayList<>();
	
	@Override
	public  ArrayList<String> applyPrivilege(User user) {
		
			priviledges.addAll(user.getPriviledgeList());
			priviledges.add("Manage Users");
			
			user.setPriviledgeList(priviledges);
			
			System.out.println("add admin priviledges");
			
			return user.getPriviledgeList();
	}
}

