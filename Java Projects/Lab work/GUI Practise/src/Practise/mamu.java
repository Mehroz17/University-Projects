package Practise;

import javax.swing.*;
import java.awt.*;

public class mamu {
private JFrame mainFrame;
private JPanel canvaJPanel;
private JTextField tfField;
private JButton btnSubmit;
 
    public mamu() {

        mainFrame = new JFrame();
        FlowLayout layout = new FlowLayout();
        Container con = mainFrame.getContentPane();
        con.setLayout(new FlowLayout());
//        mainFrame.setLayout(layout);
        mainFrame.setSize(new Dimension(400,350));
        canvaJPanel = new JPanel();
        canvaJPanel.setPreferredSize(new Dimension(400, 350));
        canvaJPanel.setLayout(layout);
        tfField = new JTextField();
        tfField.setPreferredSize(new Dimension(50, 40));
        mainFrame.add(canvaJPanel);
        canvaJPanel.add(tfField);
        btnSubmit = new JButton();
        btnSubmit.setText("Submit");
        canvaJPanel.add(btnSubmit);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }
}
