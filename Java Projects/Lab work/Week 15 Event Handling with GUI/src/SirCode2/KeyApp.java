package SirCode2;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyApp {

	JFrame jframe;
	JTextField jt1;
	JLabel jl1;
	
	public static void main(String[] args) {

		KeyApp app = new KeyApp();
		
	}
	
	public KeyApp()
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
		
		
		jt1.addKeyListener((KeyListener) new KeyEventHandlerr());

	}
	
	private class KeyEventHandlerr implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			jl1.setText("Pressing.....");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			jl1.setText("Presed");
		}

		@Override
		public void keyReleased(KeyEvent e) {
			jl1.setText("Released.........");
		}
	}
	
	

}
