package minewine.taxishareity.persistance.repository;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author andrea.esposito
 *
 *
 * This is an abstract configuration class used to connect to the database
 */
public abstract class AbstractRepository {

	private Connection connection = null;

	public Connection getConnection() throws Exception {

		final String URL = "jdbc:mysql://127.0.0.1:3306/taxi_sharelty";
		final String USERNAME="root";
		final String PASSWORD="yourPassword";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		final String driver="";
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			throw new Exception("Unable to get Connection");
		}
		return connection;
	}

	public void closeConnection() throws Exception {
		if(connection !=  null) try {
			connection.close();
		} catch (Exception e) {
			throw new Exception("Unable to close Connection");

		}

	}


}
