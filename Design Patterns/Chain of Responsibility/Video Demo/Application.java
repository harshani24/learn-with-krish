package COFKrish;

public class Application {

	public static void main(String[] args) {
		VAT vat = new VAT();
		NBT nbt = new NBT();
		BTT bbt = new BTT();
		SSF ssf = new SSF();
		Tax tax = new Tax();
		
		tax.setSuccessor(vat);
		vat.setSuccessor(nbt);
		nbt.setSuccessor(bbt);
		bbt.setSuccessor(ssf);

		
		Invoice invoice1 = new Invoice(1,50);
		System.out.println(tax.applyTax(invoice1));
		System.out.println("----------------------------------------");
		
		Invoice invoice2 = new Invoice(2,150);
		System.out.println(tax.applyTax(invoice2));
		System.out.println("----------------------------------------");
		
		Invoice invoice3 = new Invoice(3,250);
		System.out.println(tax.applyTax(invoice3));
		System.out.println("----------------------------------------");
		
		Invoice invoice4 = new Invoice(4,350);
		System.out.println(tax.applyTax(invoice4));

	}

}
