package Hotel.Backup;
import Hotel.Clock;
import Hotel.LogicofMenue;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Color;
import java.awt.Font;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;


public class lastpage {


    private JFrame frame;
    private JTextField txtDisplay;
    private JTextField birT;
    private JTextField karhT;
    private JTextField pizzaT;
    private JTextField burgerT;
    private JTextField parathaT;
    private JTextField drinkT;
    private JTextField roomT;
    private JLabel burgerL;
    private JTextField amountT;
    private JLabel mealT;
    private JLabel TCD;
    private JTextField clocktextfeild;
    private double firstnum;
    private double secondnum;
    private double result;
    private String operations;
    private String answer;
    private JLabel costD;
    private JLabel totaltax;
    private JLabel subtotal;
    private JLabel costofRoom;
    private JLabel totalAnswer;
    private JPanel panel_3;
    private JPanel panel_2;
    private JTextArea reciptarea;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    lastpage window = new lastpage();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public lastpage() {
        initialize();
        Clock c = new Clock();
        c.datetime(clocktextfeild);
    }


    private void initialize() {
        frame = new JFrame();
        frame.setBounds(0, 0, 1500, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel CalP = new JPanel();
        CalP.setBorder(new LineBorder(new Color(0, 128, 128), 10));
        CalP.setBounds(0, 60, 488, 677);
        frame.getContentPane().add(CalP);
        CalP.setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(10, 10, 468, 657);
        CalP.add(tabbedPane);

        JPanel panel = new JPanel();
        tabbedPane.addTab("Calculator", null, panel, null);
        panel.setLayout(null);

        txtDisplay = new JTextField();
        txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 60));
        txtDisplay.setColumns(10);
        txtDisplay.setBounds(10, 10, 430, 60);
        panel.add(txtDisplay);

        JButton btnbackspace = new JButton("\uF0E7");
        btnbackspace.setFont(new Font("Dialog", Font.BOLD, 50));
        btnbackspace.setBounds(10, 80, 100, 100);
        panel.add(btnbackspace);
        //Action
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

