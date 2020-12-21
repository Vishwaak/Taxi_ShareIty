package otros;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class EncryptPassword {

	public static void main(String[] args) throws NoSuchAlgorithmException{
		String passwordToHash = "pass";
		byte[] salt = getSalt();
		String securePassword = sha512(passwordToHash, salt);
		System.out.print(securePassword);
	}
	
	private static String sha512(String passwordToHash, byte[] salt) {
		String genPass = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(salt);
			byte[] bytes = md.digest(passwordToHash.getBytes());
			StringBuilder strB = new StringBuilder();
			for (int i=0; i<bytes.length; i++) {
				strB.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			genPass = strB.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return genPass;
		
	}

	private static byte[] getSalt() throws NoSuchAlgorithmException{
		SecureRandom sec = SecureRandom.getInstance("SHA1PRNG");
		byte [] salt = new byte[16];
		sec.nextBytes(salt);
		return salt;
	}

}
