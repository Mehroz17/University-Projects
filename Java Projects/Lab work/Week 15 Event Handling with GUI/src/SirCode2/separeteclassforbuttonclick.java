package SirCode2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class separeteclassforbuttonclick implements ActionListener {

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
