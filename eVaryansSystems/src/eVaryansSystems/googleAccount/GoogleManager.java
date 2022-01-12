package eVaryansSystems.googleAccount;

import eVaryansSystems.entities.concretes.User;

public class GoogleManager {
	
	public void register(User user) {
		System.out.println(user.getfirstName()+" "+user.getlastName()+" siteye kaydoldunuz.");
	}
	public void login(User user) {
		System.out.println(user.getfirstName()+" "+user.getlastName()+" siteye giriþ yaptýnýz.");
	}

}
