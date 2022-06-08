package SingletonExample;

public class CountryPeople {

	public static void main(String[] args) {

		Country country = Country.getCountry();
		System.out.println(country);     //SingletonExample.Country@5e91993f
		country.getStatus();
		System.out.println(country.getGovernment()); //SingletonExample.Government@379619aa
		country.getStatus();
		
		
		System.out.println("=========================================================================================");
		Country country1 = Country.getCountry();
		System.out.println(country1);     //SingletonExample.Country@5e91993f
		country.getStatus();
		System.out.println(country1.getGovernment()); //SingletonExample.Government@379619aa
		country.getStatus();



	}

}
