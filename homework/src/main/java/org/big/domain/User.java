package org.big.domain;

import java.io.Serializable;

public class User implements Serializable {
	private Integer user_id;			// id
	private String loginname;	// 登录名
	private String password;	// 密码
	private String address;
	private String phone;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", loginname=" + loginname + ", password="
				+ password + ",address="+address+",phone="+phone+"]";
	}
}
