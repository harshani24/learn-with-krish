package SingletonExample;

public class Country {
	
	private static volatile Country country;
	private static volatile Government government;
	
	private Country() {
		if(country != null) {
			throw new RuntimeException("Plz go to getCountry method");
		}
	}
	
	
	public static Country getCountry() {
		
		if(country ==null) {
			
			synchronized(Country.class) {
				if(country == null) {
					country = new Country();
				}
			}
		}
		
		return country;
	}
	
	
	public Government getGovernment() {
		if(government ==null) {
			
			synchronized(Government.class) {
				if(government == null) {
					government = new Government();
				}
			}
		}
		
		return government;
	}
	
	public void getStatus() {
		if(government!= null) {
			System.out.println("***Now, you are a valid person!***");
		}
		else{
			System.out.println("***Please catch your government***");
		}
	}
	
	

}
