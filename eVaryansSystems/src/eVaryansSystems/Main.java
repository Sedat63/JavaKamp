package eVaryansSystems;

import eVaryansSystems.business.abstracts.UserService;
import eVaryansSystems.business.concretes.UserManager;
import eVaryansSystems.core.adapters.GoogleAuthManagerAdapter;
import eVaryansSystems.dataAccess.concretes.HibernateUserDao;
import eVaryansSystems.entities.concretes.User;
import eVaryansSystems.googleAccount.GoogleManager;

public class Main {

	public static void main(String[] args) {
		
UserService userService = new UserManager(new HibernateUserDao(),
		new GoogleAuthManagerAdapter(new GoogleManager()));
		
		User user = new User("Sedat","Öztürk","sedatozturk63@yandex.com","12345",true);
		User user2 = new User("Melis","Zengin","melis@gmail.com","6543",false);
	
		userService.register(user);
		userService.login(user);
		userService.confirm(user);
		userService.registerWithAccount(user);
		userService.loginWithAccount(user);
		
		userService.register(user2);
		userService.login(user2);
		userService.confirm(user2);
		userService.registerWithAccount(user2);
		userService.loginWithAccount(user2);

	}

}
