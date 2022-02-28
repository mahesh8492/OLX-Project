package com.zensar.olx.bean;

public class OLXLoginUser {
		
	private String userName;
	private String password;
	public OLXLoginUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public OLXLoginUser() {
		super();
	}
	public OLXLoginUser(String userName) {
		super();
		this.userName = userName;
	}
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
	@Override
	public String toString() {
		return "OLXLoginUser [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
