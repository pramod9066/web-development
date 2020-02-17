package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3868269731826822792L;

	@Id
	@Column(name = "")
	private int userId;
	@Column(name = "")
	private String userName;
	@Column(name = "")
	private String dob;
	@Column(name = "")
	private String gender;
	@Column(name = "")
	private String emailId;
	@Column(name = "")
	private long phoneNumber;
	@Column(name = "")
	private String country;

	public User() {
	}

	public User(String userName, String dob, String gender, String emailId, long phoneNumber, String country) {
		super();
		this.userName = userName;
		this.dob = dob;
		this.gender = gender;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.country = country;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", dob=" + dob + ", gender=" + gender
				+ ", emailId=" + emailId + ", phoneNumber=" + phoneNumber + ", country=" + country + "]";
	}

}
