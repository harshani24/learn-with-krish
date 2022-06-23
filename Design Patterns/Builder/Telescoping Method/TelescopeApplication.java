package Builder;

public class TelescopeApplication {

	public static void main(String[] args) {
		
		StudentTelescope1 s1 = new StudentTelescope1("1");
		System.out.println(s1);  //StudentTelescope1 [id=1, name=null, degree=null]
		
		StudentTelescope2 s2 = new StudentTelescope2("2", "Sachini");
		System.out.println(s2);  //StudentTelescope1 [id=2, name=Sachini, degree=null]
	}

}
