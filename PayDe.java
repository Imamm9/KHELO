  JLabel bkground, l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3;
    JButton HomeButton, ScheduleBut, TeamsButton, ticketButton, MenuButton, KheloShopBut, SignupButton, ProceedButton;
    JPanel p1, p2, p3, p4;
    JPasswordField pf1;

    ImageIcon image = new ImageIcon("p1.png");

    public PayDe() {
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



        t1 = new JTextField("");
        t1.setBounds(350, 155, 150, 25);

        t2 = new JTextField("");
        t2.setBounds(350, 200, 150, 25);

        t3 = new JTextField("");
        t3.setBounds(350, 155, 150, 25);


        
        pf1 = new JPasswordField();
        pf1.setBounds(380, 260, 120, 25);



        l1 = new JLabel("Payment details");
        l1.setBounds(370, 55, 300, 100);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 25));

        l4= new JLabel("One last Step!");
        l2.setBounds(330, 130, 480, 100);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Serif", Font.BOLD, 16));

        l3 = new JLabel("Card number");
        l3.setBounds(330, 160, 550, 100);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Serif", Font.BOLD, 15));

       l4= new JLabel("Card holder name");
        l4.setBounds(330, 180, 380, 100);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Serif", Font.BOLD, 16));

        l5 = new JLabel("EXPIRY");
        l5.setBounds(330, 200, 550, 100);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Serif", Font.BOLD, 15));

        l6 = new JLabel("CVV");
        l6.setBounds(330, 220, 650, 100);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Serif", Font.BOLD, 15));


        l7 = new JLabel("Total: $1230 ");
        l7.setBounds(330, 240, 550, 100);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Serif", Font.BOLD, 15));

