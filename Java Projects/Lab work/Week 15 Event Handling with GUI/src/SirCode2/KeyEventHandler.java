package SirCode2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventHandler implements KeyListener {

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

}
