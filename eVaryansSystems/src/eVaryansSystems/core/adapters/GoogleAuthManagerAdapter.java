package eVaryansSystems.core.adapters;

import eVaryansSystems.core.abstracts.AuthService;
import eVaryansSystems.entities.concretes.User;
import eVaryansSystems.googleAccount.GoogleManager;

public class GoogleAuthManagerAdapter implements AuthService{
	  
	GoogleManager googleAuthManager; 
		
		public GoogleAuthManagerAdapter(GoogleManager googleAuthManager) {
		this.googleAuthManager = googleAuthManager;
	}

		@Override
		public void register(User user) {
			googleAuthManager.register(user);
		}

		@Override
		public void login(User user) {
			googleAuthManager.login(user);
			
		}

	}