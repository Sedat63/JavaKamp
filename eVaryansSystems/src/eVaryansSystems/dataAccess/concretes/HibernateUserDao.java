package eVaryansSystems.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eVaryansSystems.dataAccess.abstracts.UserDao;
import eVaryansSystems.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> users=new ArrayList<User>();

	@Override
	public void register(User user) {
		System.out.println(user.getfirstName()+" isimli kullanıcı hibernate ile sisteme kaydoldu");
		users.add(user);
	}

	@Override
	public void login(User user) {
		System.out.println(user.getfirstName()+" isimli kullanıcı hibernate ile giriş yaptı.");
		
	}

	@Override
	public void confirm(User user) {
		System.out.println(user.getEmail()+" email adresininz hibernate ile onaylanmıştır.");
		user.setVerify(true);
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getfirstName()+user.getlastName()+" isimli kullanıcı silindi ");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getfirstName()+user.getlastName()+" isimli kullanıcı güncellendi ");
		
	}

	@Override
	public List<User> getAll() {
	
		return this.users;
	}

	

	
		
	}