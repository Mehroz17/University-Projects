package SirCode2;
//Button Listner in separate class

import javax.swing.*;

public class SepareteClass {

	public static void main(String[] args) {

		JFrame jframe = new JFrame("Button click event");

		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setSize(300, 300);
		
		JButton jb1 = new JButton("Login");
		JButton jb2 = new JButton("Register");
		
		jb1.setBounds(50, 50, 100, 25);
		jb2.setBounds(150, 50, 100, 25);
		jframe.add(jb1);
		jframe.add(jb2);
		
		jb1.setActionCommand("L1");
		jb2.setActionCommand("R2");
		
		//fire an event, information regarding event is stored in an object, component is identified by its text
		jb1.addActionListener(new separeteclassforbuttonclick());
		jb2.addActionListener(new separeteclassforbuttonclick());
		
	}

}
