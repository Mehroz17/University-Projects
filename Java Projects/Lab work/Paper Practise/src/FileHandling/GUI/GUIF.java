package FileHandling.GUI;
        import javax.swing.*;
        import java.awt.Font;
        import javax.swing.border.SoftBevelBorder;
        import javax.swing.border.BevelBorder;
        import java.awt.Color;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.ArrayList;

public class GUIF {

    private JFrame frame;
    private JTextField nameT;
    private JTextField rollT;
    private JScrollPane jScrollPane;

    dataF hf = new dataF();
    ArrayList<String> da = new ArrayList<>();


    public void init() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 429);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);





        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 416, 372);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel Name = new JLabel("Name");
        Name.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Name.setHorizontalAlignment(SwingConstants.CENTER);
        Name.setBounds(10, 63, 74, 22);
        panel.add(Name);

        JLabel Roll = new JLabel("ID");
        Roll.setHorizontalAlignment(SwingConstants.CENTER);
        Roll.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Roll.setBounds(10, 95, 74, 22);
        panel.add(Roll);

        nameT = new JTextField();
        nameT.setBounds(103, 67, 189, 19);
        panel.add(nameT);
        nameT.setColumns(10);

        rollT = new JTextField();
        rollT.setBounds(103, 99, 189, 19);
        panel.add(rollT);
        rollT.setColumns(10);

        JLabel sF = new JLabel("Student / Faculty");
        sF.setHorizontalAlignment(SwingConstants.CENTER);
        sF.setFont(new Font("Tahoma", Font.PLAIN, 16));
        sF.setBounds(10, 146, 154, 22);
        panel.add(sF);

        JComboBox occopation = new JComboBox();
        occopation.setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.GRAY, null, null, null));
        occopation.setModel(new DefaultComboBoxModel(new String[] {"STUDENT", "FACULTY"}));
        occopation.setSelectedIndex(1);
        occopation.setBounds(185, 149, 102, 21);
        panel.add(occopation);








        JButton submit = new JButton("Submit");
        submit.setHorizontalAlignment(SwingConstants.CENTER);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 16));
        submit.setBounds(44, 199, 74, 22);
        panel.add(submit);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nameT.getText().length()==0 || rollT.getText().length()==0){
                    JOptionPane.showMessageDialog(null,"Enter Name and ID");
                }
                else {
                    String filepath = null;
                    String name = null;
                    String ID = null;
                    String occ = null;

                    switch(occopation.getSelectedIndex()){
                        case 0:{
                            filepath = "Students";
                            name = nameT.getText();
                            ID = rollT.getText();
                            occ = "Student";
                            break;
                        }
                        case 1:{
                            filepath = "Faculty";
                            name = nameT.getText();
                            ID = rollT.getText();
                            occ = "Faculty";
                            break;
                        }
                    }
                    hf.file(filepath,name,ID,occ);
                }
            }
        });

        JComboBox comboBox2 = new JComboBox();
        comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Student", "Faculty"}));
        comboBox2.setBounds(198, 328, 113, 21);
        panel.add(comboBox2);


        JButton sh = new JButton("Show");
        sh.setHorizontalAlignment(SwingConstants.CENTER);
        sh.setFont(new Font("Tahoma", Font.PLAIN, 16));
        sh.setBounds(321, 327, 74, 22);
        panel.add(sh);


//Action of First Combo Box
        occopation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(occopation.getSelectedIndex() == 1){
                    Roll.setText("Block:");
                }
                else if(occopation.getSelectedIndex()==0){
                    Roll.setText("ID:");
                }
            }
        });

//Action of Submit Button

        sh.addActionListener(new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e) {
                String filepath = null;

                if(comboBox2.getSelectedIndex()==0){
                    filepath = "Faculty";
                }
                else if (comboBox2.getSelectedIndex()==1){
                    filepath = "Students";
                }
                da = hf.read(filepath);
                for(String li : da){
                    System.out.println(li);
                }

            }
        });



frame.setVisible(true);
frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
