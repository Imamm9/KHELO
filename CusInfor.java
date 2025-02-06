import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

public class CusInfor extends JFrame implements ActionListener {
    JLabel bkground, l1, l2, l3, l4,l5,l6;
    JTextField t1,t2;
    JButton HomeButton, ScheduleBut, TeamsButton, ticketButton, MenuButton, KheloShopBut, SignupButton, NextButton,
            BackButton;
    JPanel p1, p2, p3, p4;
    JComboBox  combo,combo1;
    JCheckBox c1,c2,c3;
    JRadioButton r1,r2;
    ButtonGroup cbg,rbg;


    ImageIcon image = new ImageIcon("p1.png");

    public CusInfor () {

    


        super(" Khelo");
        this.setBounds(250, 70, 945, 615);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        p4 = new JPanel();
        p4.setBounds(325, 130, 300, 350);
        Color dark = new ColorUIResource(224, 255, 255);
        p4.setBackground(dark);
        p4.setLayout(null);
        p4.setVisible(true);




        this.getContentPane().setLayout(null);
        bkground = new JLabel();
        bkground.setSize(950, 580);
        bkground.setIcon(image);

        p1 = new JPanel();
        p1.setBounds(0, 0, 0, 0);
        p1.setBackground(Color.gray);
        p1.setLayout(null);

        p2 = new JPanel();
        p2.setBounds(0, 0, 940, 601);
        p2.setLayout(null);
        p2.setVisible(true);

        p3 = new JPanel();
        p3.setBounds(325, 80, 300, 50);
        Color light = new ColorUIResource(245, 245, 220);
        p3.setBackground(light);
        p3.setLayout(null);
        p3.setVisible(true);

     


        String items []= new String []{"Exclusive","Premium","General"};
        combo =  new JComboBox(items);
        combo.setBounds(350,250,120,30);
        Color dark5 = new ColorUIResource(224, 255, 255);
        combo.setBackground(dark5);
        combo.setForeground(Color.darkGray); 

        String matches []= new String []{"Match 1 Brz vs Arg","Match 2 Fra vs Arg","Match 3 Spa vs Ger","Match 4 Fra vs Arg","Match 5 Bra vs Cro","Match 6 Arg vs Jap","Match 7 Bra vs Ger"};
        combo1 =  new JComboBox(matches);
        combo1.setBounds(480,250,120,30);
        Color dark00 = new ColorUIResource(224, 255, 255);
        combo1.setBackground(dark00);
        combo1.setForeground(Color.darkGray); 

        
        
       
        r1 = new JRadioButton("1");
        r1.setBounds(50,225,80,30);
        Color dark16 = new ColorUIResource(224, 255, 255);
        r1.setBackground(dark16);
      

        
        r2 = new JRadioButton("2");
        r2.setBounds(100,225,80,30);
        Color dark7 = new ColorUIResource(224, 255, 255);
        r2.setBackground(dark7);
      

      
  



        c1 = new JCheckBox ("1");
        c1.setBounds(50,175,80,30);
        Color dark8 = new ColorUIResource(224, 255, 255);
        c1.setBackground(dark8);
     
      
      
        


        c2 = new JCheckBox ("2");
        c2.setBounds(100,175,80,30);
        Color dark9 = new ColorUIResource(224, 255, 255);
        c2.setBackground(dark9);
    
    
       
        
        c3= new JCheckBox ("3");
        c3.setBounds(150,175,80,30);
        Color dark3 = new ColorUIResource(224, 255, 255);
        c3.setBackground(dark3);
   
    
        
        

    


        cbg = new ButtonGroup();
        cbg.add(c1);
        cbg.add(c2);
        cbg.add(c3);
        

        rbg = new ButtonGroup();
        rbg.add(r1);
        rbg.add(r2);
        

        l1 = new JLabel("Customer Information");
        l1.setBounds(370, 55, 300, 100);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 25));

        l2 = new JLabel("Name");
        l2.setBounds(350, 95, 480, 100);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Serif", Font.BOLD, 16));

        l3 = new JLabel("Email");
        l3.setBounds(350, 140, 550, 100);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Serif", Font.BOLD, 16));

        l4 = new JLabel("Select seat category");
        l4.setBounds(350, 186, 550, 100);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Serif", Font.BOLD, 15));

        l5 = new JLabel("Number of quantity");
        l5.setBounds(350, 245, 550, 100);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Serif", Font.BOLD, 15));
         
        l6= new JLabel("Add parking slot");
        l6.setBounds(350, 298, 550, 100);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Serif", Font.BOLD, 15));


        t1 = new JTextField("");
        t1.setBounds(350, 155, 150, 25);
        t1.setHorizontalAlignment(JTextField.CENTER);
        
    

        t2 = new JTextField("");
        t2.setBounds(350, 200, 150, 25);
        t2.setHorizontalAlignment(JTextField.CENTER);


        HomeButton = new JButton("       ");
        HomeButton.setFont(new Font("Algerian", Font.BOLD, 20));
        HomeButton.setBounds(45, 10, 115, 30);
        HomeButton.addActionListener(this);
        HomeButton.setBackground(new Color(29, 29, 29, 0));
        HomeButton.setOpaque(false);
        HomeButton.setBackground(new Color(1, 1, 1, 0));
        HomeButton.setBorder(BorderFactory.createEmptyBorder());

        ScheduleBut = new JButton("");
        ScheduleBut.setFont(new Font("Buffalo", Font.BOLD, 20));
        ScheduleBut.setBackground(new Color(29, 29, 29, 0));
        ScheduleBut.setOpaque(false);
        ScheduleBut.setBounds(190, 10, 110, 30);
        ScheduleBut.addActionListener(this);
        ScheduleBut.setBackground(new Color(1, 1, 1, 0));
        ScheduleBut.setBorder(BorderFactory.createEmptyBorder());

        TeamsButton = new JButton("");
        TeamsButton.setFont(new Font("Buffalo", Font.BOLD, 20));
        TeamsButton.setBackground(new Color(29, 29, 29, 0));
        TeamsButton.setOpaque(false);
        TeamsButton.setBounds(320, 10, 80, 30);
        TeamsButton.addActionListener(this);
        TeamsButton.setBackground(new Color(1, 1, 1, 0));
        TeamsButton.setBorder(BorderFactory.createEmptyBorder());

        ticketButton = new JButton("");
        ticketButton.setFont(new Font("Buffalo", Font.BOLD, 20));
        ticketButton.setBackground(new Color(29, 29, 29, 0));
        ticketButton.setOpaque(false);
        ticketButton.setBounds(425, 10, 80, 30);
        ticketButton.addActionListener(this);
        ticketButton.setBackground(new Color(1, 1, 1, 0));
        ticketButton.setBorder(BorderFactory.createEmptyBorder());

        MenuButton = new JButton("");
        MenuButton.setFont(new Font("Buffalo", Font.BOLD, 20));
        MenuButton.setBackground(new Color(29, 29, 29, 0));
        MenuButton.setOpaque(false);
        MenuButton.setBounds(530, 10, 70, 30);
        MenuButton.addActionListener(this);
        MenuButton.setBackground(new Color(1, 1, 1, 0));
        MenuButton.setBorder(BorderFactory.createEmptyBorder());

        KheloShopBut = new JButton("");
        KheloShopBut.setFont(new Font("Buffalo", Font.BOLD, 20));
        KheloShopBut.setBackground(new Color(29, 29, 29, 0));
        KheloShopBut.setOpaque(false);
        KheloShopBut.setBounds(630, 10, 118, 30);
        KheloShopBut.addActionListener(this);
        KheloShopBut.setBackground(new Color(1, 1, 1, 0));
        KheloShopBut.setBorder(BorderFactory.createEmptyBorder());

        SignupButton = new JButton("");
        SignupButton.setFont(new Font("Rockwell", Font.BOLD, 20));
        SignupButton.setBackground(new Color(1, 1, 1, 0));
        SignupButton.setBorder(BorderFactory.createEmptyBorder());
        SignupButton.setOpaque(false);
        SignupButton.setBounds(770, 10, 120, 30);
        SignupButton.addActionListener(this);

    BackButton = new JButton("Back");
    BackButton.setFont(new Font("Buffalo", Font.BOLD, 20));
    BackButton.setBackground(Color.black);
    BackButton.setForeground(Color.white);
    BackButton.setBounds(370, 435, 200, 30);
    BackButton.addActionListener(this);

       NextButton = new JButton("Next");
       NextButton.setFont(new Font("Rockwell", Font.BOLD, 20));
       NextButton.setBackground(Color.blue);
       NextButton.setForeground(Color.white);
       NextButton.setBounds(370, 400, 200, 30);
       NextButton.addActionListener(this);

        p2.add(HomeButton);
        p2.add(ScheduleBut);
        p2.add(TeamsButton);
        p2.add(ticketButton);
        p2.add(MenuButton);
        p2.add(KheloShopBut);
        p2.add(SignupButton);

            
        p4.add(c1);
        p4.add(c2);
        p4.add(c3);
        p4.add(r1);
        p4.add(r2);

      this.add(NextButton);
      this.add(BackButton);
      
      this.add(combo);
      this.add(combo1);
  

        p2.add(bkground);

        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
        this.add(l6);
     


        this.add(t1);
        this.add(t2);

        this.add(p4);
        this.add(p3);
        this.add(p2);
        

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == HomeButton) {
            this.setVisible(false);
            new Homepage();
        }

        if (ae.getSource() == ScheduleBut) {
            this.setVisible(false);
            new Schedule();
        }
        if (ae.getSource() == ticketButton) {
            this.setVisible(false);
            new Ticket();
        }
        if (ae.getSource() == SignupButton) {
            this.setVisible(false);
            new Signup();
        }
        if (ae.getSource() == TeamsButton) {
            this.setVisible(false);
            new Teams();

        }
        if (ae.getSource() == MenuButton) {
            this.setVisible(false);
            new Menu();

        }
        if (ae.getSource() == KheloShopBut) {
            this.setVisible(false);
            new KheloShop();
        }
        if (ae.getSource() == BackButton) {
            this.setVisible(false);
            new Signin1();
        }
        if (ae.getSource() == NextButton) {
            this.setVisible(false);
            new Meal();
        }
    }

    public static void main(String[] args) {
        CusInfor s = new CusInfor ();
        s.show();
    }
}
