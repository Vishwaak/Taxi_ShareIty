package minewine.taxishareity;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {

	public static String toHash(String password){
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			System.out.println("No such Instance of Hash algorithm");
		}
		byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));

		BigInteger number = new BigInteger(1, hash);

		// Convert message digest into hex value
		StringBuilder hexString = new StringBuilder(number.toString(16));

		// Pad with leading zeros
		while (hexString.length() < 32)
		{
			hexString.insert(0, '0');
		}
		return hexString.toString();
	}
}
