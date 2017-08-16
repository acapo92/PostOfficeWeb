package model;

public class Client {
	
	int id;
	String name;
	String last_name;
	String username;
	String pass;
	int account;
	double balance;
	
	

	public Client(int id, String name, String last_name, String username, String pass, int account, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.username = username;
		this.pass = pass;
		this.account = account;
		this.balance = balance;
	}
	
	public Client() {
	
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