        JButton btn7 = new JButton("7");
        btn7.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn7.setBounds(10, 190, 100, 100);
        panel.add(btn7);
        //Action
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn7.getText();
                txtDisplay.setText(EnterValue);

            }
        });

        JButton btn4 = new JButton("4");
        btn4.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn4.setBounds(10, 300, 100, 100);
        panel.add(btn4);
        //Action
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn4.getText();
                txtDisplay.setText(EnterValue);
            }
        });

        JButton btn1 = new JButton("1");
        btn1.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn1.setBounds(10, 410, 100, 100);
        panel.add(btn1);
        //Action
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String EnterValue = txtDisplay.getText() + btn1.getText();
                txtDisplay.setText(EnterValue);
            }
        });


        JButton btn0 = new JButton("0");
        btn0.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn0.setBounds(10, 520, 100, 100);
        panel.add(btn0);
        //Action
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String EnterValue = txtDisplay.getText() + btn0.getText();
                txtDisplay.setText(EnterValue);
            }
        });

        JButton btnclear = new JButton("C");
        btnclear.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnclear.setBounds(120, 80, 100, 100);
        panel.add(btnclear);

        //Action
        btnclear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                txtDisplay.setText(null);

            }
        });

        JButton btn8 = new JButton("8");
        btn8.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn8.setBounds(120, 190, 100, 100);
        panel.add(btn8);
        //Action
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn8.getText();
                txtDisplay.setText(EnterValue);
            }
        });

        JButton btn5 = new JButton("5");
        btn5.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn5.setBounds(120, 300, 100, 100);
        panel.add(btn5);
        //Action
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String EnterValue = txtDisplay.getText() + btn5.getText();
                txtDisplay.setText(EnterValue);
            }
        });

        JButton btn2 = new JButton("2");
        btn2.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn2.setBounds(120, 410, 100, 100);
        panel.add(btn2);
        //Action

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String EnterValue = txtDisplay.getText() + btn2.getText();
                txtDisplay.setText(EnterValue);
            }
        });

        JButton btnDot = new JButton(".");
        btnDot.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnDot.setBounds(120, 520, 100, 100);
        panel.add(btnDot);
        //Action
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String EnterValue = txtDisplay.getText() + btnDot.getText();
                txtDisplay.setText(EnterValue);
            }
        });

        JButton btnModulus = new JButton("%");
        btnModulus.setFont(new Font("Tahoma", Font.BOLD, 50));
        btnModulus.setBounds(230, 80, 100, 100);
        panel.add(btnModulus);
        //Action
        btnModulus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "%";

            }
        });

        JButton btn9 = new JButton("9");
        btn9.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn9.setBounds(230, 190, 100, 100);
        panel.add(btn9);
        //Action
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String EnterValue = txtDisplay.getText() + btn9.getText();
                txtDisplay.setText(EnterValue);

            }
        });

        JButton btn6 = new JButton("6");
        btn6.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn6.setBounds(230, 300, 100, 100);
        panel.add(btn6);
        //Action
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String EnterValue = txtDisplay.getText() + btn6.getText();
                txtDisplay.setText(EnterValue);
            }
        });



        JButton btn3 = new JButton("3");
        btn3.setFont(new Font("Tahoma", Font.BOLD, 70));
        btn3.setBounds(230, 410, 100, 100);
        panel.add(btn3);
        //Action

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String EnterValue = txtDisplay.getText() + btn3.getText();
                txtDisplay.setText(EnterValue);
            }
        });

        JButton btnPM = new JButton("\u00B1");
        btnPM.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnPM.setBounds(230, 520, 100, 100);
        panel.add(btnPM);
        //Action

        btnPM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double plusminus =  Double.parseDouble(String.valueOf(txtDisplay.getText()));
                plusminus = plusminus*(-1);
                txtDisplay.setText(String.valueOf(plusminus));
            }
        });

        JButton btnPlus = new JButton("+");
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnPlus.setBounds(340, 80, 100, 100);
        panel.add(btnPlus);
        //Action
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "+";
            }
        });

        JButton btnMinus = new JButton("-");
        btnMinus.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnMinus.setBounds(340, 190, 100, 100);
        panel.add(btnMinus);
        //Action
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "-";

            }
        });

        JButton btnx = new JButton("X");
        btnx.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnx.setBounds(340, 300, 100, 100);
        panel.add(btnx);
        //Action
        btnx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "X";
            }
        });

        JButton btndivide = new JButton("/");
        btndivide.setFont(new Font("Tahoma", Font.BOLD, 70));
        btndivide.setBounds(340, 410, 100, 100);
        panel.add(btndivide);

        //Action
        btndivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "/";

            }
        });

        JButton btnequal = new JButton("=");
        btnequal.setFont(new Font("Tahoma", Font.BOLD, 70));
        btnequal.setBounds(340, 520, 100, 100);
        panel.add(btnequal);
        //Action
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
// ===============================Calculator End================================
        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Recipt", null, panel_1, null);
        panel_1.setLayout(null);

        reciptarea = new JTextArea();
        reciptarea.setBounds(0, 0, 463, 630);
        panel_1.add(reciptarea);


        JPanel MeeP = new JPanel();
        MeeP.setBackground(Color.WHITE);
        MeeP.setBorder(new LineBorder(Color.CYAN, 10));
        MeeP.setBounds(493, 83, 963, 351);
        frame.getContentPane().add(MeeP);
        MeeP.setLayout(null);

        JLabel lblNewLabel = new JLabel("Menue");
        lblNewLabel.setForeground(Color.ORANGE);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 29));
        lblNewLabel.setBounds(20, 10, 104, 32);
        MeeP.add(lblNewLabel);

        JLabel lblQut = new JLabel("Quantity");
        lblQut.setHorizontalAlignment(SwingConstants.CENTER);
        lblQut.setForeground(Color.GREEN);
        lblQut.setFont(new Font("Times New Roman", Font.PLAIN, 29));
        lblQut.setBounds(261, 10, 104, 32);
        MeeP.add(lblQut);

        JLabel lblPrice = new JLabel("Price");
        lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
        lblPrice.setForeground(Color.GREEN);
        lblPrice.setFont(new Font("Times New Roman", Font.PLAIN, 29));
        lblPrice.setBounds(450, 10, 104, 32);
        MeeP.add(lblPrice);

        JLabel biryL = new JLabel("Biryani");
        biryL.setHorizontalAlignment(SwingConstants.LEFT);
        biryL.setForeground(Color.BLACK);
        biryL.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        biryL.setBounds(34, 52, 82, 25);
        MeeP.add(biryL);

        JLabel karL = new JLabel("Karhai");
        karL.setHorizontalAlignment(SwingConstants.LEFT);
        karL.setForeground(Color.BLACK);
        karL.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        karL.setBounds(34, 83, 82, 25);
        MeeP.add(karL);

        JLabel pizaL = new JLabel("Pizza");
        pizaL.setHorizontalAlignment(SwingConstants.LEFT);
        pizaL.setForeground(Color.BLACK);
        pizaL.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        pizaL.setBounds(34, 118, 82, 25);
        MeeP.add(pizaL);

        JLabel burgerL = new JLabel("Burger");
        burgerL.setHorizontalAlignment(SwingConstants.LEFT);
        burgerL.setForeground(Color.BLACK);
        burgerL.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        burgerL.setBounds(34, 153, 82, 25);
        MeeP.add(burgerL);

        JLabel parathaL = new JLabel("Paratha Roll");
        parathaL.setHorizontalAlignment(SwingConstants.LEFT);
        parathaL.setForeground(Color.BLACK);
        parathaL.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        parathaL.setBounds(34, 188, 122, 25);
        MeeP.add(parathaL);

        birT = new JTextField();
        birT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        birT.setBounds(271, 57, 94, 19);
        MeeP.add(birT);
        birT.setColumns(10);

        karhT = new JTextField();
        karhT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        karhT.setColumns(10);
        karhT.setBounds(271, 88, 94, 19);
        MeeP.add(karhT);

        pizzaT = new JTextField();
        pizzaT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        pizzaT.setColumns(10);
        pizzaT.setBounds(271, 118, 94, 19);
        MeeP.add(pizzaT);

        burgerT = new JTextField();
        burgerT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        burgerT.setColumns(10);
        burgerT.setBounds(271, 158, 94, 19);
        MeeP.add(burgerT);

        parathaT = new JTextField();
        parathaT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        parathaT.setColumns(10);
        parathaT.setBounds(271, 193, 94, 19);
        MeeP.add(parathaT);

        JLabel lblNewLabel_1_2 = new JLabel("150 RS");
        lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_2.setForeground(Color.BLACK);
        lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblNewLabel_1_2.setBounds(450, 52, 82, 25);
        MeeP.add(lblNewLabel_1_2);

        JLabel lblNewLabel_1_3 = new JLabel("800 RS");
        lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_3.setForeground(Color.BLACK);
        lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblNewLabel_1_3.setBounds(450, 83, 82, 25);
        MeeP.add(lblNewLabel_1_3);

        JLabel lblNewLabel_1_4 = new JLabel("1500 RS");
        lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_4.setForeground(Color.BLACK);
        lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblNewLabel_1_4.setBounds(450, 118, 82, 25);
        MeeP.add(lblNewLabel_1_4);

        JLabel lblNewLabel_1_5 = new JLabel("500 RS");
        lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_5.setForeground(Color.BLACK);
        lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblNewLabel_1_5.setBounds(450, 153, 82, 25);
        MeeP.add(lblNewLabel_1_5);

        JLabel lblNewLabel_1_6 = new JLabel("180 RS");
        lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_6.setForeground(Color.BLACK);
        lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblNewLabel_1_6.setBounds(450, 188, 82, 25);
        MeeP.add(lblNewLabel_1_6);

        JComboBox drinkBox = new JComboBox();
        drinkBox.setBackground(Color.WHITE);
        drinkBox.setFont(new Font("Times New Roman", Font.ITALIC, 19));
        drinkBox.setModel(new DefaultComboBoxModel(new String[] {"Choose A Drink", "Coca Cola", "Sting", "Pepsi", "Mango Juice", "Mint Margarita","Water"}));
        drinkBox.setBounds(34, 223, 191, 21);
        MeeP.add(drinkBox);

        drinkT = new JTextField();
        drinkT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        drinkT.setColumns(10);
        drinkT.setBounds(271, 226, 94, 19);
        MeeP.add(drinkT);

        JLabel lblNewLabel_1_6_1 = new JLabel("-");
        lblNewLabel_1_6_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_6_1.setForeground(Color.BLACK);
        lblNewLabel_1_6_1.setFont(new Font("Times New Roman", Font.ITALIC, 22));
        lblNewLabel_1_6_1.setBounds(450, 223, 82, 25);
        MeeP.add(lblNewLabel_1_6_1);

        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(32, 254, 474, 16);
        MeeP.add(separator_2);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(582, 327, 26, -315);
        MeeP.add(separator_1);

        roomT = new JTextField();
        roomT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        roomT.setColumns(10);
        roomT.setBounds(271, 268, 94, 19);
        MeeP.add(roomT);

        JLabel roomL = new JLabel("Enter Room Number");
        roomL.setHorizontalAlignment(SwingConstants.LEFT);
        roomL.setForeground(Color.BLACK);
        roomL.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        roomL.setBounds(34, 266, 191, 25);
        MeeP.add(roomL);

        JCheckBox deliverC = new JCheckBox("Delivery");
        deliverC.setBackground(Color.WHITE);
        deliverC.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        deliverC.setBounds(27, 297, 110, 21);
        MeeP.add(deliverC);

        JCheckBox taxC = new JCheckBox("Tax");
        taxC.setBackground(Color.WHITE);
        taxC.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        taxC.setBounds(175, 297, 82, 21);
        MeeP.add(taxC);

        // Submit Button of Menue
        JButton submitbtn = new JButton("Submit");
        submitbtn.setBackground(Color.WHITE);
        submitbtn.setForeground(SystemColor.activeCaption);
        submitbtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        submitbtn.setBounds(318, 299, 104, 32);
        MeeP.add(submitbtn);
        //Action Performed
        submitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogicofMenue m = new LogicofMenue();
                int q = 0;
                try{
                    if(roomT.getText().isEmpty()){
                        throw new InputMismatchException();
                    }else{
                        //Storing Room number
                        int rom = Integer.parseInt(roomT.getText());
                        m.setRoomnumber(rom);
                        //Staring the try catch of drinks
                        if(drinkBox.getSelectedIndex()>0){
                        try {
                            if(drinkT.getText().length()<=0  ){
                                throw new InputMismatchException();
                            }else {
                                q = Integer.parseInt(drinkT.getText());
                                m.costofDrink(drinkBox,q,TCD);
                            }
                        }catch (InputMismatchException n){
                            JOptionPane.showMessageDialog(null,"Quanty is Empty");
                        }
                    }

                        // Calling method for the total cost of meal

                        double birq, pizq, karq,buq, parq = 0;
                        birq= Double.parseDouble(birT.getText());
                        pizq= Double.parseDouble(pizzaT.getText());
                        karq =  Double.parseDouble(karhT.getText());
                        buq= Double.parseDouble(burgerT.getText());
                        parq= Double.parseDouble(parathaT.getText());

                        m.totalcostofMeal(mealT,birq,karq,pizq,buq,parq);
                    }
                }catch (InputMismatchException i){
                    JOptionPane.showMessageDialog(null,"Enter Room Number");
                }
                int dc = 0 ; int tax = 0;
                if(deliverC.isSelected()){
                    costD.setText("10.0 Rs");
                     dc = 10;
                }
                else if(taxC.isSelected()){
                    totaltax.setText("200.0 Rs");
                    tax = 200;
                }
                // Sub Total
                m.subprice(dc,tax,subtotal);
