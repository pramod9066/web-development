package com.example.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5043259222675523449L;

	private String userName;
	private String dob;
	private String gender;
	private String emailId;
	private long phoneNumber;
	private String country;

	public UserDTO() {
	}

	public UserDTO(String userName, String dob, String gender, String emailId, long phoneNumber, String country) {
		super();
		this.userName = userName;
		this.dob = dob;
		this.gender = gender;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.country = country;
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
		return "UserDTO [userName=" + userName + ", dob=" + dob + ", gender=" + gender + ", emailId=" + emailId
				+ ", phoneNumber=" + phoneNumber + ", country=" + country + "]";
	}

}
