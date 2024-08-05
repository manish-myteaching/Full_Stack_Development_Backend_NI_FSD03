package com.barclays.dto;

public class UserInfoDTO {

	private String firstName;
	private String lastName;
	private String contactNo;
	private String gender;
	private String cityName;

	private String userName;
	private String password;

	public UserInfoDTO(String firstName, String lastName, String contactNo, String gender, String cityName,
			String userName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.gender = gender;
		this.cityName = cityName;
		this.userName = userName;
		this.password = password;
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
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
		return "UserInfo [firstName=" + firstName + ", lastName=" + lastName + ", contactNo=" + contactNo + ", gender="
				+ gender + ", cityName=" + cityName + ", userName=" + userName + ", password=" + password + "]";
	}

}
