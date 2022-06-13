package DeepCopy;

public class Address implements Cloneable{
	private int no;
	private String street;
	private String city;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [no=" + no + ", street=" + street + ", city=" + city + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
	
}
