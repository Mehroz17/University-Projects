package cal;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.*;

public class calulator {


    private JFrame frame;
    private JTextField txtDisplay;

    double firstnum;
    double secondnum;
    double result;
    String operations;
    String answer;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    calulator window = new calulator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public calulator() {
        initialize();
    }
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 467, 666);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        txtDisplay = new JTextField();
        txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 60));
        txtDisplay.setBounds(10, 10, 430, 60);
        frame.getContentPane().add(txtDisplay);
        txtDisplay.setColumns(10);

        JButton btnbackspace = new JButton("\uF0E7");
        btnbackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtDisplay.getText().length()>0){
                    String backspace = null;
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length()-1);
                    backspace= strB.toString();
                    txtDisplay.setText(backspace);
                }
            }
        });
        btnbackspace.setFont(new Font("Dialog", Font.BOLD, 50));
         btnbackspace.setBounds(10, 80, 100, 100);
         frame.getContentPane().add(btnbackspace);

        JButton btnclear = new JButton("C");
        btnclear.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {

             txtDisplay.setText(null);

             }
         });
         btnclear.setFont(new Font("Tahoma", Font.BOLD, 70));
         btnclear.setBounds(120, 80, 100, 100);
        frame.getContentPane().add(btnclear);



        JButton btnModulus = new JButton("%");
        btnModulus.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {

                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "%";

                 }
     });
      btnModulus.setFont(new Font("Tahoma", Font.BOLD, 50));
      btnModulus.setBounds(230, 80, 100, 100);
      frame.getContentPane().add(btnModulus);



        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {

            firstnum = Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText("");
            operations = "+";
             }
        });
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnPlus.setBounds(340, 80, 100, 100);
        frame.getContentPane().add(btnPlus);


        //===================ROW 2============================

        JButton btn7 = new JButton("7");
         btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

             String EnterValue = txtDisplay.getText() + btn7.getText();
             txtDisplay.setText(EnterValue);

             }
 });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn7.setBounds(10, 190, 100, 100);
        frame.getContentPane().add(btn7);

          JButton btn8 = new JButton("8");
         btn8.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {

             String EnterValue = txtDisplay.getText() + btn8.getText();
             txtDisplay.setText(EnterValue);
             }
        });

        btn8.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn8.setBounds(120, 190, 100, 100);
        frame.getContentPane().add(btn8);


        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn9.getText();
                txtDisplay.setText(EnterValue);

         }
 });
         btn9.setFont(new Font("Tahoma", Font.BOLD, 70));
         btn9.setBounds(230, 190, 100, 100);
         frame.getContentPane().add(btn9);


        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {

        firstnum = Double.parseDouble(txtDisplay.getText());
         txtDisplay.setText("");
         operations = "-";

              }
 });
         btnMinus.setFont(new Font("Tahoma", Font.BOLD, 70));
         btnMinus.setBounds(340, 190, 100, 100);
         frame.getContentPane().add(btnMinus);

//===================ROW 3=============================

        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            String EnterValue = txtDisplay.getText() + btn4.getText();
            txtDisplay.setText(EnterValue);
            }
});
         btn4.setFont(new Font("Tahoma", Font.BOLD, 70));
         btn4.setBounds(10, 300, 100, 100);
         frame.getContentPane().add(btn4);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {
             String EnterValue = txtDisplay.getText() + btn5.getText();
             txtDisplay.setText(EnterValue);
               }
});
        btn5.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn5.setBounds(120, 300, 100, 100);
        frame.getContentPane().add(btn5);


        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                 String EnterValue = txtDisplay.getText() + btn6.getText();
                 txtDisplay.setText(EnterValue);
                 }
 });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn6.setBounds(230, 300, 100, 100);
        frame.getContentPane().add(btn6);

        JButton btnx = new JButton("X");
        btnx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

             firstnum = Double.parseDouble(txtDisplay.getText());
             txtDisplay.setText("");
             operations = "X";
              }
 });
        btnx.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnx.setBounds(340, 300, 100, 100);
        frame.getContentPane().add(btnx);

//===================ROW 4=============================

        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               String EnterValue = txtDisplay.getText() + btn1.getText();
               txtDisplay.setText(EnterValue);
                }
 });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn1.setBounds(10, 410, 100, 100);
        frame.getContentPane().add(btn1);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
                String EnterValue = txtDisplay.getText() + btn2.getText();
                txtDisplay.setText(EnterValue);
                 }
 });
         btn2.setFont(new Font("Tahoma", Font.BOLD, 70));
         btn2.setBounds(120, 410, 100, 100);
         frame.getContentPane().add(btn2);


        JButton btn3 = new JButton("3");
       btn3.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent arg0) {
                 String EnterValue = txtDisplay.getText() + btn3.getText();
                 txtDisplay.setText(EnterValue);
                 }
 });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn3.setBounds(230, 410, 100, 100);
        frame.getContentPane().add(btn3);

        JButton btndivide = new JButton("/");
         btndivide.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent arg0) {

                 firstnum = Double.parseDouble(txtDisplay.getText());
                 txtDisplay.setText("");
                 operations = "/";

                 }
 });
        btndivide.setFont(new Font("Tahoma", Font.BOLD, 70));
        btndivide.setBounds(340, 410, 100, 100);
        frame.getContentPane().add(btndivide);

//===================ROW 5=============================
         JButton btn0 = new JButton("0");

        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
             String EnterValue = txtDisplay.getText() + btn0.getText();
            txtDisplay.setText(EnterValue);
         }
 });
        btn0.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn0.setBounds(10, 520, 100, 100);
        frame.getContentPane().add(btn0);


        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String EnterValue = txtDisplay.getText() + btnDot.getText();
                txtDisplay.setText(EnterValue);
                 }
 });
        btnDot.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnDot.setBounds(120, 520, 100, 100);
        frame.getContentPane().add(btnDot);

        JButton btnPM = new JButton("\u00B1");
        btnPM.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                double plusminus =  Double.parseDouble(String.valueOf(txtDisplay.getText()));
                plusminus = plusminus*(-1);
                txtDisplay.setText(String.valueOf(plusminus));
                 }
 });
        btnPM.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnPM.setBounds(230, 520, 100, 100);
        frame.getContentPane().add(btnPM);


        JButton btnequal = new JButton("=");
        btnequal.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {

                 String answer;
                secondnum = Double.parseDouble(txtDisplay.getText());
                if(operations == "+")
                    {
                    result = firstnum + secondnum;
                    answer = String.format("%.2f", result);
                 txtDisplay.setText(answer);
                 }
                 else if(operations == "-")
                     {
                    result = firstnum - secondnum;

                         answer = String.format("%.2f", result);
                         txtDisplay.setText(answer);
                         }
            else if(operations == "X")
                {
                result = firstnum * secondnum;
                answer = String.format("%.2f", result);
                txtDisplay.setText(answer);
                 }
            else if(operations == "/")
                {
                result = firstnum / secondnum;
                answer = String.format("%.2f", result);
                txtDisplay.setText(answer);
                }
            else if(operations == "%")
            {
                result = firstnum % secondnum;
                answer = String.format("%.2f", result);
                txtDisplay.setText(answer);
            }

             }
 });
        btnequal.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnequal.setBounds(340, 520, 100, 100);
       frame.getContentPane().add(btnequal);

    }//End Main Method

}//End Class
