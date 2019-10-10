package minewine.taxishareity.persistance.dbo;

import minewine.taxishareity.Encrypt;

/**
 * @author andrea.esposito
 *
 *
 * This class is used as wrapper for login data
 */
public class LoginDBO {
	private String username;
	private String password;

	public LoginDBO(final String username, final String password){
		this.username = username;
		this.password = Encrypt.toHash(password);

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = Encrypt.toHash(password);
	}
}
