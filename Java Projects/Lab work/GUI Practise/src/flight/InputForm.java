package flight;

import javax.swing.*;
        import java.awt.Color;
        import java.awt.Font;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class InputForm {

    private JFrame frame;
    private JTextField nameText;
    private JTextField cnicText;
    private JTextField seatText;


    public void inti() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 497);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        JPanel JP1 = new JPanel();
        JP1.setBackground(new Color(255, 0, 0));
        JP1.setBounds(-13, 0, 449, 460);
        frame.getContentPane().add(JP1);
        JP1.setLayout(null);

        JLabel Title = new JLabel("Flight Reservation");
        Title.setHorizontalAlignment(SwingConstants.CENTER);
        Title.setForeground(Color.WHITE);
        Title.setVerticalTextPosition(SwingConstants.BOTTOM);
        Title.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        Title.setBorder(null);
        Title.setBackground(Color.WHITE);
        Title.setBounds(131, 10, 201, 66);
        JP1.add(Title);

        JLabel jp2 = new JLabel("Name");
        jp2.setBorder(null);
        jp2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        jp2.setHorizontalAlignment(SwingConstants.CENTER);
        jp2.setForeground(Color.WHITE);
        jp2.setBounds(38, 99, 69, 46);
        JP1.add(jp2);

        JLabel jp3 = new JLabel("CNIC");
        jp3.setHorizontalAlignment(SwingConstants.CENTER);
        jp3.setForeground(Color.WHITE);
        jp3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        jp3.setBorder(null);
        jp3.setBounds(38, 169, 69, 46);
        JP1.add(jp3);

        nameText = new JTextField();
        nameText.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        nameText.setBackground(Color.BLACK);
        nameText.setForeground(Color.WHITE);
        nameText.setHorizontalAlignment(SwingConstants.LEFT);
        nameText.setBounds(127, 115, 205, 19);
        JP1.add(nameText);
        nameText.setColumns(10);

        nameText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = nameText.getText();
                Process p2 = new Process();
                p2.setName(n);
            }
        });

        cnicText = new JTextField();
        cnicText.setHorizontalAlignment(SwingConstants.LEFT);
        cnicText.setForeground(Color.WHITE);
        cnicText.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        cnicText.setColumns(10);
        cnicText.setBackground(Color.BLACK);
        cnicText.setBounds(127, 185, 205, 19);
        JP1.add(cnicText);

        cnicText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cn= cnicText.getText();
                Process p = new Process();
                p.setCnic(cn);
            }
        });

        JLabel lblNoOfSeats = new JLabel("No of Seats");
        lblNoOfSeats.setHorizontalAlignment(SwingConstants.CENTER);
        lblNoOfSeats.setForeground(Color.WHITE);
        lblNoOfSeats.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNoOfSeats.setBorder(null);
        lblNoOfSeats.setBounds(48, 225, 102, 46);
        JP1.add(lblNoOfSeats);

        seatText = new JTextField();
        seatText.setHorizontalAlignment(SwingConstants.LEFT);
        seatText.setForeground(Color.WHITE);
        seatText.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        seatText.setColumns(10);
        seatText.setBackground(Color.BLACK);
        seatText.setBounds(177, 241, 205, 19);
        JP1.add(seatText);



        JButton b1 = new JButton("Print Ticket");
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        b1.setBackground(Color.BLACK);
        b1.setBounds(131, 336, 147, 19);
        JP1.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Ticket t =new Ticket();
               t.initialize();

            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
