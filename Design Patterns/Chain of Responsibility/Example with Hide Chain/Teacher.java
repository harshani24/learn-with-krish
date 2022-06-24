package ChainOfResponsibilty;

import java.util.ArrayList;

public class Teacher extends UserHandler {

	private ArrayList<String>  priviledges = new ArrayList<>();
	
	@Override
	public  ArrayList<String> applyPrivilege(User user) {
		
		priviledges.addAll(user.getPriviledgeList());
		priviledges.add("Manage Contents");

		user.setPriviledgeList(priviledges);
		
		System.out.println("add teacher priviledges");
		
		if(user.getType().equals("Teacher")  ){
			return user.getPriviledgeList();
		}

		return successor.applyPrivilege(user);
	
	}
}
