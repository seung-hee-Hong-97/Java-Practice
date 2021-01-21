package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> generic1= new GenericPrinter<Powder>();
		Powder powder= new Powder();
		generic1.setMaterial(powder);
		System.out.println(generic1);
		
		GenericPrinter<Plastic> generic2= new GenericPrinter<Plastic>();
		Plastic plastic= new Plastic();
		generic2.setMaterial(plastic);
		System.out.println(generic2);
		
		powder.doPrinting();
		plastic.doPrinting();
		
		
	}

}
