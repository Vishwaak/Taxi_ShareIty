package minewine.taxishareity.persistance.repository;

import com.mysql.cj.util.StringUtils;
import minewine.taxishareity.persistance.dbo.LoginDBO;
import minewine.taxishareity.persistance.dbo.RegisterUserDBO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;

/**
 * @author andrea.esposito
 *
 *
 * Login repository class contains all the persistance logic of the application
 * related to the login operations.
 */
//TODO i suggest to encrypt the password and store the encrypted password in the DB.
public class LoginRepository extends AbstractRepository {

    public Boolean login(final LoginDBO loginData) throws Exception {
        try {
            final Connection conn = getConnection();
            final String query = "SELECT password FROM users  where username = ? and password = ?;";
            final PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, loginData.getUsername());
            statement.setString(2, loginData.getPassword());
            final ResultSet resultSet = statement.executeQuery();
            if (resultSet.first()) {
                final String pw = resultSet.getString("password");
                if (pw.equals(loginData.getPassword())) {
                    return Boolean.TRUE;
                }
            }
        }catch(Exception e) {

			//i suggest to log the exception and return a message
			throw new Exception("Error during login");

		}
            return Boolean.FALSE;

        }

	

    public Boolean registerUser(final RegisterUserDBO userData) throws Exception {
        if (!checkRegistrationNotEmpty(userData)) {
            throw new Exception();
        }
        try {
            final Connection conn = getConnection();
            final String query = "insert into users(username, email, password,name,contact_no, user_type) values (?,?,?,?,?,?)";
            final PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, userData.getLoginData().getUsername());
            statement.setString(2, userData.getEmail());
            statement.setString(3, userData.getLoginData().getPassword());
            statement.setString(4, userData.getName());
            statement.setString(5, userData.getContactNo());
            statement.setString(6, userData.getUserType());
            return statement.execute();
        } catch (Exception e) {
            throw new Exception("Error during registration");
        }
    }

    private Boolean checkRegistrationNotEmpty(final RegisterUserDBO registerUserDBO) {
        if (StringUtils.isNullOrEmpty(registerUserDBO.getLoginData().getUsername()) || StringUtils.isNullOrEmpty(registerUserDBO.getLoginData().getPassword())
                || StringUtils.isNullOrEmpty(registerUserDBO.getEmail()) || StringUtils.isNullOrEmpty(registerUserDBO.getName())
                || StringUtils.isNullOrEmpty(registerUserDBO.getContactNo()) || StringUtils
                .isNullOrEmpty(registerUserDBO.getUserType())) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;

    }

}
