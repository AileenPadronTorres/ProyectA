package aplicacion;

public class User {
	
	private String name;
	private String password;

	public User(String name, String password) {
		setName(name);
		setPassword(password);
	}
	
	public String getName() {return this.name;}
	
	public void setName(String name) {this.name = name;}
	
	public String getPassword() {return this.password;}
	
	public void setPassword(String password) {
		if (password.length() < 6) { System.out.println("The password cant be shorter than 6 characters");}
		else if (!password.contains("[0-9]")) { System.out.println("The password needs to have a number");}
		else {this.password = password;}
	}
	
}
