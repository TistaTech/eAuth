package net.serenity.bdd.junit.cucumber.model;

public class ComposeData {

	private String userName;
	private String password;
	private String toAddress;
	private String subject;
	private String body;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToAddress() {
		return toAddress;
	}
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	public void setAll(String userName, String password, String toAddress, String subject, String body) {
		this.userName = userName;
		this.password = password;
		this.toAddress = toAddress;
		this.subject = subject;
		this.body = body;
	}
	
	
	
}
