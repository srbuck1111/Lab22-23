package co.grandcircus.GrandCircusCoffee.model;

public class User {

	private String firstName = null;
	private String lastName = null;
	private String email = null;
	private String num = null;
	private String pass = null;
	
	public User(String firstName, String lastName, String email, String num, String pass) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.num = num;
		this.pass = pass;
	}
	
	public User() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ", " + email + ", " + num;
	}
	
}
