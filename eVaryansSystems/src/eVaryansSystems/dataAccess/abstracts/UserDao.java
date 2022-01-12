package eVaryansSystems.dataAccess.abstracts;

import java.util.List;

import eVaryansSystems.entities.concretes.User;

public interface UserDao {
	
	void register(User user);
	void login(User user);
	void delete(User user);
	void update(User user);
	void confirm(User user);
	List<User> getAll();
	
	
}