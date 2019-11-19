package co.grandcircus.GrandCircusCoffee.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

//This annotation makes this a Singleton Spring bean.
//This class is an alternative to a database for this program.

@Component
public class UserService {

	private List<User> users = new ArrayList<>();
	
	public UserService() {
		users.add(new User("Sean","Buck","srbuck1111@gmail.com","2482252238","noThanks"));
		users.add(new User("Matt","Lynn","mvlynn6969@gmail.com","2482262238","noThanks"));
		users.add(new User("Phil","Phil","ppphil0420@gmail.com","2482272238","noThanks"));
	}
	
	public List<User> getAllUsers() {
		return users;
	}
	
	public void addUser(User u) {
		users.add(u);
	}
	
	public boolean loginSuccessful(String email, String pass) {
		User loggingUser = null;
		for (User u : users) {
			if (u.getEmail().equals(email)) {
				loggingUser = u;
				break;
			}
		}
		if (pass.equals(loggingUser.getPass())) {
			return true;
		}
		return false;
	}
	
	public User getUserByEmail(String email) {
		for (User u : users) {
			if (u.getEmail().equals(email)) {
				return u;
			}
		}
		return null;
	}
	
}