///error here logical
                //Room Rent and Total
                costofRoom.setText("1500.0 Rs");
              //  m.totalRent(totalAnswer);
            }
        });

        //Referesh Button
        JButton refreshbtn = new JButton("Refresh");
        refreshbtn.setBackground(Color.WHITE);
        refreshbtn.setForeground(SystemColor.activeCaption);
        refreshbtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        refreshbtn.setBounds(428, 299, 104, 32);
        MeeP.add(refreshbtn);

        //Action
        refreshbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                birT.setText("");
                karhT.setText("");
                parathaT.setText("");
                pizzaT.setText("");
                burgerT.setText("");
                drinkT.setText("");
                deliverC.setSelected(false);
                taxC.setSelected(false);
                roomT.setText("");
            }
        });

        JLabel Con = new JLabel("Currency Converter");
        Con.setHorizontalAlignment(SwingConstants.CENTER);
        Con.setForeground(Color.ORANGE);
        Con.setFont(new Font("Times New Roman", Font.PLAIN, 29));
        Con.setBounds(564, 10, 375, 32);
        MeeP.add(Con);
        Con.setVisible(false);

        JComboBox countryC = new JComboBox();
        countryC.setForeground(SystemColor.textHighlight);
        countryC.setBackground(Color.WHITE);
        countryC.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        countryC.setModel(new DefaultComboBoxModel(new String[] {"Choose Country", "USA", "UK", "UAE", "China", "Saudia Arabia", "Qatar", ""}));
        countryC.setBounds(647, 74, 216, 63);
        MeeP.add(countryC);
        countryC.setVisible(false);

        amountT = new JTextField();
        amountT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        amountT.setHorizontalAlignment(SwingConstants.CENTER);
        amountT.setBounds(647, 158, 216, 55);
        MeeP.add(amountT);
        amountT.setColumns(10);
        amountT.setVisible(false);

        JLabel currenccyL = new JLabel("");
        currenccyL.setFont(new Font("Times New Roman", Font.BOLD, 20));
        currenccyL.setBorder(new LineBorder(SystemColor.textText, 2));
        currenccyL.setBounds(647, 223, 216, 47);
        MeeP.add(currenccyL);
        currenccyL.setVisible(false);
