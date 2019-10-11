package minewine.taxishareity.persistance.repository;

import minewine.taxishareity.persistance.dbo.LoginDBO;
import minewine.taxishareity.persistance.dbo.RegisterUserDBO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author andrea.esposito
 *
 *
 * Login repository class contains all the persistance logic of the application related to the login operations.
 */
//TODO i suggest to encrypt the password and store the encrypted password in the DB.
public class LoginRepository extends  AbstractRepository {
	public Boolean login(final LoginDBO loginData) throws Exception {
		try{
			final Connection conn = getConnection();
			final String query = "SELECT password FROM users  where username = ? and password = ?;";
			final PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, loginData.getUsername());
			statement.setString(2, loginData.getPassword());
			final ResultSet resultSet = statement.executeQuery();                        
			if(resultSet.first()){

				final String pw = resultSet.getString("password");
                                System.out.print("Hello2");
                                System.out.print(pw);
				if(pw.equals(loginData.getPassword())) return Boolean.TRUE;
			}
		}
		catch(Exception e){

			//i suggest to log the exception and return a message
			throw new Exception("Error during login");

		}
		return Boolean.FALSE;

	}


	public Boolean registerUser(final RegisterUserDBO userData) throws Exception {

		throw new Exception("Not yet implemented");
	}






}
