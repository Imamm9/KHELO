import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class Checkticket extends JFrame implements ActionListener {
    JLabel bkground, l1, l2, l3,l4,l5,l6,l7,l8,l9,l10;
    JButton HomeButton, ScheduleBut, TeamsButton, ticketButton, MenuButton, KheloShopBut, SignupButton,PrintButton,
            BackButton;
    JPanel p1, p2, p3, p4,p5;


    ImageIcon image = new ImageIcon("p1.png");

                    








    public Checkticket() {
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
        p2.setBounds(0, 0, 940, 600);
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


        p5 = new JPanel();
        p5.setBounds(368, 140, 185, 190);
        Color papaya = new ColorUIResource(250, 250, 210);
        p5.setBackground(papaya);
        p5.setLayout(null);
        p5.setVisible(true);


        l1 = new JLabel("       Order Details");
        l1.setBounds(370, 55, 300, 100);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 25));

        l2 = new JLabel("Ticket category");
        l2.setBounds(380, 120, 480, 100);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Serif", Font.PLAIN, 20));

        l3 = new JLabel("Exclusive");
        l3.setBounds(380, 140, 550, 100);
        l3.setForeground(Color.PINK);
        l3.setFont(new Font("Serif",Font.ITALIC, 20));


        l4 = new JLabel("Ticket $2000   Quantity x2");
        l4.setBounds(380,160 , 300, 100);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Serif", Font.PLAIN, 16));

        l5 = new JLabel("Meal  ($30 + $10)");
        l5.setBounds(380, 180, 480, 100);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Serif", Font.PLAIN, 16));

        l6 = new JLabel("Total Price");
        l6.setBounds(380, 225, 550, 100);
        l6.setForeground(Color.BLUE);
        l6.setFont(new Font("Serif", Font.BOLD, 20));

        
        l7 = new JLabel("...............................");
        l7.setBounds(380, 210, 550, 100);
        l7.setForeground(Color.GRAY);
        l7.setFont(new Font("Serif", Font.BOLD, 20));

        l8 = new JLabel("...............................");
        l8.setBounds(380, 230, 550, 100);
        l8.setForeground(Color.GRAY);
        l8.setFont(new Font("Serif", Font.BOLD, 20));

        
        l9 = new JLabel("$2050");
        l9.setBounds(480, 225, 550, 100);
        l9.setForeground(Color.GREEN);
        l9.setFont(new Font("Serif", Font.BOLD, 20));


         
        l10 = new JLabel("Parking slot $10");
        l10.setBounds(380, 200, 550, 100);
        l10.setForeground(Color.black);
        l10.setFont(new Font("Serif", Font.PLAIN, 16));

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

     PrintButton= new JButton("Print your ticket");
       PrintButton.setFont(new Font("Buffalo", Font.BOLD, 20));
       PrintButton.setBackground(Color.BLUE);
       PrintButton.setForeground(Color.WHITE);
       PrintButton.setBounds(357, 370, 230, 30);
       PrintButton.addActionListener(this);
       PrintButton.setVisible(true);







  
        p2.add(HomeButton);
        p2.add(ScheduleBut);
        p2.add(TeamsButton);
        p2.add(ticketButton);
        p2.add(MenuButton);
        p2.add(KheloShopBut);
        p2.add(SignupButton);
        this.add(PrintButton);
        p2.add(bkground);

        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
        this.add(l6);
        this.add(l7);
        this.add(l8);
        this.add(l9);
        this.add(l10);
      
        this.add(p1);
        this.add(p5);
        this.add(p4);
        this.add(p3);
        this.add(p2);

    }

    public void actionPerformed(ActionEvent ae) {
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
        if (ae.getSource() ==PrintButton) {

                                     JOptionPane.showMessageDialog(this,"You bought ticket successfully");
              this.setVisible(false);
              new Homepage();

        }
    }

    public static void main(String[] args) {
        Checkticket s = new Checkticket();
        s.show();
    }
}