//Referesh of Converter
        JButton refreshbtnC = new JButton("Refresh");
        refreshbtnC.setForeground(SystemColor.activeCaption);
        refreshbtnC.setFont(new Font("Times New Roman", Font.BOLD, 20));
        refreshbtnC.setBackground(Color.WHITE);
        refreshbtnC.setBounds(752, 297, 104, 32);
        MeeP.add(refreshbtnC);
        refreshbtnC.setVisible(false);
        refreshbtnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountT.setText("");
                countryC.setSelectedIndex(0);
            }
        });

        //Submit of Converter
        JButton submitbtnC = new JButton("Submit");
        submitbtnC.setForeground(SystemColor.activeCaption);
        submitbtnC.setFont(new Font("Times New Roman", Font.BOLD, 20));
        submitbtnC.setBackground(Color.WHITE);
        submitbtnC.setBounds(642, 297, 104, 32);
        MeeP.add(submitbtnC);
        submitbtnC.setVisible(false);
        submitbtnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogicofMenue m = new LogicofMenue();
                double am = Double.parseDouble(amountT.getText());
                m.converter(am,currenccyL,countryC);


            }
        });

        JPanel TotP = new JPanel();
        TotP.setBorder(new LineBorder(Color.CYAN, 10));
        TotP.setBounds(498, 444, 963, 319);
        frame.getContentPane().add(TotP);
        TotP.setLayout(null);

        JLabel lblTotalCostOf = new JLabel("Total Cost of Meal");
        lblTotalCostOf.setHorizontalAlignment(SwingConstants.LEFT);
        lblTotalCostOf.setForeground(Color.BLACK);
        lblTotalCostOf.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblTotalCostOf.setBounds(23, 25, 180, 25);
        TotP.add(lblTotalCostOf);

        JLabel lblTotalCostOf_2 = new JLabel("Total Cost of Drink");
        lblTotalCostOf_2.setHorizontalAlignment(SwingConstants.LEFT);
        lblTotalCostOf_2.setForeground(Color.BLACK);
        lblTotalCostOf_2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblTotalCostOf_2.setBounds(23, 74, 180, 25);
        TotP.add(lblTotalCostOf_2);

        JLabel lblCostOfDelivery = new JLabel("Cost Of Delivery");
        lblCostOfDelivery.setHorizontalAlignment(SwingConstants.LEFT);
        lblCostOfDelivery.setForeground(Color.BLACK);
        lblCostOfDelivery.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblCostOfDelivery.setBounds(23, 124, 180, 25);
        TotP.add(lblCostOfDelivery);

        JLabel lblTotalCost = new JLabel("Total Cost Room");
        lblTotalCost.setHorizontalAlignment(SwingConstants.LEFT);
        lblTotalCost.setForeground(Color.BLACK);
        lblTotalCost.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        lblTotalCost.setBounds(23, 178, 180, 25);
        TotP.add(lblTotalCost);

        JLabel lblTax = new JLabel("Tax");
        lblTax.setHorizontalAlignment(SwingConstants.LEFT);
        lblTax.setForeground(Color.BLACK);
        lblTax.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        lblTax.setBounds(575, 25, 65, 25);
        TotP.add(lblTax);

        JLabel lblSubTotal = new JLabel("Sub Total");
        lblSubTotal.setHorizontalAlignment(SwingConstants.LEFT);
        lblSubTotal.setForeground(Color.BLACK);
        lblSubTotal.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        lblSubTotal.setBounds(575, 82, 113, 25);
        TotP.add(lblSubTotal);

        JLabel lblTotal = new JLabel("Total ");
        lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
        lblTotal.setForeground(Color.BLACK);
        lblTotal.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        lblTotal.setBounds(575, 151, 96, 25);
        TotP.add(lblTotal);

        subtotal = new JLabel("");
        subtotal.setHorizontalAlignment(SwingConstants.CENTER);
        subtotal.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        subtotal.setBorder(new LineBorder(SystemColor.textText, 2));
        subtotal.setBounds(692, 86, 209, 25);
        TotP.add(subtotal);

        JLabel totalAnswer = new JLabel("");
        totalAnswer.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        totalAnswer.setHorizontalAlignment(SwingConstants.CENTER);
        totalAnswer.setBorder(new LineBorder(SystemColor.textText, 2));
        totalAnswer.setBounds(692, 151, 209, 25);
        TotP.add(totalAnswer);

        totaltax = new JLabel("");
        totaltax.setHorizontalAlignment(SwingConstants.CENTER);
        totaltax.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        totaltax.setBorder(new LineBorder(SystemColor.textText, 2));
        totaltax.setBounds(692, 25, 209, 25);
        TotP.add(totaltax);

        mealT = new JLabel();
        mealT.setHorizontalAlignment(SwingConstants.CENTER);
        mealT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        mealT.setBorder(new LineBorder(SystemColor.textText, 2));
        mealT.setBounds(254, 25, 209, 25);
        TotP.add(mealT);

        TCD = new JLabel();
        TCD.setHorizontalAlignment(SwingConstants.CENTER);
        TCD.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        TCD.setBorder(new LineBorder(SystemColor.textText, 2));
        TCD.setBounds(254, 74, 209, 25);
        TotP.add(TCD);

        costD = new JLabel("");
        costD.setHorizontalAlignment(SwingConstants.CENTER);
        costD.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        costD.setBorder(new LineBorder(SystemColor.textText, 2));
        costD.setBounds(254, 124, 209, 25);
        TotP.add(costD);

        costofRoom = new JLabel("");
        costofRoom.setHorizontalAlignment(SwingConstants.CENTER);
        costofRoom.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        costofRoom.setBorder(new LineBorder(SystemColor.textText, 2));
        costofRoom.setBounds(254, 178, 209, 25);
        TotP.add(costofRoom);

        JLabel HeadL = new JLabel("Chaudhary Hotel");
        HeadL.setBackground(Color.WHITE);
        HeadL.setHorizontalAlignment(SwingConstants.CENTER);
        HeadL.setFont(new Font("Poor Richard", Font.PLAIN, 73));
        HeadL.setBounds(598, 0, 621, 86);
        frame.getContentPane().add(HeadL);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.GRAY);
        menuBar.setBounds(0, 0, 462, 38);
        frame.getContentPane().add(menuBar);

        JMenu fBar = new JMenu("File");
        fBar.setFont(new Font("SimSun", Font.PLAIN, 18));
        menuBar.add(fBar);

        JMenu mnNewMenu = new JMenu("New");
        mnNewMenu.setFont(new Font("SimSun", Font.PLAIN, 16));
        fBar.add(mnNewMenu);

