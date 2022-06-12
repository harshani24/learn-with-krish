public class PermanentEmp  extends Employee{

	private boolean benifits;

	public boolean isBenifits() {
		return benifits;
	}

	public void setBenifits(boolean benifits) {
		this.benifits = benifits;
	}

	@Override
	public String toString() {
		return "PermanentEmp [benifits=" + benifits + ", ID=" + getId() + ", Name=" + getName()
				+ ", NumOfExp=" + getNumOfExp() + "]";
	}
	
	
}
