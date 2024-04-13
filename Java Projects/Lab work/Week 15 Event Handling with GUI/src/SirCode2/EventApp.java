package SirCode2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventApp {

	public static void main(String[] args) {
		
		//2. using inner class
		
		EventApp app = new EventApp();
		EventApp.BEventHandlerr Obj = app.new BEventHandlerr(); 
		
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
		jb1.addActionListener(Obj);
		jb2.addActionListener(Obj);
		
	}
	
	private class BEventHandlerr implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String val = e.getActionCommand();
			if (val.equals("L1")) {
				System.out.println("Login button is clicked.");
			}
			if (val.equals("R2")) {
				System.out.println("Register button is clicked.");
			}
			
		}
		
	}
}
