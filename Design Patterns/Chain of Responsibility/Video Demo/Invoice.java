package COFKrish;

public class Invoice {
	private int invoiceNumber;
	private double amount;
	private double tax;


	public Invoice(int invoiceNumber, double amount) {
		this.invoiceNumber = invoiceNumber;
		this.amount = amount;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	public int getInvoiceNumber() {
		return invoiceNumber;
	}


	public double getAmount() {
		return amount;
	}


	public double getTax() {
		return tax;
	}	
}
