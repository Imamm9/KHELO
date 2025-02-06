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

public class Meal extends JFrame implements ActionListener {
    JLabel bkground, l1, l2;
    JButton HomeButton, ScheduleBut, TeamsButton, ticketButton, MenuButton, KheloShopBut, SignupButton, NextButton,
            BackButton;
    JPanel p1, p2, p3, p4;
    JCheckBox c1, c2, c3;

    ImageIcon image = new ImageIcon("p1.png");

    public Meal() {
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

        c1 = new JCheckBox("Soft drinks price   : 10");
        c1.setBounds(380, 170, 200, 30);
        Color dark8 = new ColorUIResource(224, 255, 255);
        c1.setBackground(dark8);
        c1.setOpaque(true);

        c2 = new JCheckBox("Beaf Burger Price : 30");
        c2.setBounds(380, 210, 200, 30);
        Color dark9 = new ColorUIResource(224, 255, 255);
        c2.setBackground(dark9);
        c2.setOpaque(true);

        c3 = new JCheckBox("Chicken Burger Price : 25");
        c3.setBounds(380, 250, 200, 30);
        Color dark3 = new ColorUIResource(224, 255, 255);
        c3.setBackground(dark3);
        c3.setOpaque(true);

        l1 = new JLabel("            Meal");
        l1.setBounds(370, 55, 300, 100);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 25));

        l2 = new JLabel("Pre-order your meal");
        l2.setBounds(350, 95, 480, 100);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Serif", Font.BOLD, 20));

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

        this.add(c1);
        this.add(c2);
        this.add(c3);

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
            new CusInfor();
        }
        if (ae.getSource() == NextButton) {
            this.setVisible(false);
            new Checkticket();
        }
    }

    public static void main(String[] args) {
        Meal s = new Meal();
        s.show();
    }
}
