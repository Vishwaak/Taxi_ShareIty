import java.awt.*;
import javax.swing.*;

public class login_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame layer1 = new JFrame();
		JButton b1 = new JButton("Login");
		JTextField Username = new JTextField();
		JTextField password = new JTextField();
		b1.setBounds(130, 100,100,40);
		Username.setBounds(10, 10, 20, 20);
		password.setBounds(60,80,20,20);
		layer1.add(Username);
		layer1.add(password);
		layer1.add(b1);
		layer1.setSize(400,500);
		layer1.setLayout(null);
		layer1.setVisible(true);

	}

}
