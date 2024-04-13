package Clock;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JTextField;
public class C {


    private JFrame frame;
    private JTextField l2;


    public void datetime() {
        Thread datetiem = new Thread(){
            public void run(){
                try {
                    for (;;){
                        Calendar calendar = new GregorianCalendar();
                        int day = calendar.get(Calendar.DAY_OF_MONTH);
                        int month = calendar.get(Calendar.MONTH);
                        int year = calendar.get(Calendar.YEAR);

                        int second = calendar.get(Calendar.SECOND);
                        int min = calendar.get(Calendar.MINUTE);
                        int hour = calendar.get(Calendar.HOUR);
                        l2.setText("Time" + hour + ":"+ min + ":" + second + "  "+ "Date "+day+ "/"+ month + "/" +year);

                        sleep(1000);
                    }
                }catch (Exception e){

                }

            }
        };
        datetiem.start();

    }


    public C() {
        initialize();
        datetime();

    }


    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 0));
        frame.setBounds(100, 100, 361, 303);
        frame.getContentPane().setLayout(null);

        JLabel Header = new JLabel("Clock");
        Header.setBackground(new Color(135, 206, 235));
        Header.setForeground(Color.BLUE);
        Header.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 51));
        Header.setHorizontalAlignment(SwingConstants.CENTER);
        Header.setBounds(103, 10, 142, 46);
        frame.getContentPane().add(Header);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(102, 255, 51));
        panel.setForeground(new Color(0, 0, 0));
        panel.setBounds(0, 102, 347, 154);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        l2 = new JTextField("");
        l2.setBackground(Color.BLACK);
        l2.setForeground(Color.RED);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setEditable(false);
        l2.setFont(new Font("Tahoma", Font.BOLD, 10));
        l2.setBounds(10, 53, 327, 41);
        panel.add(l2);
        panel.setVisible(false);

        JButton b1 = new JButton("Time ");
        b1.setForeground(new Color(51, 0, 102));
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        b1.setBounds(124, 71, 85, 21);
        frame.getContentPane().add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(true);
                datetime();
            }
        });


        //Closing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

