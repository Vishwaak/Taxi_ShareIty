package minewine.taxishareity.persistance.dbo;

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
		//Here i suggest to crypt the password
		this.password = password;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	//TODO i suggest to implements in this methods something to crypt and decrypt the password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