//Recipt in New
        JMenuItem reciptinnew = new JMenuItem("Recipet");
        reciptinnew.setFont(new Font("SimSun", Font.BOLD, 13));
        mnNewMenu.add(reciptinnew);
        reciptinnew.addActionListener(new ActionListener() {
            LogicofMenue m = new LogicofMenue();
            @Override
            public void actionPerformed(ActionEvent e) {
                reciptarea.append("\t\tChaudhary Hotel\n\n"+"\n\tRoom Number:\t "+roomT.getText()+"\tBiryani:\t"+birT.getText()+"\n\tKarhai:\t"+karhT.getText()+
                        "\n\tPizza:\t"+pizzaT.getText()+"\n\tBurger:\t"+burgerT.getText()+"\n\tParathaRoll:\t"+parathaT.getText()
                +"\n\nCost of Meal: \t"+mealT.getText()+"\n\tCold Drink: \t "+ drinkBox.getSelectedItem()+"\t"+drinkT.getText()+"\n\t\tTotal Cost of Drinks:\t"+TCD.getText()+"\n\n\n\t\tTotal:\t"+m.getTotal());
                reciptarea.setVisible(true);
            }
        });

        JMenuItem resetinnew = new JMenuItem("Reset");
        resetinnew.setFont(new Font("SimSun", Font.BOLD, 15));
        mnNewMenu.add(resetinnew);


        //Panle for the design at the position of converter

        panel_2 = new JPanel();
        panel_2.setBackground(new Color(173, 216, 230));
        panel_2.setBounds(890, 22, 49, 309);
        MeeP.add(panel_2);


        panel_3 = new JPanel();
        panel_3.setBorder(new MatteBorder(5, 1, 1, 1, (Color) new Color(124, 252, 0)));
        panel_3.setBackground(new Color(0, 128, 0));
        panel_3.setBounds(568, 67, 337, 177);
        MeeP.add(panel_3);


        JMenuItem convertinfile = new JMenuItem("Convert");
        convertinfile.setFont(new Font("SimSun", Font.PLAIN, 16));
        fBar.add(convertinfile);
        convertinfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countryC.setVisible(true);
                Con.setVisible(true);
                amountT.setVisible(true);
                refreshbtnC.setVisible(true);
                submitbtnC.setVisible(true);
                panel_2.setVisible(false);
                panel_3.setVisible(false);
            }
        });

        JMenuItem totalinfile = new JMenuItem("Total");
        totalinfile.setFont(new Font("SimSun", Font.PLAIN, 16));
        fBar.add(totalinfile);

        JMenuItem refereshinfile = new JMenuItem("Refersh");
        refereshinfile.setFont(new Font("SimSun", Font.PLAIN, 16));
        fBar.add(refereshinfile);
        refereshinfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                birT.setText(null);
                karhT.setText(null);
                pizzaT.setText(null);
                burgerT.setText(null);
                parathaT.setText(null);
                drinkT.setText(null);
                drinkBox.setSelectedIndex(0);
                deliverC.setSelected(false);
                taxC.setSelected(false);
                roomT.setText(null);
                mealT.setText(null);
                TCD.setText(null);
                costD.setText(null);
                costofRoom.setText(null);
                txtDisplay.setText(null);
                totaltax.setText(null);
                subtotal.setText(null);
                totalAnswer.setText(null);
                currenccyL.setText(null);
                amountT.setText(null);
                drinkBox.setSelectedItem("Choose a drink");
                countryC.setSelectedItem("Country");
                reciptarea.setText(null);

                countryC.setVisible(false);
                Con.setVisible(false);
                amountT.setVisible(false);
                refreshbtnC.setVisible(false);
                submitbtnC.setVisible(false);
                panel_2.setVisible(true);
                panel_3.setVisible(true);
            }
        });

        JSeparator separator = new JSeparator();
        fBar.add(separator);

        JMenuItem exitinfile = new JMenuItem("Exit");
        exitinfile.setForeground(new Color(255, 0, 0));
        exitinfile.setFont(new Font("SimSun", Font.PLAIN, 16));
        fBar.add(exitinfile);
        exitinfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });

        JMenu mnNewMenu_1 = new JMenu("Convert");
        mnNewMenu_1.setFont(new Font("SimSun", Font.PLAIN, 18));
        menuBar.add(mnNewMenu_1);
        mnNewMenu_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countryC.setVisible(true);
                Con.setVisible(true);
                amountT.setVisible(true);
                refreshbtnC.setVisible(true);
                submitbtnC.setVisible(true);
                panel_2.setVisible(false);
                panel_3.setVisible(false);
            }
        });

        JMenu mnNewMenu_1_1 = new JMenu("Total");
        mnNewMenu_1_1.setFont(new Font("SimSun", Font.PLAIN, 18));
        menuBar.add(mnNewMenu_1_1);

        JMenu refereshinbar = new JMenu("Referesh");
        refereshinbar.setFont(new Font("SimSun", Font.PLAIN, 18));
        menuBar.add(refereshinbar);
        refereshinbar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent p) {
                birT.setText(null);
                 karhT.setText(null);
                 pizzaT.setText(null);
                 burgerT.setText(null);
                 parathaT.setText(null);
                 drinkT.setText(null);
                 drinkBox.setSelectedIndex(0);
                 deliverC.setSelected(false);
                 taxC.setText(null);
                 roomT.setText(null);
                 mealT.setText(null);
                TCD.setText(null);
                 costD.setText(null);
                 costofRoom.setText(null);
                txtDisplay.setText(null);
                totaltax.setText(null);
                subtotal.setText(null);
                totalAnswer.setText(null);
                currenccyL.setText(null);
                amountT.setText(null);
                drinkBox.setSelectedItem("Choose a drink");
                countryC.setSelectedItem("Country");
                 reciptarea.setText(null);
            }
        });

        JMenu mnNewMenu_1_1_1_1 = new JMenu("Recipet");
        mnNewMenu_1_1_1_1.setFont(new Font("SimSun", Font.PLAIN, 18));
        menuBar.add(mnNewMenu_1_1_1_1);

        JMenu exitonbar = new JMenu("Exit");
        exitonbar.setForeground(new Color(255, 0, 0));
        exitonbar.setFont(new Font("SimSun", Font.PLAIN, 18));
        menuBar.add(exitonbar);
        exitonbar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //clock
        clocktextfeild = new JTextField();
        clocktextfeild.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
        clocktextfeild.setEditable(false);
        clocktextfeild.setHorizontalAlignment(SwingConstants.CENTER);
        clocktextfeild.setForeground(new Color(224, 255, 255));
        clocktextfeild.setBackground(new Color(0, 0, 0));
        clocktextfeild.setFont(new Font("Segoe UI", Font.PLAIN, 23));
        clocktextfeild.setBounds(316, 239, 372, 37);
        TotP.add(clocktextfeild);
        clocktextfeild.setColumns(10);

    }

}
