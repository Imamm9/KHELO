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

public class Menu extends JFrame implements ActionListener {
    JLabel bkground, l1;
    JButton BackButton, FeedButton,VenueButton,
            ContactButton;
    JPanel p1, p2, p3, p4;


    ImageIcon image = new ImageIcon("p1.png");

    public Menu() {
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
        p1.setForeground(Color.gray);
        p1.setLayout(null);

        p2 = new JPanel();
        p2.setBounds(0, 0, 940, 601);
        p2.setLayout(null);
        p2.setVisible(true);

        p3 = new JPanel();
        p3.setBounds(325, 80, 300, 50);
        Color light = new ColorUIResource(245, 245, 220);
        p3.setForeground(light);
        p3.setLayout(null);
        p3.setVisible(true);

        p4 = new JPanel();
        p4.setBounds(325, 130, 300, 350);
        Color dark = new ColorUIResource(224, 255, 255);
        p4.setForeground(dark);
        p4.setLayout(null);
        p4.setVisible(true);
		

       

        l1 = new JLabel("            Menu");
        l1.setBounds(370, 55, 300, 100);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 25));

      

       /* HomeButton = new JButton("       ");
        HomeButton.setFont(new Font("Algerian", Font.BOLD, 20));
        HomeButton.setBounds(45, 10, 115, 30);
        HomeButton.addActionListener(this);
        HomeButton.setForeground(new Color(29, 29, 29, 0));
        HomeButton.setOpaque(false);
        HomeButton.setForeground(new Color(1, 1, 1, 0));
        HomeButton.setBorder(BorderFactory.createEmptyBorder());

        /*ScheduleBut = new JButton("");
        ScheduleBut.setFont(new Font("Buffalo", Font.BOLD, 20));
        ScheduleBut.setForeground(new Color(29, 29, 29, 0));
        ScheduleBut.setOpaque(false);
        ScheduleBut.setBounds(190, 10, 110, 30);
        ScheduleBut.addActionListener(this);
        ScheduleBut.setForeground(new Color(1, 1, 1, 0));
        ScheduleBut.setBorder(BorderFactory.createEmptyBorder());

        TeamsButton = new JButton("");
        TeamsButton.setFont(new Font("Buffalo", Font.BOLD, 20));
        TeamsButton.setForeground(new Color(29, 29, 29, 0));
        TeamsButton.setOpaque(false);
        TeamsButton.setBounds(320, 10, 80, 30);
        TeamsButton.addActionListener(this);
        TeamsButton.setForeground(new Color(1, 1, 1, 0));
        TeamsButton.setBorder(BorderFactory.createEmptyBorder());

        ticketButton = new JButton("");
        ticketButton.setFont(new Font("Buffalo", Font.BOLD, 20));
        ticketButton.setForeground(new Color(29, 29, 29, 0));
        ticketButton.setOpaque(false);
        ticketButton.setBounds(425, 10, 80, 30);
        ticketButton.addActionListener(this);
        ticketButton.setForeground(new Color(1, 1, 1, 0));
        ticketButton.setBorder(BorderFactory.createEmptyBorder());

        MenuButton = new JButton("");
        MenuButton.setFont(new Font("Buffalo", Font.BOLD, 20));
        MenuButton.setForeground(new Color(29, 29, 29, 0));
        MenuButton.setOpaque(false);
        MenuButton.setBounds(530, 10, 70, 30);
        MenuButton.addActionListener(this);
        MenuButton.setForeground(new Color(1, 1, 1, 0));
        MenuButton.setBorder(BorderFactory.createEmptyBorder());

        KheloShopBut = new JButton("");
        KheloShopBut.setFont(new Font("Buffalo", Font.BOLD, 20));
        KheloShopBut.setForeground(new Color(29, 29, 29, 0));
        KheloShopBut.setOpaque(false);
        KheloShopBut.setBounds(630, 10, 118, 30);
        KheloShopBut.addActionListener(this);
        KheloShopBut.setForeground(new Color(1, 1, 1, 0));
        KheloShopBut.setBorder(BorderFactory.createEmptyBorder());

        SignupButton = new JButton("");
        SignupButton.setFont(new Font("Rockwell", Font.BOLD, 20));
        SignupButton.setForeground(new Color(1, 1, 1, 0));
        SignupButton.setBorder(BorderFactory.createEmptyBorder());
        SignupButton.setOpaque(false);
        SignupButton.setBounds(770, 10, 120, 30);
        SignupButton.addActionListener(this);*/

        ContactButton = new JButton("Contact");
        ContactButton.setFont(new Font("Buffalo", Font.BOLD, 20));
        ContactButton.setBackground(Color.blue);
        ContactButton.setForeground(Color.white);
        ContactButton.setBounds(370, 120, 200, 30);
        ContactButton.addActionListener(this);

        FeedButton = new JButton("Share your feedback");
        FeedButton.setFont(new Font("Rockwell", Font.BOLD, 20));
        FeedButton.setBackground(Color.blue);
        FeedButton.setForeground(Color.white);
        FeedButton.setBounds(350, 160, 250, 30);
        FeedButton.addActionListener(this);
		
		
		        
				VenueButton = new JButton("Check venues");
        VenueButton.setFont(new Font("Rockwell", Font.BOLD, 20));
        VenueButton.setBackground(Color.blue);
        VenueButton.setForeground(Color.white);
        VenueButton.setBounds(370, 200, 200, 30);
        VenueButton.addActionListener(this);
		
		BackButton = new JButton("Back");
        BackButton.setFont(new Font("Rockwell", Font.BOLD, 20));
        BackButton.setBackground(Color.blue);
        BackButton.setForeground(Color.white);
        BackButton.setBounds(430, 400, 100, 30);
        BackButton.addActionListener(this);

        
         this.add(BackButton);
        
        this.add(ContactButton);
        this.add(FeedButton);
		this.add(VenueButton);

        p2.add(bkground);

        this.add(l1);
        

        
        this.add(p4);
        this.add(p3);
        this.add(p2);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == BackButton) {
            this.setVisible(false);
            new Homepage();
        }

        
        
        if (ae.getSource() == ContactButton) {
            this.setVisible(false);
            new Contact();
        }
        if (ae.getSource() == FeedButton) {
            this.setVisible(false);
            new Feedback();
        }
		  if (ae.getSource() == VenueButton) {
            this.setVisible(false);
            new Venue();
        }
    }

    public static void main(String[] args) {
        Menu s = new Menu();
        s.show();
    }
}
