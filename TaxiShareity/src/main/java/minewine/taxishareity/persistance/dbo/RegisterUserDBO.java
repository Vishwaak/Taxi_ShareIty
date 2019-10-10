package minewine.taxishareity.persistance.dbo;

public class RegisterUserDBO {
	private LoginDBO loginData;

	private String email;
	private String name;
	private String surname;

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
}
