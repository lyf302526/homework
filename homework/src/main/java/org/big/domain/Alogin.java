package org.big.domain;

import java.io.Serializable;

public class Alogin implements Serializable{
	private int id;
	private String loginname;
	private String password;
	public Alogin(){
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Alogin [id="+id+",loginname="+loginname+",password="+password+"]";
	}
}
