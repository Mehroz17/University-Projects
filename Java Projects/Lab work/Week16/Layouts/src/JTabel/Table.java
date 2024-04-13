package JTabel;

import javax.swing.*;
import java.awt.*;


public class Table {

    private JFrame jf1;
    private JPanel jp1;

String[] cn = {"First Name","Last Name","Sports","# of Years","Vegetarian"};
Object[][] data = {{"Muhammad","Mehroz","Cricket", new Integer(5),new Boolean(false)},
        {"Muhammad","Mooez","Cricket", new Integer(3),new Boolean(false)},
        {"Muhammad","Mehroz","Cricket", new Integer(5),new Boolean(false)},
        {"Muhammad","Mehroz","Cricket", new Integer(5),new Boolean(false)},
        {"Muhammad","Mehroz","Cricket", new Integer(5),new Boolean(false)},
        {"Muhammad","Mehroz","Cricket", new Integer(5),new Boolean(false)},
        {"Muhammad","Mehroz","Cricket", new Integer(5),new Boolean(false)},
        {"Muhammad","Mehroz","Cricket", new Integer(5),new Boolean(false)}};
    public void frame(){
        jf1 = new JFrame();
        jf1.setSize(400,100);
        jf1.setLayout(new BorderLayout());
        jf1.setVisible(true);
        jf1.setDefaultCloseOperation(jf1.EXIT_ON_CLOSE);
        jp1 = new JPanel();
        jp1.setSize(400,250);
        jf1.add(jp1,BorderLayout.NORTH);

        JTable t1 = new JTable( data, cn);
        JScrollPane cp = new JScrollPane(t1);
        t1.setFillsViewportHeight(true);


        jp1.add(t1);


    }
}
