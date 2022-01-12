package eVaryansSystems.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eVaryansSystems.business.abstracts.UserService;
import eVaryansSystems.core.abstracts.AuthService;
import eVaryansSystems.dataAccess.abstracts.UserDao;
import eVaryansSystems.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private AuthService authService;
	
	public UserManager(UserDao userDao, AuthService authService) {
		
		this.userDao = userDao;
		this.authService = authService;
	}

	

	@Override
	public void register(User user) {
		if (user.getPassword().length() < 6){
            System.out.println("Parola en az 6 karakterden oluşmalıdır.");
        }
		
		final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        
        Matcher matcher = pattern.matcher(user.getEmail());
        if (!matcher.matches()){
        	
            System.out.println(user.getEmail()+" e-posta adresiniz, e-posta formatına uygun değildir.");
        }
        
        for(User users:userDao.getAll()){
        	
            if (users.getEmail().equals(user.getEmail())){
            	
                System.out.println(user.getEmail()+" e-posta adresiniz sistemde mevcuttur.");
            }
        }
        if (user.getfirstName().length()<2 && user.getlastName().length()<2){
        	
            System.out.println("Ad ve Soyad en az 2 karakterden oluşmalıdır.");
        }
		
	}

	@Override
	public void login(User user) {

		if(user.isVerify() == true) {
			
			userDao.login(user);
		}
		else {
			
			System.out.println(" Giriş işlemi başarısız mail adresinizi kontrol ediniz.");
		}
		
	}

	@Override
	public void confirm(User user) {
		
		if(user.isVerify() == true) {
			
			userDao.confirm(user);
			
			System.out.println(user.getEmail()+" email adresiniz doğrulanmıştır..");
		
		}else {
			
			System.out.println(user.getEmail()+" Lütfen email adresinizi doğrulayınız!");
		}
		
	}

	@Override
	public void registerWithAccount(User user) {
		
		user.setVerify(true);
		this.authService.register(user);
		
	}

	@Override
	public void loginWithAccount(User user) {
		
		if(user.isVerify() == true) {
			
			this.authService.login(user);
			
		}
		else {
			
			System.out.println("Lütfen kayıt olunuz!.");
		}
		
	}

}
