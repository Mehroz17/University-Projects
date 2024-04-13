package SirCode2;

import SirCode2.KeyApp;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyAnonymousApp {

	JFrame jframe;
	JTextField jt1;
	JLabel jl1;
	
	public static void main(String[] args) {


		KeyApp app = new KeyApp();
		
	}
	
	public KeyAnonymousApp()
	{
		framee();
	}
	
	public void framee() {
		
	jframe = new JFrame("Key event");

		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setSize(300, 300);
		
		jt1 = new JTextField();
		jl1 = new JLabel();
		
		jl1.setText("Nothing happening..");
		
		jt1.setBounds(50, 50, 100, 35);
		jl1.setBounds(50, 200, 200, 50);
		
		jframe.add(jl1);
		jframe.add(jt1);
		
		//anonymously
		jt1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Typing...");

			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Key Pressed..");

			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Key Released..");

			}
			
		});

	}
	

}
