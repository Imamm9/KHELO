import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.plaf.ColorUIResource;

public class Payment extends JFrame {

     JPanel p1,p2,p3,p4;
     JLabel l1, l2, l3,bkground;
  
   
    private JTextField tf1, tf2, tf3;
    private JPasswordField pf;
     JButton  HomeButton, ScheduleBut, TeamsButton, ticketButton, MenuButton, KheloShopBut, SignupButton, NextButton,
    BackButton;
 

    Payment() {


        super(" Khelo");
        this.setBounds(250, 70, 945, 615);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

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

        p4 = new JPanel();
        p4.setBounds(325, 130, 300, 350);
        Color dark = new ColorUIResource(224, 255, 255);
        p4.setBackground(dark);
        p4.setLayout(null);
        p4.setVisible(true);






        l1 = new JLabel();

        l1.setBounds(400, 20, 500, 50);
        

        l1.setFont("Serif", Font.BOLD, 35);
     


        l2 = new JLabel("We Accept Only card");
        l2.setBounds(420, 85, 500, 50);
       


        l2 = new JLabel("Card Details");
        l2.setBounds(420, 140, 500, 50);
   


        l3 = new JLabel("Name On Card");
        l3.setBounds(430, 180, 500, 50);
      
        tf1 = new JTextField();
        tf1.setBounds(570, 190, 235, 30);
      
        l3 = new JLabel("Card Number");
        l3.setBounds(430, 220, 500, 50);
    
        tf2 = new JTextField();
        tf2.setBounds(570, 230, 235, 30);
        tf2.setHorizontalAlignment(JTextField.CENTER);


        l3 = new JLabel("Valid On");
        l3.setBounds(430, 260, 500, 50);
    
    
        tf3 = new JTextField();
        tf3.setBounds(520, 270, 90, 30);
        tf3.setHorizontalAlignment(JTextField.CENTER);
     

        l3 = new JLabel("CVV Code");
        l3.setBounds(620, 260, 500, 50);
      
        pf = new JPasswordField();
        pf.setBounds(725, 270, 80, 30);
        pf.setHorizontalAlignment(JPasswordField.CENTER);
        pf.setEchoChar('*');
    































        
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


        p2.add(ScheduleBut);
        p2.add(TeamsButton);
        p2.add(ticketButton);
        p2.add(MenuButton);
        p2.add(KheloShopBut);
        p2.add(SignupButton);
      this.add(BackButton);
      this.add(NextButton);
      
  

        p2.add(bkground);

        this.add(l1);
        this.add(l2);
        this.add(l3);

       

        this.add(p4);
        this.add(p3);
        this.add(p2);

    }


    public static void main(String[] args) {
    Payment s = new Payment();
        s.show();
    }
}
