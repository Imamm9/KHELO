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

public class Signin extends JFrame implements ActionListener {
    static Person persons[] = new Person [100000];
    static Person person;
    JLabel bkground, l1, l2, l3;
    JTextField t1, t2;
    JButton HomeButton, ScheduleBut, TeamsButton, ticketButton, MenuButton, KheloShopBut, SignupButton, LoginButton,
            BackButton;
    JPanel p1, p2, p3, p4;
    JPasswordField pf1;

    File f = new File("C:\\Khelo");
    int ln;

    void createFolder() {
        if (!f.exists()) {
            f.mkdirs();

        }
    }

    void readFile() {
        try {
            FileReader fr = new FileReader(f + "\\logins.txt");
            System.out.println("file exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(f + "\\logins.txt0");
                System.out.println("File created");

            } catch (IOException ex1) {

            }
        }

    }

    void logic(String usr, String pswd) {

        try {

            RandomAccessFile raf = new RandomAccessFile(f + "\\logins.txt", "rw");
            for (int i = 0; i < ln; i += 7) {
                System.out.println("count" + i);

                String forUser = raf.readLine().substring(6);
                String forPswd = raf.readLine().substring(9);
                System.out.println(forUser + forPswd);
                if (usr.equals(forUser) & pswd.equals(forPswd)) {
                    JOptionPane.showMessageDialog(null, "Login Successful :)");
                    break;
                } else if (i == (ln - 6)) {
                    JOptionPane.showMessageDialog(null, "Incorrect Username/Password.Try again :(");
                    break;
                }

                for (int k = 1; k <= 5; k++) {
                    raf.readLine();
                }
            }

        }

        catch (FileNotFoundException ex) {

        }

        catch (IOException ex) {

        }

    }

    void countLines() {
        try {
            ln = 0;
            RandomAccessFile raf = new RandomAccessFile(f + "\\logins.txt", "rw");
            for (int i = 0; raf.readLine() != null; i++) {
                ln++;
            }
            System.out.println("number of lines:" + ln);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    ImageIcon image = new ImageIcon("p1.png");

    public Signin() {
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

        l1 = new JLabel("Login your Account");
        l1.setBounds(370, 55, 300, 100);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 25));

        l2 = new JLabel("Enter PhoneNO:");
        l2.setBounds(380, 120, 480, 100);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Serif", Font.BOLD, 20));

        l3 = new JLabel("Enter Password");
        l3.setBounds(380, 190, 550, 100);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Serif", Font.BOLD, 20));

        t1 = new JTextField();
        t1.setBounds(380, 190, 160, 25);
        t1.setHorizontalAlignment(JTextField.CENTER);
     
    

        pf1 = new JPasswordField();
        pf1.setBounds(380, 260, 120, 25);
        pf1.setHorizontalAlignment(JPasswordField.CENTER);
        pf1.setEchoChar('*');
    

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

        LoginButton = new JButton("LogIn");
        LoginButton.setFont(new Font("Buffalo", Font.BOLD, 20));
        LoginButton.setBackground(Color.BLUE);
        LoginButton.setForeground(Color.WHITE);
        LoginButton.setBounds(380, 300, 100, 30);
        LoginButton.addActionListener(this);
        LoginButton.setVisible(true);
        
        BackButton = new JButton("Back");
        BackButton.setFont(new Font("Rockwell", Font.BOLD, 20));
        BackButton.setBackground(Color.black);
        BackButton.setForeground(Color.white);
        BackButton.setBounds(380, 350, 100, 30);
        BackButton.addActionListener(this);
        BackButton.setVisible(true);

        
        p2.add(HomeButton);
        p2.add(ScheduleBut);
        p2.add(TeamsButton);
        p2.add(ticketButton);
        p2.add(MenuButton);
        p2.add(KheloShopBut);
        p2.add(SignupButton);
        this.add(LoginButton);
        this.add(BackButton);
        p2.add(bkground);

        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(t1);
        this.add(pf1);
        this.add(p1);

        this.add(p4);
        this.add(p3);
        this.add(p2);

    }
    public static void AddNewUser(Person a)
	{

		for(int i = 0; i<persons.length; i++)
		{
			if(persons[i] == null)
			{
				persons[i] = a;
				break;
			}
		}
		
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
        if (ae.getSource() == LoginButton) {

            String user = t1.getText();
			String pass = String.valueOf(pf1.getPassword());
			int counter = 0;
			
			for(int j=0; j<persons.length; j++){
				if(persons[j]!=null){
					if( user.equals(persons[j].getMobileNumber())){
						if( pass.equals(persons[j].getPass())){
							person = persons[j];
							counter = 1;
							break;
						}
					}
				}
			}		
			
			if(counter==1){
                this.setVisible(false);
                new CusInfor();
			}
            else
			{
				JOptionPane.showMessageDialog(null, "Invalid username or password");
			}

           
    }
    if (ae.getSource() == BackButton) {
            this.setVisible(false);
            new Homepage();
    }

    }

    public void showData() {

        JFrame f1 = new JFrame();
        JLabel I, IO;
        String str1 = t1.getText();
        char[] p = pf1.getPassword();
        String str2 = new String(p);
        try {

            createFolder();
            readFile();
            countLines();
            logic(str1, str2);
        } catch (Exception ex) {

            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        Signin s = new Signin();
        s.show();
    }
}
