import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Venue extends JFrame implements ActionListener {
        JLabel bkground;
        JTextField t1, t2;
        JButton HomeButton,ScheduleBut,TeamsButton,ticketButton,KheloShopBut,MenuButton,SignupButton;
        JPanel p1, p2, p3, p4;
        ImageIcon image = new ImageIcon("Venue.jpg");
        

        public Venue () {
                super(" Khelo");
                this.setBounds(250, 70, 945, 615);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(true);
                this.setResizable(false);
                this.setLocationRelativeTo(null);

                this.getContentPane().setLayout(null);
                bkground = new JLabel();
                bkground.setSize(950,580);
                bkground.setIcon(image);

                

                p1 = new JPanel();
                p1.setBounds(0, 0, 0, 0);
                p1.setBackground(Color.gray);
                p1.setLayout(null);

                p2 = new JPanel();
                p2.setBounds(0, 0,940, 601);
                p2.setLayout(null);
                p2.setVisible(true);

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
              
                


                p2.add(HomeButton);
                p2.add(ScheduleBut);
                p2.add(TeamsButton);
                p2.add(ticketButton);
                p2.add(MenuButton);
                p2.add(KheloShopBut);
                p2.add(SignupButton);
               
                p2.add(bkground);
             

          
              

                this.add(p1);

                this.add(p2);
                this.add(p3);
                this.add(p4);
        }

        public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == HomeButton) {
                        this.setVisible(false);
                        new Homepage();
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
            if (ae.getSource() == ScheduleBut) {
                this.setVisible(false);
                new Schedule ();
        }
        }
        public static void main(String[] args) {
                Venue s = new Venue ();
                s.show();
        }
}
