import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;


public class Signup extends JFrame implements ActionListener {

    
    String contactnum,password;
    JLabel bkground, l1, l2, l3,l5,l6,l4;
    JTextField t1, t2,t3,t4;
    JButton HomeButton, ScheduleBut, TeamsButton, ticketButton, MenuButton, KheloShopBut, SignupButton1;
    JPanel p1, p2, p3, p4;
    JPasswordField pf1,pf2;

    ImageIcon image = new ImageIcon("p1.png");
	 

    public Signup() {
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
        p3.setBounds(300, 70, 360, 50);
        Color light = new ColorUIResource(245, 245, 220);
        p3.setBackground(light);
        p3.setLayout(null);
        p3.setVisible(true);

        p4 = new JPanel();
        p4.setBounds(300, 120, 360, 450);
        Color dark = new ColorUIResource(224, 255, 255);
        p4.setBackground(dark);
        p4.setLayout(null);
        p4.setVisible(true);

        l1 = new JLabel("Create Your Account Here");
        l1.setBounds(50, 0, 400, 50);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 25));
		p3.add(l1);

        l2 = new JLabel("Username");
        l2.setBounds(30, 0, 480, 80);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Serif", Font.BOLD, 20));
        p4.add(l2);
		t2= new JTextField();
		t2.setBounds(30,60,200,30);
		p4.add(t2);
        l3 = new JLabel("Enter Email");
        l3.setBounds(30, 75, 550, 80);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Serif", Font.BOLD, 20));
		p4.add(l3);
		t3=new JTextField();
		t3.setBounds(30,130,200,30);
		p4.add(t3);
		l4=new JLabel("Phoneno");
		l4.setBounds(30,145,550,80);
		l4.setForeground(Color.BLACK);
		l4.setFont(new Font("Serif",Font.BOLD,20));
		p4.add(l4);
		t4=new JTextField();
		t4.setBounds(30,200,200,30);
		p4.add(t4);
		l5=new JLabel("Password");
		l5.setBounds(30,215,550,80);
		l5.setForeground(Color.BLACK);
		l5.setFont(new Font("Serif",Font.BOLD,20));
		p4.add(l5);
		pf1=new JPasswordField();
		pf1.setBounds(30,275,200,30);
		p4.add(pf1);
		l6=new JLabel("Confirm Password");
		l6.setBounds(30,290,550,80);
		l6.setForeground(Color.BLACK);
		l6.setFont(new Font("Serif",Font.BOLD,20));
		p4.add(l6);
		pf2=new JPasswordField();
		pf2.setBounds(30,345,200,30);
		p4.add(pf2);
		

        

        

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

       
        SignupButton1 = new JButton("Signup");
        SignupButton1.setFont(new Font("Buffalo", Font.BOLD, 20));
        SignupButton1.setBackground(Color.BLUE);
         SignupButton1.setForeground(Color.WHITE);
        SignupButton1.setBounds(50, 400, 200, 30);
        SignupButton1.setVisible(true);
        SignupButton1.addActionListener(this);
        
     

        
        p2.add(HomeButton);
        p2.add(ScheduleBut);
        p2.add(TeamsButton);
        p2.add(ticketButton);
        p2.add(MenuButton);
        p2.add(KheloShopBut);
        p4.add(SignupButton1);
     
        p2.add(bkground);

        
        this.add(p1);

        this.add(p4);
        this.add(p3);
        this.add(p2);

    }
     

       
        
           

                /*public void actionPerformed(ActionEvent ae)
    {

    
        if(ae.getSource()==SignupButton1)
        {
         
            String UserName = t2.getText();
           
            
            String Email = t3.getText();
            String Phoneno =   t4.getText();
            String Password =  pf1.getText();
            String ConfirmPassword = pf2.getText();

            String contactnum;
            if(Username.isEmpty() ||  Email.isEmpty() || Phoneno.isEmpty() || contactnum.isEmpty() || Password.isEmpty() || ConfirmPassword.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Fill your informations", "MISSING INFORMATION",JOptionPane.WARNING_MESSAGE);
            }
            else if(Password.equals(Password))
            {
                CreateUserAccount cua1 = new CreateUserAccount();
                cua1.addAccount();
                JOptionPane.showMessageDialog(this, "Account Added");
               
                t2.setText("");
                t3.setText("");
                t4.setText("");
                pf1.setText("");
                pf2.setText("");
        
        this.setVisible(false);
        Signup log = new Signup();
        log.setVisible(true);
        
            }
            else{JOptionPane.showMessageDialog(this, "Check Password");}

            
        }
      
      

   
      
    }
        /* */

                                
  public static void main(String[] args) {

       Signup s= new Signup();
        s.show();
  }

  public void actionPerformed(ActionEvent evt){

    String unName = t2.getText();
    String email = t3.getText();
    String mNumber = t4.getText();
    String password= String.valueOf(pf1.getPassword());
    String conPass = String.valueOf(pf2.getPassword());

    if (evt.getSource() == SignupButton1);
    {
         if(password.equals(conPass) && mNumber.isEmpty()!=true && unName.isEmpty()!=true && email.isEmpty()!=true)
         {
            // for(pr=pr;pr<100;pr++)
            // {
                
            // }
           
            Person temp=new Person(mNumber,conPass);
            Signin1.AddNewUser(temp);

            JOptionPane.showMessageDialog(this,"Account successfully created");
            this.setVisible(false);
            new Buyticket();
         }
         else
         JOptionPane.showMessageDialog(this,"Please Fill all the fields correctly");
         

    }
   }
}


