package flight;


        import javax.swing.JFrame;
        import javax.swing.JPanel;
        import java.awt.Color;
        import javax.swing.JLabel;
        import java.awt.Font;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import javax.swing.JTextField;
public class Ticket {

    private JFrame frame;
    private JTextField namText;
    private JTextField cnText;
    private JTextField seatT;


    public void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 475, 369);
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 206, 209));
        panel.setBounds(-18, 0, 479, 342);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel t = new JLabel("Ticket");
        t.setBorder(null);
        t.setFont(new Font("Yu Gothic UI", Font.PLAIN, 33));
        t.setForeground(new Color(245, 255, 250));
        t.setBounds(186, 10, 90, 49);
        panel.add(t);

        JLabel jl2 = new JLabel("Name");
        jl2.setForeground(new Color(245, 255, 250));
        jl2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 27));
        jl2.setBorder(null);
        jl2.setBounds(54, 75, 71, 33);
        panel.add(jl2);

        JLabel jc = new JLabel("Cnic");
        jc.setForeground(new Color(245, 255, 250));
        jc.setFont(new Font("Yu Gothic UI", Font.PLAIN, 27));
        jc.setBorder(null);
        jc.setBounds(54, 130, 71, 33);
        panel.add(jc);

        JLabel j3 = new JLabel("Seat Number");
        j3.setForeground(new Color(245, 255, 250));
        j3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
        j3.setBorder(null);
        j3.setBounds(54, 183, 162, 33);
        panel.add(j3);

        namText = new JTextField();
        namText.setForeground(new Color(0, 0, 255));
        namText.setBorder(null);
        namText.setBackground(new Color(176, 224, 230));
        namText.setEditable(false);
        namText.setBounds(158, 90, 225, 19);
        namText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namText.setText(new Process().getName());
            }
        });
        panel.add(namText);
        namText.setColumns(10);


        cnText = new JTextField();
        cnText.setForeground(Color.BLUE);
        cnText.setEditable(false);
        cnText.setColumns(10);
        cnText.setBorder(null);
        cnText.setBackground(new Color(176, 224, 230));
        cnText.setBounds(158, 145, 225, 19);

        cnText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cnText.setText(new Process().getCnic());
            }
        });
        panel.add(cnText);


        seatT = new JTextField();
        seatT.setForeground(Color.BLUE);
        seatT.setEditable(false);
        seatT.setColumns(10);
        seatT.setBorder(null);
        seatT.setBackground(new Color(176, 224, 230));
        seatT.setBounds(218, 196, 225, 19);
        panel.add(seatT);

    }

}
