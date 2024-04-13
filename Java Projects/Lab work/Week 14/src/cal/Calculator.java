package cal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel MainPanel;
    private JPanel TopPanel;
    private JPanel SecondPanel;
    private JTextField textField1;
    private JButton addButton;
    private JButton clearButton;
    private JTextField TextFeild2;
    private JTextField TextFelid3;
    private JButton DivdeButton;

    public JPanel getMainPanel() {
        return MainPanel;
    }

    public Calculator() { // Constructor
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = textField1.getText().trim();
                String num2 = TextFeild2.getText().trim();
                //TO Add them we have to parase
                double result = Double.parseDouble(num1)+ Double.parseDouble(num2);
                TextFelid3.setText(result+"");
            }
        });
        DivdeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = textField1.getText().trim();
                String num2 = TextFeild2.getText().trim();
                //TO Add them we have to parase
                double result = Double.parseDouble(num1)/ Double.parseDouble(num2);
                TextFelid3.setText(result+"");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                TextFeild2.setText("");
                TextFelid3.setText("");
            }
        });
    }
}
