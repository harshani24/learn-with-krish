package ChainOfResponsibilty;

import java.util.ArrayList;

public class Visitor extends UserHandler {

	private ArrayList<String>  priviledges = new ArrayList<>();
	
	@Override
	public ArrayList<String> applyPrivilege(User user) {
		
		priviledges.addAll(user.getPriviledgeList());
		priviledges.add("Create Profile");

		
		user.setPriviledgeList(priviledges);
		
		System.out.println("visitor phase");
		
		if(user.getType().equals("Visitor")){
			return user.getPriviledgeList();
		}
		
		return successor.applyPrivilege(user);

	}

}
