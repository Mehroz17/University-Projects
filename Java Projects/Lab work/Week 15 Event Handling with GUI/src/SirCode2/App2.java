package SirCode2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
//Button Evnet
public class App2 implements ActionListener{

	JTextField jt1 = new JTextField();
	
	public static void main(String[] args) {
		App2 app = new App2();
	}
	
	public App2() {
		JFrame jframe = new JFrame("Button click event");

		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setSize(300, 300);
		
		JButton jb1 = new JButton("Login");
		JButton jb2 = new JButton("Register");
			
		jb1.setBounds(50, 50, 100, 25);
		jb2.setBounds(150, 50, 100, 25);
		jt1.setBounds(85, 80, 100, 20);
		
		jframe.add(jb1);
		jframe.add(jb2);
		jframe.add(jt1);
		
		jb1.setActionCommand("L1");
		jb2.setActionCommand("R2");
		
		//fire an event, information regarding event is stored in an object, component is identified by its text
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String val = e.getActionCommand();
		if (val.equals("L1")) {
			jt1.setText("Login");
			System.out.println("Login button is clicked.");
		}
		if (val.equals("R2")) {
			jt1.setText("Register");
			System.out.println("Register button is clicked.");
		}
		
	}

}
