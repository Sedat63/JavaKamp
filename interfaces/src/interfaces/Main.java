package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new EmailLogger(), new SmsLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer sedat = new Customer(1,"Sedat","Öztürk");
		customerManager.add(sedat);

	}

}
