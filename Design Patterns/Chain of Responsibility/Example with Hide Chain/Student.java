package ChainOfResponsibilty;

import java.util.ArrayList;

public class Student extends UserHandler {

	private ArrayList<String>  priviledges = new ArrayList<>();
	
	@Override
	public ArrayList<String> applyPrivilege(User user) {
		
		priviledges.addAll(user.getPriviledgeList());
		priviledges.add("Update Profile");
		priviledges.add("See Contents");
		
		user.setPriviledgeList(priviledges);
		
		System.out.println("add student priviledges");
		
		if(user.getType().equals("Student")){
			return user.getPriviledgeList();
		}
		
		return successor.applyPrivilege(user);
	}

}
