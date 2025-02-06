import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Buy ticket extends JFrame implements ActionListener {
        JLabel l1, l2, l3, l4, bcground, bkground;
        JTextField t1, t2;
        JButton HomeButton, ScheduleBut, TeamsButton, ticketButton, MenuButton, BuyButton, KheloShopBut, SignupButton;
        JPanel p1, p2, p3, p4;
        ImageIcon image = new ImageIcon("k111.gif");
        ImageIcon image1 = new ImageIcon("k2.png");

        public Buy ticket() {
                super(" Khelo");
                this.setBounds(250, 70, 950, 600);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(true);
                this.setResizable(false);

                this.getContentPane().setLayout(null);
                bkground = new JLabel();
                bkground.setSize(1200, 400);
                bkground.setIcon(image);

                this.getContentPane().setLayout(null);
                bcground = new JLabel();
                bcground.setSize(1200, 400);
                bcground.setIcon(image1);

                p1 = new JPanel();
                p1.setBounds(0, 0, 0, 0);
                p1.setBackground(Color.gray);
                p1.setLayout(null);

                p2 = new JPanel();
                p2.setBounds(0, 0, 1000, 300);
                p2.setLayout(null);
                p2.setVisible(true);

                JLabel l1 = new JLabel("Under Construction");
                l1.setBounds(350, 100, 500, 200);
                l1.setFont(new Font("MV Boli", Font.PLAIN, 50));

                JLabel l2 = new JLabel("Latest news");
                l2.setBounds(20, 300, 1000, 50);
                l2.setFont(new Font("Fiver", Font.PLAIN, 30));
                l2.setForeground(Color.WHITE);

                /*
                 * JLabel l3 = new JLabel("Argentina Qualified to semifinal!");
                 * l3.setBounds(60, 390, 1000, 50);
                 * l3.setFont(new Font("MV Boli", Font.PLAIN, 20));
                 * l3.setForeground(Color.black);
                 * 
                 * JLabel l4 = new JLabel("Can they beat croatia?See more");
                 * l4.setBounds(60, 410, 1000, 50);
                 * l4.setFont(new Font("MV Boli", Font.PLAIN, 20));
                 * l4.setForeground(Color.black);/*
                 */

                p3 = new JPanel();
                p3.setBounds(0, 300, 1000, 50);
                p3.setBackground(Color.gray);
                p3.setLayout(null);
                p3.setVisible(true);

                p4 = new JPanel();
                p4.setBounds(0, 235, 1000, 400);
                p4.setBackground(Color.white);
                p4.setLayout(null);
                p4.setVisible(true);

                /*
                 * try{
                 * i1=getIconImage(getClass().getResource("Khelo1.jpg"));
                 * p2=new JPanel(i1);
                 * this.add(p2);
                 * }
                 * catch(Exception e){
                 * System.out.println("Error");
                 * }
                 */

                HomeButton = new JButton("       ");
                HomeButton.setFont(new Font("Algerian", Font.BOLD, 20));
                HomeButton.setBounds(45, 10, 115, 30);
                HomeButton.addActionListener(this);
                HomeButton.setBackground(new Color(29, 29, 29, 0));
                HomeButton.setOpaque(false);
                HomeButton.setBackground(new Color(1, 1, 1,0));
                HomeButton.setBorder(BorderFactory.createEmptyBorder());
               

                ScheduleBut = new JButton("");
                ScheduleBut.setFont(new Font("Buffalo", Font.BOLD, 20));
                ScheduleBut.setBackground(new Color(29, 29, 29, 0));
                ScheduleBut.setOpaque(false);
                ScheduleBut.setBounds(190, 10, 110, 30);
                ScheduleBut.addActionListener(this);
                ScheduleBut.setBackground(new Color(1, 1, 1,0));
                ScheduleBut.setBorder(BorderFactory.createEmptyBorder());
               
                

                TeamsButton = new JButton("");
                TeamsButton.setFont(new Font("Buffalo", Font.BOLD, 20));
                TeamsButton.setBackground(new Color(29, 29, 29, 0));
                TeamsButton.setOpaque(false);
                TeamsButton.setBounds(320, 10, 80, 30);
                TeamsButton.addActionListener(this);
                TeamsButton.setBackground(new Color(1, 1, 1,0));
                TeamsButton.setBorder(BorderFactory.createEmptyBorder());
               

                ticketButton = new JButton("");
                ticketButton.setFont(new Font("Buffalo", Font.BOLD, 20));
                ticketButton.setBackground(new Color(29, 29, 29, 0));
                ticketButton.setOpaque(false);
                ticketButton.setBounds(425, 10, 80, 30);
                ticketButton.addActionListener(this);
                ticketButton.setBackground(new Color(1, 1, 1,0));
                ticketButton.setBorder(BorderFactory.createEmptyBorder());
               


                MenuButton = new JButton("");
                MenuButton.setFont(new Font("Buffalo", Font.BOLD, 20));
                MenuButton.setBackground(new Color(29, 29, 29, 0));
                MenuButton.setOpaque(false);
                MenuButton.setBounds(530, 10, 70, 30);
                MenuButton.addActionListener(this);
                MenuButton.setBackground(new Color(1, 1, 1,0));
                MenuButton.setBorder(BorderFactory.createEmptyBorder());
               
                

                KheloShopBut = new JButton("");
                KheloShopBut.setFont(new Font("Buffalo", Font.BOLD, 20));
                KheloShopBut.setBackground(new Color(29, 29, 29, 0));
                KheloShopBut.setOpaque(false);
                KheloShopBut.setBounds(630, 10, 118, 30);
                KheloShopBut.addActionListener(this);
                KheloShopBut.setBackground(new Color(1, 1, 1,0));
                KheloShopBut.setBorder(BorderFactory.createEmptyBorder());
               

                SignupButton = new JButton("");
                SignupButton.setFont(new Font("Rockwell", Font.BOLD, 20));
                SignupButton.setBackground(new Color(1, 1, 1,0));
               SignupButton.setBorder(BorderFactory.createEmptyBorder());
               SignupButton.setOpaque(false);
                SignupButton.setBounds(770, 10, 120, 30);
                SignupButton.addActionListener(this);
              
                
                

                BuyButton = new JButton("     ");
                BuyButton.setFont(new Font("Algeria", Font.BOLD, 20));
                BuyButton.setBounds(710, 230, 80, 50);
                BuyButton.addActionListener(this);
                BuyButton.setBackground(new Color(1, 1, 1,0));
                BuyButton.setBorder(BorderFactory.createEmptyBorder());
                BuyButton.setOpaque(false);

                p2.add(HomeButton);
                p2.add(ScheduleBut);
                p2.add(TeamsButton);
                p2.add(ticketButton);
                p2.add(MenuButton);
                p2.add(KheloShopBut);
                p2.add(SignupButton);
                p2.add(bkground);
                p4.add(bcground);

                this.add(BuyButton);
                this.add(l2);

                this.add(p1);

                this.add(p2);
                this.add(p3);
                this.add(p4);
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
               
        }

        public static void main(String[] args) {
                Buy ticket s = new Buy ticket();
                s.show();
        }
}
