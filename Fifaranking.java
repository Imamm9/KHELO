import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Fifaranking extends JFrame implements ActionListener {
        JLabel l1, l2, l3, l4,l0,l8;
        JTextField t1, t2;
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
        JPanel p1, p2, p3, p4,p5;
        ImageIcon image;

        /**
         * 
         */
        public Fifaranking() {
                super(" Khelo");
                this.setBounds(50, 50, 1200, 700);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(true);

                p1 = new JPanel();
                p1.setBounds(0, 0, 1200, 50);
                p1.setBackground(Color.gray);
                p1.setLayout(null);

                p2 = new JPanel();
                p2.setBounds(0, 50, 1200, 400);
                p2.setBackground(Color.green);
                p2.setLayout(null);
                p2.setVisible(true);
				p5 = new JPanel();
                p5.setBounds(300, 80,600,314);
                p5.setBackground(Color.white);
                p5.setLayout(null);
                p5.setVisible(true);

                 
                
                JLabel l0 = new JLabel("Country     trophy     Ranking"); 
                l0.setBounds(400, 120, 400, 30);
                l0.setFont(new Font("MV Boli", Font.PLAIN, 20));
                
              
				 
                JLabel l1 = new JLabel("1)Brazil       *****           1"); 
                l1.setBounds(400, 150, 400, 30);
                l1.setFont(new Font("MV Boli", Font.PLAIN, 20));
				
				JLabel l2 = new JLabel("2)Belgium       0          2"); 
                l2.setBounds(400, 180, 400, 30);
                l2.setFont(new Font("MV Boli", Font.PLAIN, 20));
				  
				JLabel l3 = new JLabel("3)Argentina     **         3"); 
                l3.setBounds(400, 210, 400, 30);
                l3.setFont(new Font("MV Boli", Font.PLAIN, 20));
				
				JLabel l4 = new JLabel("4)France        **          4"); 
                l4.setBounds(400, 240, 400, 30);
                l4.setFont(new Font("MV Boli", Font.PLAIN, 20));
				
				JLabel l5 = new JLabel("5)England       *          5"); 
                l5.setBounds(400, 270, 400, 30);
                l5.setFont(new Font("MV Boli", Font.PLAIN, 20));
				
				JLabel l6 = new JLabel("6)Italy       ****           6"); 
                l6.setBounds(400, 300, 400, 30);   
                l6.setFont(new Font("MV Boli", Font.PLAIN, 20));
				
				JLabel l7 = new JLabel("7)Spain         *           7"); 
                l7.setBounds(400, 330, 400, 30);
                l7.setFont(new Font("MV Boli", Font.PLAIN, 20));

                JLabel l8 = new JLabel("8)Germany     ****         8"); 
                l8.setBounds(400, 360, 400, 30);
                l8.setFont(new Font("MV Boli", Font.PLAIN, 20));



                
				

                p3 = new JPanel();
                p3.setBounds(0, 400, 1200, 50);
                p3.setBackground(Color.white);
                p3.setLayout(null);
                //JLabel l2 = new JLabel("Latest news");
                //l2.setBounds(20, 400, 500, 200);
                //l2.setFont(new Font("MV Boli", Font.PLAIN, 20));

                p4 = new JPanel();
                p4.setBounds(0, 450, 1200, 200);
                p4.setBackground(Color.black);
                p4.setLayout(null);

                b1 = new JButton("Home");
                b1.setFont(new Font("Algerian", Font.BOLD, 20));
                b1.setBackground(Color.cyan);
                b1.setForeground(Color.BLACK);
                b1.setBounds(25, 10, 400, 30);
                b1.addActionListener(this);

                b2 = new JButton("Schedule");
                b2.setFont(new Font("Buffalo", Font.BOLD, 20));
                b2.setBackground(Color.white);
                b2.setBounds(150, 10, 125, 30);
                b2.addActionListener(this);

                b3 = new JButton("Teams");
                b3.setFont(new Font("Buffalo", Font.BOLD, 20));
                b3.setBackground(Color.white);
                b3.setBounds(300, 10, 400, 30);
                b3.addActionListener(this);

                b4 = new JButton("tickets");
                b4.setFont(new Font("Buffalo", Font.BOLD, 20));
                b4.setBackground(Color.white);
                b4.setBounds(425, 10, 400, 30);
                b4.addActionListener(this);

                b5 = new JButton("Menu");
                b5.setFont(new Font("Buffalo", Font.BOLD, 20));
                b5.setBackground(Color.white);
                b5.setBounds(400, 10, 400, 30);
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
                b7.setBounds(1050, 10, 400, 30);
                b7.addActionListener(this);

                p2.add(l0);
				p2.add(l1);
				p2.add(l2);
				p2.add(l3);
				p2.add(l4);
				p2.add(l5);
				p2.add(l6);
				p2.add(l7);
                p2.add(l8);
				





                p1.add(b1);
                p1.add(b2);
                p1.add(b3);
                p1.add(b4);
                p1.add(b5);
                p1.add(b6);
                p1.add(b7);

                

                this.add(p1);
                p2.add(p3);
                p2.add(p4);
				p2.add(p5);
				
                this.add(p2);

        }

        public void actionPerformed(ActionEvent ae) {
			
		 b2.addActionListener(this);
        }

        public static void main(String[] args) {
			    
                Fifaranking f = new Fifaranking();
                f.show();
        }
}
