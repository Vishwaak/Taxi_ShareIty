package minewine.taxishareity.persistance.dbo;

import minewine.taxishareity.utils.UserType;

public class RegisterUserDBO {
	private LoginDBO loginData;

	private String email;
	private String name;
	private String surname;
	private String contactNo;
	private UserType userType;

	public LoginDBO getLoginData() {
		return loginData;
	}

	public void setLoginData(LoginDBO loginData) {
		this.loginData = loginData;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public RegisterUserDBO(String username,String password, String email, String name, String surname, String contactNo, UserType userType) {

		this.loginData = new LoginDBO(username,password);
		this.email = email;
		this.name = name;
		this.surname = surname;
		this.contactNo = contactNo;
		this.userType = userType;
	}
}
