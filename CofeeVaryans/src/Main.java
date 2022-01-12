import java.rmi.RemoteException;

import Adapters.MernisServiceAdapter;
import Concrete.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args)  throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		//A�a��daki k�s�ma ger�ek bilgilerinizi girerek deneyebilirsiniz.
		customerManager.save(new Customer(1,"Sedat","�zt�rk",1999,"1999202221212"));

	}

}
