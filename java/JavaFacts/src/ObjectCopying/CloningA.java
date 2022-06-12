package ObjectCopying;

//Java all classes extends "Object" by default.
//2.Java by default, we are not allowing to create clone, to get permission u need implements "Cloneable Interface"
public class CloningA implements Cloneable{
    private int i;
	private int j;

	
	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public int getJ() {
		return j;
	}


	public void setJ(int j) {
		this.j = j;
	}


	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}
	
	
	//1.This is the method we want to override from Object class to get a clone
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
