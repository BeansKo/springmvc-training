package com.beans.ko.domain;

import java.io.Serializable;

public class UserVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private User user;
	private String gender;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "UserVo [user=" + user + ", gender=" + gender + "]";
	}
}
