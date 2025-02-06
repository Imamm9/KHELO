import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class KheloShop extends JFrame implements ActionListener {
        JLabel bkground;
        JTextField t1, t2;
        JButton HomeButton;
        JPanel p1, p2, p3, p4;
        ImageIcon image = new ImageIcon("KheloShop bk.jpg");
        

        public KheloShop() {
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
                HomeButton.setBounds(32, 15, 50, 40);
                HomeButton.addActionListener(this);
                HomeButton.setBackground(new Color(29, 29, 29, 0));
                HomeButton.setOpaque(false);
                HomeButton.setBackground(new Color(1, 1, 1,0));
                HomeButton.setBorder(BorderFactory.createEmptyBorder());
               

                p2.add(HomeButton);
               
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
               
        }
        public static void main(String[] args) {
                KheloShop s = new KheloShop();
                s.show();
        }
}
