package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer sedat =  new IndividualCustomer();
		sedat.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.Add(hepsiBurada);
		//customerManager.Add(sedat);
		
		Customer[] customers = {sedat, hepsiBurada};
		customerManager.addMultiple(customers);
	}

}
