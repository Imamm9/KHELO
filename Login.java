

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
        JLabel l1, l2, l3, l4;
        JTextField t1, t2;
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
        JPanel p1, p2, p3, p4;
        ImageIcon image/* , i1 */;

        /**
         * 
         */
        public Login() {
                super(" Khelo");
                this.setBounds(50, 50, 1200, 700);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(true);
                this.setResizable(false);
                this.setLocationRelativeTo(null);

                
                p1 = new JPanel();
                p1.setBounds(0, 0, 1200, 50);
                p1.setBackground(Color.gray);
                p1.setLayout(null);

                p2 = new JPanel();
                p2.setBounds(0, 50, 1200, 400);
                p2.setBackground(Color.green);
                p2.setLayout(null);
                p2.setVisible(true);

                JLabel l1 = new JLabel("Under Construction");
                l1.setBounds(350, 100, 500, 200);
                l1.setFont(new Font("MV Boli", Font.PLAIN, 50));

                JLabel l2 = new JLabel("Latest news");
                l2.setBounds(20, 400, 1200, 50);
                l2.setFont(new Font("Fiver", Font.PLAIN, 30));

                JLabel l3 = new JLabel("Argentina Qualified to semifinal! Can they beat croatia?See more");
                l3.setBounds(100, 450, 1200, 50);
                l3.setFont(new Font("MV Boli", Font.PLAIN, 20));
                l3.setForeground(Color.WHITE);

                p3 = new JPanel();
                p3.setBounds(0, 400, 1200, 50);
                p3.setBackground(Color.white);
                p3.setLayout(null);

                p4 = new JPanel();
                p4.setBounds(0, 450, 1200, 200);
                p4.setBackground(Color.black);
                p4.setLayout(null);

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

                b1 = new JButton("Home");
                b1.setFont(new Font("Algerian", Font.BOLD, 20));
                b1.setBackground(Color.cyan);
                b1.setForeground(Color.BLACK);
                b1.setBounds(25, 10, 100, 30);
                b1.addActionListener(this);

                b2 = new JButton("Schedule");
                b2.setFont(new Font("Buffalo", Font.BOLD, 20));
                b2.setBackground(Color.white);
                b2.setBounds(150, 10, 125, 30);
                b2.addActionListener(this);

                b3 = new JButton("Teams");
                b3.setFont(new Font("Buffalo", Font.BOLD, 20));
                b3.setBackground(Color.white);
                b3.setBounds(300, 10, 100, 30);
                b3.addActionListener(this);

                b4 = new JButton("tickets");
                b4.setFont(new Font("Buffalo", Font.BOLD, 20));
                b4.setBackground(Color.white);
                b4.setBounds(425, 10, 100, 30);
                b4.addActionListener(this);

                b5 = new JButton("Menu");
                b5.setFont(new Font("Buffalo", Font.BOLD, 20));
                b5.setBackground(Color.white);
                b5.setBounds(550, 10, 100, 30);
                b5.addActionListener(this);

                b6 = new JButton("KheloShop");
                b6.setFont(new Font("Buffalo", Font.BOLD, 20));
                b6.setBackground(Color.white);
                b6.setBounds(675, 10, 140, 30);
                b6.addActionListener(this);

                b7 = new JButton("Exit");
                b7.setFont(new Font("Buffalo", Font.BOLD, 20));
                b7.setBackground(Color.red);
                b7.setForeground(Color.WHITE);
                b7.setBounds(1050, 10, 100, 30);
                b7.addActionListener(this);

                p1.add(b1);
                p1.add(b2);
                p1.add(b3);
                p1.add(b4);
                p1.add(b5);
                p1.add(b6);
                p1.add(b7);

                p2.add(l1);
                p2.add(l2);
                p2.add(l3);

                this.add(p1);
                p2.add(p3);
                p2.add(p4);
                this.add(p2);

                

                
        


        }

        public void actionPerformed(ActionEvent ae) {
                new Schedule ();
                new Ticket ();
                
        }

   


        public static void main(String[] args) {
                Login s = new Login();
                s.show();
        }

    }

