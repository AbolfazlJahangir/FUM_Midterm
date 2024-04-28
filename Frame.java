import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Frame extends JFrame implements MouseListener, ActionListener {

    public static final int ICON_SIZE = 90;
    
    JFrame myFrame = this;

    Player player1 = new Player(1);
    Player player2 = new Player(2);
    
    JLabel player1NameLabel;
    JLabel player1InfoLabel;
    JLabel colorTitles1;
    JLabel specialLabel1;
    JLabel coinLabel1;
    JLabel scoreLabel1;
    
    JLabel player2NameLabel;
    JLabel player2InfoLabel;
    JLabel colorTitles2;
    JLabel specialLabel2;
    JLabel coinLabel2;
    JLabel scoreLabel2;

    JLabel player1Label = new JLabel();
    JLabel player2Label = new JLabel();

    JLabel coinLabel = new JLabel();
    JLabel gameLabel = new JLabel();

    ImageIcon gameIcon = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\titleImage.jpg");
    ImageIcon coin = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\coinIcon.png");
    ImageIcon background = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\background.jpg");

    ImageIcon s1 = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\specials\\rsz_20001.jpg");
    ImageIcon s2 = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\specials\\rsz_20002.jpg");
    ImageIcon s3 = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\specials\\rsz_20003.jpg");
    ImageIcon s4 = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\specials\\rsz_20004.jpg");
    ImageIcon s5 = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\specials\\rsz_20005.jpg");
    ImageIcon s6 = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\specials\\rsz_20006.jpg");
    ImageIcon s7 = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\specials\\rsz_20007.jpg");
    ImageIcon s8 = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\specials\\rsz_20008.jpg");
    ImageIcon s9 = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\specials\\rsz_20009.jpg");
    ImageIcon s10 = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\specials\\rsz_20010.jpg");
    ImageIcon s11 = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\specials\\rsz_20011.jpg");
    ImageIcon[] specials = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11};

    ImageIcon[] arrayIcons = new ImageIcon[ICON_SIZE];
    Card[] c = new Card[90];
    
    JLabel specialCardLabel1 = new JLabel(s1);
    JLabel specialCardLabel2 = new JLabel(s2);
    JLabel specialCardLabel3 = new JLabel(s3);

    JLabel cardLabel1 = new JLabel();
    JLabel cardLabel2 = new JLabel();
    JLabel cardLabel3 = new JLabel();
    JLabel cardLabel4 = new JLabel();
    JLabel cardLabel5 = new JLabel();
    JLabel cardLabel6 = new JLabel();
    JLabel cardLabel7 = new JLabel();
    JLabel cardLabel8 = new JLabel();
    JLabel cardLabel9 = new JLabel();
    JLabel cardLabel10 = new JLabel();
    JLabel cardLabel11 = new JLabel();
    JLabel cardLabel12 = new JLabel();

    JLabel cardBuyLabel1;
    JLabel cardBuyLabel2;
    JLabel cardBuyLabel3;
    JLabel cardBuyLabel4;
    JLabel cardBuyLabel5;
    JLabel cardBuyLabel6;
    JLabel cardBuyLabel7;
    JLabel cardBuyLabel8;
    JLabel cardBuyLabel9;
    JLabel cardBuyLabel10;
    JLabel cardBuyLabel11;
    JLabel cardBuyLabel12;

    ImageIcon blackIcon = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\tokens\\BlackToken.jpg");
    ImageIcon whiteIcon = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\tokens\\WhiteToken.jpg");
    ImageIcon blueIcon = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\tokens\\BlueToken.jpg");
    ImageIcon redIcon = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\tokens\\RedToken.jpg");
    ImageIcon greenIcon = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\tokens\\GreenToken.jpg");
    ImageIcon goldIcon = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\tokens\\GoldToken.jpg");
    
    int blackCount = 4;
    int whiteCount = 4;
    int blueCount = 4;
    int redCount = 4;
    int greenCount = 4;
    int goldCount = 4;

    JButton black1 = new JButton(blackIcon);
    JButton white1 = new JButton(whiteIcon);
    JButton blue1 = new JButton(blueIcon);
    JButton red1 = new JButton(redIcon);
    JButton green1 = new JButton(greenIcon);
    JButton done1 = new JButton("Done!");

    JLabel black1Label = new JLabel("BLACK: " + this.blackCount);
    JLabel white1Label = new JLabel("WHITE: " + this.whiteCount);
    JLabel blue1Label = new JLabel("BLUE: " + this.blueCount);
    JLabel red1Label = new JLabel("RED: " + this.redCount);
    JLabel green1Label = new JLabel("GREEN: " + this.greenCount);

    JButton black2 = new JButton(blackIcon);
    JButton white2 = new JButton(whiteIcon);
    JButton blue2 = new JButton(blueIcon);
    JButton red2 = new JButton(redIcon);
    JButton green2 = new JButton(greenIcon);
    JButton done2 = new JButton("Done!");
    
    JLabel black2Label = new JLabel("BLACK: " + this.blackCount);
    JLabel white2Label = new JLabel("WHITE: " + this.whiteCount);
    JLabel blue2Label = new JLabel("BLUE: " + this.blueCount);
    JLabel red2Label = new JLabel("RED: " + this.redCount);
    JLabel green2Label = new JLabel("GREEN: " + this.greenCount);

    boolean blackState = false, whiteState = false, blueState = false, redState = false, greenState = false;
    boolean bs = true, ws = true, bls = true, rs = true, gs = true;
    boolean anyButtonClicked2Coin = false, anyButtonClickedCoin = false;

    int chanceCoin;
    JFrame get2Frame = new JFrame("Get 2 coin");
    JFrame get3Frame = new JFrame("Get 3 coin");
    JLabel get2Label = new JLabel();
    JLabel get3Label = new JLabel();
    JLabel text2CoinLabel = new JLabel("Pick up your coin!", SwingConstants.CENTER);
    JLabel text3CoinLabel = new JLabel("Pick up your coins!", SwingConstants.CENTER);
    JButton get2Coin = new JButton("Get 2 from 1 color!");
    JButton get3Coin = new JButton("Get 3 from 3 different colors!");

    Random random = new Random();


    Frame() {

        Font colorCountLabelFont = new Font("Ink Free", Font.BOLD, 20);

        black1Label.setBounds(50, 270, 150, 50);
        black1Label.setForeground(Color.black);
        black1Label.setFont(colorCountLabelFont);
        white1Label.setBounds(50, 320, 150, 50);
        white1Label.setForeground(Color.white);
        white1Label.setFont(colorCountLabelFont);
        blue1Label.setBounds(50, 370, 150, 50);
        blue1Label.setForeground(Color.blue);
        blue1Label.setFont(colorCountLabelFont);
        red1Label.setBounds(50, 420, 150, 50);
        red1Label.setForeground(Color.red);
        red1Label.setFont(colorCountLabelFont);
        green1Label.setBounds(50, 470, 150, 50);
        green1Label.setForeground(Color.green);
        green1Label.setFont(colorCountLabelFont);
        
        black2Label.setBounds(50, 270, 150, 50);
        black2Label.setForeground(Color.black);
        black2Label.setFont(colorCountLabelFont);
        white2Label.setBounds(50, 320, 150, 50);
        white2Label.setForeground(Color.white);
        white2Label.setFont(colorCountLabelFont);
        blue2Label.setBounds(50, 370, 150, 50);
        blue2Label.setForeground(Color.blue);
        blue2Label.setFont(colorCountLabelFont);
        red2Label.setBounds(50, 420, 150, 50);
        red2Label.setForeground(Color.red);
        red2Label.setFont(colorCountLabelFont);
        green2Label.setBounds(50, 470, 150, 50);
        green2Label.setForeground(Color.green);
        green2Label.setFont(colorCountLabelFont);

        black1.setBounds(50, 100, 140, 140);
        black1.addActionListener(this);
        white1.setBounds(210, 100, 140, 140);
        white1.addActionListener(this);
        blue1.setBounds(370, 100, 140, 140);
        blue1.addActionListener(this);
        red1.setBounds(530, 100, 140, 140);
        red1.addActionListener(this);
        green1.setBounds(690, 100, 140, 140);
        green1.addActionListener(this);

        black2.setBounds(50, 100, 140, 140);
        black2.addActionListener(this);
        white2.setBounds(210, 100, 140, 140);
        white2.addActionListener(this);
        blue2.setBounds(370, 100, 140, 140);
        blue2.addActionListener(this);
        red2.setBounds(530, 100, 140, 140);
        red2.addActionListener(this);
        green2.setBounds(690, 100, 140, 140);
        green2.addActionListener(this);

        done1.setBounds(375, 500, 150, 50);
        done1.setFont(new Font("Ink Free", Font.BOLD, 30));
        done1.setBackground(Color.magenta);
        done1.setForeground(Color.yellow);
        done1.setFocusable(false);
        done1.addActionListener(this);

        done2.setBounds(375, 500, 150, 50);
        done2.setFont(new Font("Ink Free", Font.BOLD, 30));
        done2.setBackground(Color.magenta);
        done2.setForeground(Color.yellow);
        done2.setFocusable(false);
        done2.addActionListener(this);

        text2CoinLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
        text2CoinLabel.setForeground(Color.darkGray);
        text2CoinLabel.setBounds(0, 0, 900, 75);
        text2CoinLabel.setOpaque(false);

        text3CoinLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
        text3CoinLabel.setForeground(Color.darkGray);
        text3CoinLabel.setBounds(0, 0, 900, 75);
        text3CoinLabel.setOpaque(false);

        get2Label.setBounds(0, 0, 900, 600);
        get2Label.setBackground(Color.cyan);
        get2Label.setOpaque(true);
        get2Label.add(text2CoinLabel);
        get2Label.add(black1);
        get2Label.add(white1);
        get2Label.add(blue1);
        get2Label.add(red1);
        get2Label.add(green1);
        get2Label.add(done1);
        get2Label.add(black1Label);
        get2Label.add(white1Label);
        get2Label.add(blue1Label);
        get2Label.add(red1Label);
        get2Label.add(green1Label);

        get3Label.setBounds(0, 0, 900, 600);
        get3Label.setBackground(Color.cyan);
        get3Label.setOpaque(true);
        get3Label.add(text3CoinLabel);
        get3Label.add(black2);
        get3Label.add(white2);
        get3Label.add(blue2);
        get3Label.add(red2);
        get3Label.add(green2);
        get3Label.add(done2);
        get3Label.add(black2Label);
        get3Label.add(white2Label);
        get3Label.add(blue2Label);
        get3Label.add(red2Label);
        get3Label.add(green2Label);

        get2Frame.setSize(900, 600);
        get2Frame.setLocation(200, 100);
        get2Frame.add(get2Label);

        get3Frame.setSize(900, 600);
        get3Frame.setLocation(200, 100);
        get3Frame.add(get3Label);

        get2Coin.setFont(new Font("Ink Free", Font.BOLD, 12));
        get2Coin.setBackground(Color.pink);
        get2Coin.setBounds(10, 10, 200, 75);
        get2Coin.addActionListener(this);
        get2Coin.setFocusable(false);
        
        get3Coin.setFont(new Font("Ink Free", Font.BOLD, 12));
        get3Coin.setBackground(Color.red);
        get3Coin.setForeground(new Color(220, 220, 220));
        get3Coin.setBounds(10, 120, 200, 75);
        get3Coin.addActionListener(this);
        get3Coin.setFocusable(false);

        setTitle("SPLENDOR");
        setIconImage(gameIcon.getImage());

        player1.turn = true;
        player2.turn = false;

        addCards();

        cardBuyLabel1 = new JLabel(c[0].getCardIcon());
        cardBuyLabel2 = new JLabel(c[1].getCardIcon());
        cardBuyLabel3 = new JLabel(c[2].getCardIcon());
        cardBuyLabel4 = new JLabel(c[3].getCardIcon());
        cardBuyLabel5 = new JLabel(c[4].getCardIcon());
        cardBuyLabel6 = new JLabel(c[5].getCardIcon());
        cardBuyLabel7 = new JLabel(c[6].getCardIcon());
        cardBuyLabel8 = new JLabel(c[7].getCardIcon());
        cardBuyLabel9 = new JLabel(c[8].getCardIcon());
        cardBuyLabel10 = new JLabel(c[9].getCardIcon());
        cardBuyLabel11 = new JLabel(c[10].getCardIcon());
        cardBuyLabel12 = new JLabel(c[11].getCardIcon());

        String name1 = JOptionPane.showInputDialog("Player1, Enter you name:");
        if (name1.isEmpty()) name1 = "Player1";
        player1.name = name1;

        player1Label.setBounds(10, 10, 500, 350);
        player1Label.setBorder(BorderFactory.createLineBorder(Color.red, 5));

        player1NameLabel = new JLabel();
        player1NameLabel.setFont(new Font("Ink Free", Font.BOLD, 28));
        player1NameLabel.setBounds(200, 20, 150, 50);
        player1NameLabel.setForeground(Color.white);
        player1NameLabel.setText(player1.name);
        player1Label.add(player1NameLabel);

        player1InfoLabel = new JLabel();
        player1InfoLabel.setBounds(10, 80, 480, 260);
        player1InfoLabel.setOpaque(false);
        // ...
        colorTitles1 = new JLabel("BLACK     WHITE     BLUE     RED     GREEN     GOLD");
        colorTitles1.setForeground(Color.white);
        colorTitles1.setBounds(80, 10, 420, 20);
        colorTitles1.setFont(new Font("Ink Free", Font.BOLD, 15));

        specialLabel1 = new JLabel("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
        specialLabel1.setForeground(Color.white);
        specialLabel1.setBounds(10, 80, 450, 20);
        specialLabel1.setFont(new Font("Ink Free", Font.BOLD, 15));

        coinLabel1 = new JLabel("Coins:               " + player1.blackCount + "             " + player1.whiteCount + "             " + player1.blueCount + "             " + player1.redCount + "             " + player1.greenCount + "             " + player1.goldCount);
        coinLabel1.setForeground(Color.white);
        coinLabel1.setBounds(10, 170, 450, 20);
        coinLabel1.setFont(new Font("Ink Free", Font.BOLD, 15));

        scoreLabel1 = new JLabel("Score:   " + player1.score);
        scoreLabel1.setForeground(Color.white);
        scoreLabel1.setBounds(10, 230, 450, 20);
        scoreLabel1.setFont(new Font("Ink Free", Font.BOLD, 15));
        
        player1InfoLabel.add(specialLabel1);
        player1InfoLabel.add(coinLabel1);
        player1InfoLabel.add(colorTitles1);
        player1InfoLabel.add(scoreLabel1);
        player1Label.add(player1InfoLabel);



        String name2 = JOptionPane.showInputDialog("Player2, Enter you name:");
        if (name2.isEmpty()) name2 = "Player2";
        player2.name = name2;
        
        player2Label.setBounds(10, 400, 500, 350);
        player2Label.setBorder(BorderFactory.createLineBorder(Color.yellow, 5));

        player2NameLabel = new JLabel();
        player2NameLabel.setFont(new Font("Ink Free", Font.BOLD, 28));
        player2NameLabel.setBounds(200, 20, 150, 50);
        player2NameLabel.setForeground(Color.white);
        player2NameLabel.setText(player2.name);
        player2Label.add(player2NameLabel);

        player2InfoLabel = new JLabel();
        player2InfoLabel.setBounds(10, 80, 480, 260);
        player2InfoLabel.setOpaque(false);
        // ...

        colorTitles2 = new JLabel("BLACK     WHITE     BLUE     RED     GREEN     GOLD");
        colorTitles2.setForeground(Color.white);
        colorTitles2.setBounds(80, 10, 420, 20);
        colorTitles2.setFont(new Font("Ink Free", Font.BOLD, 15));

        specialLabel2 = new JLabel("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");
        specialLabel2.setForeground(Color.white);
        specialLabel2.setBounds(10, 80, 450, 20);
        specialLabel2.setFont(new Font("Ink Free", Font.BOLD, 15));

        coinLabel2 = new JLabel("Coins:               " + player2.blackCount + "             " + player2.whiteCount + "             " + player2.blueCount + "             " + player2.redCount + "             " + player2.greenCount + "             " + player2.goldCount);
        coinLabel2.setForeground(Color.white);
        coinLabel2.setBounds(10, 170, 450, 20);
        coinLabel2.setFont(new Font("Ink Free", Font.BOLD, 15));
        
        scoreLabel2 = new JLabel("Score:   " + player2.score);
        scoreLabel2.setForeground(Color.white);
        scoreLabel2.setBounds(10, 230, 450, 20);
        scoreLabel2.setFont(new Font("Ink Free", Font.BOLD, 15));
        
        player2InfoLabel.add(specialLabel2);
        player2InfoLabel.add(coinLabel2);
        player2InfoLabel.add(colorTitles2);
        player2InfoLabel.add(scoreLabel2);
        player2Label.add(player2InfoLabel);


        for (int i = 0; i < ICON_SIZE; i++) {
            int index = i + 1;
            String pathIcon = "C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\0" + index + ".jpg";
            arrayIcons[i] = new ImageIcon(pathIcon);
        }

        specialCardLabel1.setBounds(1100, 20, 190, 180);
        specialCardLabel2.setBounds(850, 20, 190, 180);
        specialCardLabel3.setBounds(600, 20, 190, 180);

        cardLabel1.setBounds(1150, 600, 130, 180);
        cardLabel1.setIcon(arrayIcons[0]);
        cardLabel1.addMouseListener(this);

        cardLabel2.setBounds(970, 600, 130, 180);
        cardLabel2.setIcon(arrayIcons[1]);
        cardLabel2.addMouseListener(this);

        cardLabel3.setBounds(790, 600, 130, 180);
        cardLabel3.setIcon(arrayIcons[2]);
        cardLabel3.addMouseListener(this);

        cardLabel4.setBounds(610, 600, 130, 180);
        cardLabel4.setIcon(arrayIcons[3]);
        cardLabel4.addMouseListener(this);

        cardLabel5.setBounds(1150, 410, 130, 180);
        cardLabel5.setIcon(arrayIcons[4]);
        cardLabel5.addMouseListener(this);

        cardLabel6.setBounds(970, 410, 130, 180);
        cardLabel6.setIcon(arrayIcons[5]);
        cardLabel6.addMouseListener(this);

        cardLabel7.setBounds(790, 410, 130, 180);
        cardLabel7.setIcon(arrayIcons[6]);
        cardLabel7.addMouseListener(this);

        cardLabel8.setBounds(610, 410, 130, 180);
        cardLabel8.setIcon(arrayIcons[7]);
        cardLabel8.addMouseListener(this);

        cardLabel9.setBounds(1150, 220, 130, 180);
        cardLabel9.setIcon(arrayIcons[8]);
        cardLabel9.addMouseListener(this);

        cardLabel10.setBounds(970, 220, 130, 180);
        cardLabel10.setIcon(arrayIcons[9]);
        cardLabel10.addMouseListener(this);

        cardLabel11.setBounds(790, 220, 130, 180);
        cardLabel11.setIcon(arrayIcons[10]);
        cardLabel11.addMouseListener(this);

        cardLabel12.setBounds(610, 220, 130, 180);
        cardLabel12.setIcon(arrayIcons[11]);
        cardLabel12.addMouseListener(this);

        gameLabel.setOpaque(true);
        gameLabel.setIcon(background);

        coinLabel.setIcon(coin);
        coinLabel.setOpaque(false);
        coinLabel.setBorder(null);
        coinLabel.setBounds(1300, 300, 200, 200);
        coinLabel.addMouseListener(this);

        gameLabel.add(coinLabel);

        gameLabel.add(specialCardLabel1);
        gameLabel.add(specialCardLabel2);
        gameLabel.add(specialCardLabel3);

        gameLabel.add(cardLabel1);
        gameLabel.add(cardLabel2);
        gameLabel.add(cardLabel3);
        gameLabel.add(cardLabel4);
        gameLabel.add(cardLabel5);
        gameLabel.add(cardLabel6);
        gameLabel.add(cardLabel7);
        gameLabel.add(cardLabel8);
        gameLabel.add(cardLabel9);
        gameLabel.add(cardLabel10);
        gameLabel.add(cardLabel11);
        gameLabel.add(cardLabel12);
        
        gameLabel.add(player1Label);
        gameLabel.add(player2Label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600, 850);

        add(gameLabel);

        setVisible(true);
    }

    public void updateCoin() {
        coinLabel1.setText("Coins:               " + player1.blackCount + "             " + player1.whiteCount + "             " + player1.blueCount + "             " + player1.redCount + "             " + player1.greenCount + "             " + player1.goldCount);
        coinLabel2.setText("Coins:               " + player2.blackCount + "             " + player2.whiteCount + "             " + player2.blueCount + "             " + player2.redCount + "             " + player2.greenCount + "             " + player2.goldCount);
    }

    private void addCards() {
        // B --> black / b --> blue

        c[0] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\01.jpg", "white", 1);
        c[0].price = "4g";

        c[1] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\02.jpg", "blue", 1);
        c[1].price = "4r";

        c[2] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\03.jpg", "green", 1);
        c[2].price = "4B";

        c[3] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\04.jpg", "red", 1);
        c[3].price = "4w";

        c[4] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\05.jpg", "black", 1);
        c[4].price = "4b";

        c[5] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\06.jpg", "white", 0);
        c[5].price = "3w4b1B";
        
        c[6] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\07.jpg", "blue", 0);
        c[6].price = "1b3g1r";
        
        c[7] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\08.jpg", "green", 0);
        c[7].price = "41w3b1g";
        
        c[8] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\09.jpg", "red", 0);
        c[8].price = "1w1r3B";
        
        c[9] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\010.jpg", "black", 0);
        c[9].price = "1g3r1B";
        
        c[10] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\011.jpg", "white", 0);
        c[10].price = "3b";
        
        c[11] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\012.jpg", "blue", 0);
        c[11].price = "3B";
        
        c[12] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\013.jpg", "green", 0);
        c[12].price = "3r";

        c[13] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\014.jpg", "red", 0);
        c[13].price = "3w";

        c[14] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\015.jpg", "black", 0);
        c[14].price = "3g";

        c[15] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\016.jpg", "white", 0);
        c[15].price = "2b2g1B";

        c[16] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\017.jpg", "blue", 0);
        c[16].price = "1w2g2r";

        c[17] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\018.jpg", "green", 0);
        c[17].price = "1b2r2B";

        c[18] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\019.jpg", "red", 0);
        c[18].price = "2w1g2B";

        c[19] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\020.jpg", "black", 0);
        c[19].price = "2w2b1r";

        c[20] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\021.jpg", "white", 0);
        c[20].price = "2b2B";

        c[21] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\022.jpg", "blue", 0);
        c[21].price = "2g2B";

        c[22] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\023.jpg", "green", 0);
        c[22].price = "2b2r";

        c[23] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\024.jpg", "red", 0);
        c[23].price = "2w2r";

        c[24] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\025.jpg", "black", 0);
        c[24].price = "2w2g";

        c[25] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\026.jpg", "white", 0);
        c[25].price = "1b2g1r1B";

        c[26] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\027.jpg", "blue", 0);
        c[26].price = "1w1g2r1B";

        c[27] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\028.jpg", "green", 0);
        c[27].price = "1w1b1r2B";

        c[28] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\029.jpg", "red", 0);
        c[28].price = "2w1b1g1B";

        c[29] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\030.jpg", "black", 0);
        c[29].price = "1w2b1g1r";

        c[30] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\031.jpg", "white", 0);
        c[30].price = "2r1B";

        c[31] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\032.jpg", "blue", 0);
        c[31].price = "1w2B";

        c[32] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\033.jpg", "green", 0);
        c[32].price = "2w1b";

        c[33] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\034.jpg", "red", 0);
        c[33].price = "2b1g";

        c[34] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\035.jpg", "black", 0);
        c[34].price = "2g1r";

        c[35] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\036.jpg", "white", 0);
        c[35].price = "1b1g1r1B";

        c[36] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\037.jpg", "blue", 0);
        c[36].price = "1w1g1r1B";

        c[37] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\038.jpg", "green", 0);
        c[37].price = "1w1b1r1B";

        c[38] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\039.jpg", "red", 0);
        c[38].price = "1w1b1g1B";

        c[39] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\040.jpg", "black", 0);
        c[39].price = "1w1b1g1r";

        c[40] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\041.jpg", "white", 1);
        c[40].price = "3g2r2B";

        c[41] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\042.jpg", "blue", 1);
        c[41].price = "2b2g3r";

        c[42] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\043.jpg", "green", 1);
        c[42].price = "2w3b2B";

        c[43] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\044.jpg", "red", 1);
        c[43].price = "2w2r3B";

        c[44] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\045.jpg", "black", 1);
        c[44].price = "3w2b2g";

        c[45] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\046.jpg", "white", 1);
        c[45].price = "2w3b3r";

        c[46] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\047.jpg", "blue", 1);
        c[46].price = "2b3g3B";

        c[47] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\048.jpg", "green", 1);
        c[47].price = "3w2g3r";

        c[48] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\049.jpg", "red", 1);
        c[48].price = "3b2r3B";

        c[49] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\050.jpg", "black", 1);
        c[49].price = "3w3g2B";

        c[50] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\051.jpg", "white", 3);
        c[50].price = "6w";

        c[51] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\052.jpg", "blue", 3);
        c[51].price = "6b";

        c[52] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\053.jpg", "green", 3);
        c[52].price = "6g";

        c[53] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\054.jpg", "red", 3);
        c[53].price = "6r";

        c[54] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\055.jpg", "black", 3);
        c[54].price = "6B";

        c[55] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\056.jpg", "white", 2);
        c[55].price = "1g4r2B";

        c[56] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\057.jpg", "blue", 2);
        c[56].price = "2w1r4B";

        c[57] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\058.jpg", "green", 2);
        c[57].price = "4w2b1B";

        c[58] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\059.jpg", "red", 2);
        c[58].price = "1w4b2g";

        c[59] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\060.jpg", "black", 2);
        c[59].price = "1b4g2r";

        c[60] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\061.jpg", "white", 2);
        c[60].price = "5r";

        c[61] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\062.jpg", "blue", 2);
        c[61].price = "5b";

        c[62] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\063.jpg", "green", 2);
        c[62].price = "5g";

        c[63] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\064.jpg", "red", 2);
        c[63].price = "5B";

        c[64] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\065.jpg", "black", 2);
        c[64].price = "5w";

        c[65] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\066.jpg", "white", 2);
        c[65].price = "5r3B";

        c[66] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\067.jpg", "blue", 2);
        c[66].price = "5w3b";

        c[67] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\068.jpg", "green", 2);
        c[67].price = "5b3g";

        c[68] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\069.jpg", "red", 2);
        c[68].price = "3w5B";

        c[69] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\070.jpg", "black", 2);
        c[69].price = "5g3r";

        c[70] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\071.jpg", "white", 3);
        c[70].price = "3b3g5r3B";

        c[71] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\072.jpg", "blue", 3);
        c[71].price = "3w3g3r5B";

        c[72] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\073.jpg", "green", 3);
        c[72].price = "5w3b3r3B";

        c[73] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\074.jpg", "red", 3);
        c[73].price = "3w5b3g3B";

        c[74] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\075.jpg", "black", 3);
        c[74].price = "3w3b5g3r";

        c[75] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\076.jpg", "white", 4);
        c[75].price = "7B";

        c[76] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\077.jpg", "blue", 4);
        c[76].price = "7w";

        c[77] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\078.jpg", "green", 4);
        c[77].price = "7b";

        c[78] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\079.jpg", "red", 4);
        c[78].price = "7g";

        c[79] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\080.jpg", "black", 4);
        c[79].price = "7r";

        c[80] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\081.jpg", "white", 4);
        c[80].price = "3w3r6B";

        c[81] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\082.jpg", "blue", 4);
        c[81].price = "6w3b3B";

        c[82] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\083.jpg", "green", 4);
        c[82].price = "3w6b3g";

        c[83] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\084.jpg", "red", 4);
        c[83].price = "3b6g3r";

        c[84] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\085.jpg", "black", 4);
        c[84].price = "3g6r3B";

        c[85] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\086.jpg", "white", 5);
        c[85].price = "3w7B";

        c[86] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\087.jpg", "blue", 5);
        c[86].price = "7w3b";

        c[87] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\088.jpg", "green", 5);
        c[87].price = "7b3g";

        c[88] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\089.jpg", "red", 5);
        c[88].price = "7g3r";

        c[89] = new Card("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\cards\\090.jpg", "black", 5);
        c[89].price = "7r3B";


    }

    public void disableButton(JButton btn) {
        btn.setEnabled(false);
    }

    public void disableAll1() {
        this.black1.setEnabled(false);
        this.white1.setEnabled(false);
        this.blue1.setEnabled(false);
        this.red1.setEnabled(false);
        this.green1.setEnabled(false);
    }

    public void disableAll2() {
        this.black2.setEnabled(false);
        this.white2.setEnabled(false);
        this.blue2.setEnabled(false);
        this.red2.setEnabled(false);
        this.green2.setEnabled(false);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == coinLabel) {
            coinLabel.setIcon(null);
            coinLabel.add(get2Coin);
            coinLabel.add(get3Coin);
        }


        if (e.getSource() == cardLabel1) {
            JFrame buyFrame = new JFrame("Buy");
            JButton buyButton = new JButton("Buy!");
            JButton reserveButton = new JButton("Reserve");
            Font myFont = new Font("Ink Free", Font.BOLD, 15);

            buyButton.setFont(myFont);
            buyButton.setBounds(105, 300, 90, 30);
            buyButton.setFocusable(false);
            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Card currentCard = new Card();

                    for (int i = 0; i < ICON_SIZE; i++) {
                        if (cardBuyLabel1.getIcon() == c[i].getCardIcon()) {
                            currentCard = c[i];
                            break;
                        }
                    }
                    
                    boolean s = true;
                    int randomNumber;
                    
                    if (player1.turn) {

                        // add a condition, if I have enough coin then buy the card and add special coin
                        for (int i = 0; i < currentCard.price.length(); i += 2) {
                            if (currentCard.price.charAt(i + 1) == 'B' && player1.blackCount < currentCard.price.charAt(i)) {
                                s = false;
                                break;
                            } else if (currentCard.price.charAt(i + 1) == 'w' && player1.whiteCount < currentCard.price.charAt(i)) {
                                s = false;
                                break;
                            } else if (currentCard.price.charAt(i + 1) == 'b' && player1.blueCount < currentCard.price.charAt(i)) {
                                s = false;
                                break;
                            } else if (currentCard.price.charAt(i + 1) == 'r' && player1.redCount < currentCard.price.charAt(i)) {
                                s = false;
                                break;
                            } else if (currentCard.price.charAt(i + 1) == 'g' && player1.greenCount < currentCard.price.charAt(i)) {
                                s = false;
                                break;
                            }
                        }

                        if (s) {
                            
                            player1.score += currentCard.score;

                            if (currentCard.specialCoin == "black") player1.specialBlack++;
                            else if (currentCard.specialCoin == "white") player1.specialWhite++;
                            else if (currentCard.specialCoin == "blue") player1.specialBlue++;
                            else if (currentCard.specialCoin == "red") player1.specialRed++;
                            else if (currentCard.specialCoin == "green") player1.specialGreen++;
                            
                            specialLabel1.setText("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
                            
                            player1.turn = false;
                            player2.turn = true;
                            scoreLabel1.setText("Score:   " + player1.score);

                            if (player1.score >= 15) {
                                System.out.println(player1.name + " is the winner!") ;
                                myFrame.dispose();
                            }

                            while (true) {

                                randomNumber = random.nextInt(90);

                                if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                                && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                                && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                                && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                                    cardLabel1.setIcon(c[randomNumber].getCardIcon());
                                    cardBuyLabel1.setIcon(c[randomNumber].getCardIcon());
                                    break;
                                }

                            }
                            
                            buyFrame.dispose();

                        }

                    } else {

                        s = true;

                        for (int i = 0; i < currentCard.price.length(); i += 2) {
                            if (currentCard.price.charAt(i + 1) == 'B' && player1.blackCount < currentCard.price.charAt(i)) {
                                s = false;
                                break;
                            } else if (currentCard.price.charAt(i + 1) == 'w' && player1.whiteCount < currentCard.price.charAt(i)) {
                                s = false;
                                break;
                            } else if (currentCard.price.charAt(i + 1) == 'b' && player1.blueCount < currentCard.price.charAt(i)) {
                                s = false;
                                break;
                            } else if (currentCard.price.charAt(i + 1) == 'r' && player1.redCount < currentCard.price.charAt(i)) {
                                s = false;
                                break;
                            } else if (currentCard.price.charAt(i + 1) == 'g' && player1.greenCount < currentCard.price.charAt(i)) {
                                s = false;
                                break;
                            }
                        }

                        if (s) {
                            
                            player2.score += currentCard.score;

                            if (currentCard.specialCoin == "black") player2.specialBlack++;
                            else if (currentCard.specialCoin == "white") player2.specialWhite++;
                            else if (currentCard.specialCoin == "blue") player2.specialBlue++;
                            else if (currentCard.specialCoin == "red") player2.specialRed++;
                            else if (currentCard.specialCoin == "green") player2.specialGreen++;
                            
                            specialLabel2.setText("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");

                            player1.turn = true;
                            player2.turn = false;
                            scoreLabel2.setText("Score:   " + player2.score);

                            if (player2.score >= 15) {
                                System.out.println(player2.name + " is the winner!") ;
                                myFrame.dispose();
                            }

                            while (true) {

                                randomNumber = random.nextInt(90);

                                if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                                && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                                && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                                && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                                    cardLabel2.setIcon(c[randomNumber].getCardIcon());
                                    cardBuyLabel2.setIcon(c[randomNumber].getCardIcon());
                                    break;
                                }

                            }
                            
                            buyFrame.dispose();

                        }
                    }
                }
            });

            reserveButton.setFont(myFont);
            reserveButton.setBounds(105, 340, 90, 30);
            reserveButton.setFocusable(false);

            buyFrame.add(buyButton);
            buyFrame.add(reserveButton);
            buyFrame.add(cardBuyLabel1);
            buyFrame.setSize(300, 420);
            buyFrame.setLocation(400, 200);
            buyFrame.setVisible(true);
        }

        if (e.getSource() == cardLabel2) {
            JFrame buyFrame = new JFrame("Buy");
            JButton buyButton = new JButton("Buy!");
            JButton reserveButton = new JButton("Reserve");
            Font myFont = new Font("Ink Free", Font.BOLD, 15);
            
            buyButton.setFont(myFont);
            buyButton.setBounds(105, 300, 90, 30);
            buyButton.setFocusable(false);
            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Card currentCard = new Card();

                    for (int i = 0; i < ICON_SIZE; i++) {
                        if (cardBuyLabel2.getIcon() == c[i].getCardIcon()) {
                            currentCard = c[i];
                            break;
                        }
                    }
                    
                    if (player1.turn) {

                        player1.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player1.specialBlack++;
                        else if (currentCard.specialCoin == "white") player1.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player1.specialBlue++;
                        else if (currentCard.specialCoin == "red") player1.specialRed++;
                        else if (currentCard.specialCoin == "green") player1.specialGreen++;

                        specialLabel1.setText("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
                        
                        player1.turn = false;
                        player2.turn = true;
                        scoreLabel1.setText("Score:   " + player1.score);

                        if (player1.score >= 15) {
                            System.out.println(player1.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    } else {

                        player2.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player2.specialBlack++;
                        else if (currentCard.specialCoin == "white") player2.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player2.specialBlue++;
                        else if (currentCard.specialCoin == "red") player2.specialRed++;
                        else if (currentCard.specialCoin == "green") player2.specialGreen++;
                        
                        specialLabel2.setText("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");

                        player1.turn = true;
                        player2.turn = false;
                        scoreLabel2.setText("Score:   " + player2.score);

                        if (player2.score >= 15) {
                            System.out.println(player2.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    }

                    int randomNumber;

                    while (true) {

                        randomNumber = random.nextInt(90);

                        if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                            cardLabel2.setIcon(c[randomNumber].getCardIcon());
                            cardBuyLabel2.setIcon(c[randomNumber].getCardIcon());
                            break;
                        }

                    }

                    buyFrame.dispose();
                }
            });

            reserveButton.setFont(myFont);
            reserveButton.setBounds(105, 340, 90, 30);
            reserveButton.setFocusable(false);

            buyFrame.add(buyButton);
            buyFrame.add(reserveButton);
            buyFrame.add(cardBuyLabel2);
            buyFrame.setSize(300, 420);
            buyFrame.setLocation(400, 200);
            buyFrame.setVisible(true);
        }

        if (e.getSource() == cardLabel3) {
            JFrame buyFrame = new JFrame("Buy");
            JButton buyButton = new JButton("Buy!");
            JButton reserveButton = new JButton("Reserve");
            Font myFont = new Font("Ink Free", Font.BOLD, 15);
            
            buyButton.setFont(myFont);
            buyButton.setBounds(105, 300, 90, 30);
            buyButton.setFocusable(false);
            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Card currentCard = new Card();

                    for (int i = 0; i < ICON_SIZE; i++) {
                        if (cardBuyLabel3.getIcon() == c[i].getCardIcon()) {
                            currentCard = c[i];
                            break;
                        }
                    }
                    
                    if (player1.turn) {

                        player1.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player1.specialBlack++;
                        else if (currentCard.specialCoin == "white") player1.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player1.specialBlue++;
                        else if (currentCard.specialCoin == "red") player1.specialRed++;
                        else if (currentCard.specialCoin == "green") player1.specialGreen++;

                        specialLabel1.setText("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
                        
                        player1.turn = false;
                        player2.turn = true;
                        scoreLabel1.setText("Score:   " + player1.score);

                        if (player1.score >= 15) {
                            System.out.println(player1.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    } else {

                        player2.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player2.specialBlack++;
                        else if (currentCard.specialCoin == "white") player2.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player2.specialBlue++;
                        else if (currentCard.specialCoin == "red") player2.specialRed++;
                        else if (currentCard.specialCoin == "green") player2.specialGreen++;
                        
                        specialLabel2.setText("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");

                        player1.turn = true;
                        player2.turn = false;
                        scoreLabel2.setText("Score:   " + player2.score);

                        if (player2.score >= 15) {
                            System.out.println(player2.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    }

                    int randomNumber;

                    while (true) {

                        randomNumber = random.nextInt(90);

                        if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                            cardLabel3.setIcon(c[randomNumber].getCardIcon());
                            cardBuyLabel3.setIcon(c[randomNumber].getCardIcon());
                            break;
                        }

                    }

                    buyFrame.dispose();
                }
            });

            reserveButton.setFont(myFont);
            reserveButton.setBounds(105, 340, 90, 30);
            reserveButton.setFocusable(false);

            buyFrame.add(buyButton);
            buyFrame.add(reserveButton);
            buyFrame.add(cardBuyLabel3);
            buyFrame.setSize(300, 420);
            buyFrame.setLocation(400, 200);
            buyFrame.setVisible(true);
        }

        if (e.getSource() == cardLabel4) {
            JFrame buyFrame = new JFrame("Buy");
            JButton buyButton = new JButton("Buy!");
            JButton reserveButton = new JButton("Reserve");
            Font myFont = new Font("Ink Free", Font.BOLD, 15);
            
            buyButton.setFont(myFont);
            buyButton.setBounds(105, 300, 90, 30);
            buyButton.setFocusable(false);
            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Card currentCard = new Card();

                    for (int i = 0; i < ICON_SIZE; i++) {
                        if (cardBuyLabel4.getIcon() == c[i].getCardIcon()) {
                            currentCard = c[i];
                            break;
                        }
                    }
                    
                    if (player1.turn) {

                        player1.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player1.specialBlack++;
                        else if (currentCard.specialCoin == "white") player1.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player1.specialBlue++;
                        else if (currentCard.specialCoin == "red") player1.specialRed++;
                        else if (currentCard.specialCoin == "green") player1.specialGreen++;

                        specialLabel1.setText("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
                        
                        player1.turn = false;
                        player2.turn = true;
                        scoreLabel1.setText("Score:   " + player1.score);

                        if (player1.score >= 15) {
                            System.out.println(player1.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    } else {

                        player2.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player2.specialBlack++;
                        else if (currentCard.specialCoin == "white") player2.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player2.specialBlue++;
                        else if (currentCard.specialCoin == "red") player2.specialRed++;
                        else if (currentCard.specialCoin == "green") player2.specialGreen++;
                        
                        specialLabel2.setText("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");

                        player1.turn = true;
                        player2.turn = false;
                        scoreLabel2.setText("Score:   " + player2.score);

                        if (player2.score >= 15) {
                            System.out.println(player2.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    }

                    int randomNumber;

                    while (true) {

                        randomNumber = random.nextInt(90);

                        if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                            cardLabel4.setIcon(c[randomNumber].getCardIcon());
                            cardBuyLabel4.setIcon(c[randomNumber].getCardIcon());
                            break;
                        }

                    }

                    buyFrame.dispose();
                }
            });

            reserveButton.setFont(myFont);
            reserveButton.setBounds(105, 340, 90, 30);
            reserveButton.setFocusable(false);

            buyFrame.add(buyButton);
            buyFrame.add(reserveButton);
            buyFrame.add(cardBuyLabel4);
            buyFrame.setSize(300, 420);
            buyFrame.setLocation(400, 200);
            buyFrame.setVisible(true);
        }

        if (e.getSource() == cardLabel5) {
            JFrame buyFrame = new JFrame("Buy");
            JButton buyButton = new JButton("Buy!");
            JButton reserveButton = new JButton("Reserve");
            Font myFont = new Font("Ink Free", Font.BOLD, 15);
            
            buyButton.setFont(myFont);
            buyButton.setBounds(105, 300, 90, 30);
            buyButton.setFocusable(false);
            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Card currentCard = new Card();

                    for (int i = 0; i < ICON_SIZE; i++) {
                        if (cardBuyLabel5.getIcon() == c[i].getCardIcon()) {
                            currentCard = c[i];
                            break;
                        }
                    }
                    
                    if (player1.turn) {

                        player1.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player1.specialBlack++;
                        else if (currentCard.specialCoin == "white") player1.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player1.specialBlue++;
                        else if (currentCard.specialCoin == "red") player1.specialRed++;
                        else if (currentCard.specialCoin == "green") player1.specialGreen++;

                        specialLabel1.setText("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
                        
                        player1.turn = false;
                        player2.turn = true;
                        scoreLabel1.setText("Score:   " + player1.score);

                        if (player1.score >= 15) {
                            System.out.println(player1.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    } else {

                        player2.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player2.specialBlack++;
                        else if (currentCard.specialCoin == "white") player2.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player2.specialBlue++;
                        else if (currentCard.specialCoin == "red") player2.specialRed++;
                        else if (currentCard.specialCoin == "green") player2.specialGreen++;
                        
                        specialLabel2.setText("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");

                        player1.turn = true;
                        player2.turn = false;
                        scoreLabel2.setText("Score:   " + player2.score);

                        if (player2.score >= 15) {
                            System.out.println(player2.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    }

                    int randomNumber;

                    while (true) {

                        randomNumber = random.nextInt(90);

                        if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                            cardLabel5.setIcon(c[randomNumber].getCardIcon());
                            cardBuyLabel5.setIcon(c[randomNumber].getCardIcon());
                            break;
                        }

                    }

                    buyFrame.dispose();
                }
            });

            reserveButton.setFont(myFont);
            reserveButton.setBounds(105, 340, 90, 30);
            reserveButton.setFocusable(false);

            buyFrame.add(buyButton);
            buyFrame.add(reserveButton);
            buyFrame.add(cardBuyLabel5);
            buyFrame.setSize(300, 420);
            buyFrame.setLocation(400, 200);
            buyFrame.setVisible(true);
        } 

        if (e.getSource() == cardLabel6) {
            JFrame buyFrame = new JFrame("Buy");
            JButton buyButton = new JButton("Buy!");
            JButton reserveButton = new JButton("Reserve");
            Font myFont = new Font("Ink Free", Font.BOLD, 15);
            
            buyButton.setFont(myFont);
            buyButton.setBounds(105, 300, 90, 30);
            buyButton.setFocusable(false);
            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Card currentCard = new Card();

                    for (int i = 0; i < ICON_SIZE; i++) {
                        if (cardBuyLabel6.getIcon() == c[i].getCardIcon()) {
                            currentCard = c[i];
                            break;
                        }
                    }
                    
                    if (player1.turn) {

                        player1.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player1.specialBlack++;
                        else if (currentCard.specialCoin == "white") player1.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player1.specialBlue++;
                        else if (currentCard.specialCoin == "red") player1.specialRed++;
                        else if (currentCard.specialCoin == "green") player1.specialGreen++;

                        specialLabel1.setText("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
                        
                        player1.turn = false;
                        player2.turn = true;
                        scoreLabel1.setText("Score:   " + player1.score);

                        if (player1.score >= 15) {
                            System.out.println(player1.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    } else {

                        player2.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player2.specialBlack++;
                        else if (currentCard.specialCoin == "white") player2.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player2.specialBlue++;
                        else if (currentCard.specialCoin == "red") player2.specialRed++;
                        else if (currentCard.specialCoin == "green") player2.specialGreen++;
                        
                        specialLabel2.setText("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");

                        player1.turn = true;
                        player2.turn = false;
                        scoreLabel2.setText("Score:   " + player2.score);

                        if (player2.score >= 15) {
                            System.out.println(player2.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    }

                    int randomNumber;

                    while (true) {

                        randomNumber = random.nextInt(90);

                        if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                            cardLabel6.setIcon(c[randomNumber].getCardIcon());
                            cardBuyLabel6.setIcon(c[randomNumber].getCardIcon());
                            break;
                        }

                    }

                    buyFrame.dispose();
                }
            });

            reserveButton.setFont(myFont);
            reserveButton.setBounds(105, 340, 90, 30);
            reserveButton.setFocusable(false);

            buyFrame.add(buyButton);
            buyFrame.add(reserveButton);
            buyFrame.add(cardBuyLabel6);
            buyFrame.setSize(300, 420);
            buyFrame.setLocation(400, 200);
            buyFrame.setVisible(true);
        }
    
        if (e.getSource() == cardLabel7) {
            JFrame buyFrame = new JFrame("Buy");
            JButton buyButton = new JButton("Buy!");
            JButton reserveButton = new JButton("Reserve");
            Font myFont = new Font("Ink Free", Font.BOLD, 15);
            
            buyButton.setFont(myFont);
            buyButton.setBounds(105, 300, 90, 30);
            buyButton.setFocusable(false);
            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Card currentCard = new Card();

                    for (int i = 0; i < ICON_SIZE; i++) {
                        if (cardBuyLabel7.getIcon() == c[i].getCardIcon()) {
                            currentCard = c[i];
                            break;
                        }
                    }
                    
                    if (player1.turn) {

                        player1.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player1.specialBlack++;
                        else if (currentCard.specialCoin == "white") player1.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player1.specialBlue++;
                        else if (currentCard.specialCoin == "red") player1.specialRed++;
                        else if (currentCard.specialCoin == "green") player1.specialGreen++;

                        specialLabel1.setText("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
                        
                        player1.turn = false;
                        player2.turn = true;
                        scoreLabel1.setText("Score:   " + player1.score);

                        if (player1.score >= 15) {
                            System.out.println(player1.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    } else {

                        player2.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player2.specialBlack++;
                        else if (currentCard.specialCoin == "white") player2.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player2.specialBlue++;
                        else if (currentCard.specialCoin == "red") player2.specialRed++;
                        else if (currentCard.specialCoin == "green") player2.specialGreen++;
                        
                        specialLabel2.setText("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");

                        player1.turn = true;
                        player2.turn = false;
                        scoreLabel2.setText("Score:   " + player2.score);

                        if (player2.score >= 15) {
                            System.out.println(player2.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    }

                    int randomNumber;

                    while (true) {

                        randomNumber = random.nextInt(90);

                        if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                            cardLabel7.setIcon(c[randomNumber].getCardIcon());
                            cardBuyLabel7.setIcon(c[randomNumber].getCardIcon());
                            break;
                        }

                    }

                    buyFrame.dispose();
                }
            });

            reserveButton.setFont(myFont);
            reserveButton.setBounds(105, 340, 90, 30);
            reserveButton.setFocusable(false);

            buyFrame.add(buyButton);
            buyFrame.add(reserveButton);
            buyFrame.add(cardBuyLabel7);
            buyFrame.setSize(300, 420);
            buyFrame.setLocation(400, 200);
            buyFrame.setVisible(true);
        }
    
        if (e.getSource() == cardLabel8) {
            JFrame buyFrame = new JFrame("Buy");
            JButton buyButton = new JButton("Buy!");
            JButton reserveButton = new JButton("Reserve");
            Font myFont = new Font("Ink Free", Font.BOLD, 15);
            
            buyButton.setFont(myFont);
            buyButton.setBounds(105, 300, 90, 30);
            buyButton.setFocusable(false);
            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Card currentCard = new Card();

                    for (int i = 0; i < ICON_SIZE; i++) {
                        if (cardBuyLabel8.getIcon() == c[i].getCardIcon()) {
                            currentCard = c[i];
                            break;
                        }
                    }
                    
                    if (player1.turn) {

                        player1.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player1.specialBlack++;
                        else if (currentCard.specialCoin == "white") player1.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player1.specialBlue++;
                        else if (currentCard.specialCoin == "red") player1.specialRed++;
                        else if (currentCard.specialCoin == "green") player1.specialGreen++;

                        specialLabel1.setText("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
                        
                        player1.turn = false;
                        player2.turn = true;
                        scoreLabel1.setText("Score:   " + player1.score);

                        if (player1.score >= 15) {
                            System.out.println(player1.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    } else {

                        player2.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player2.specialBlack++;
                        else if (currentCard.specialCoin == "white") player2.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player2.specialBlue++;
                        else if (currentCard.specialCoin == "red") player2.specialRed++;
                        else if (currentCard.specialCoin == "green") player2.specialGreen++;
                        
                        specialLabel2.setText("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");

                        player1.turn = true;
                        player2.turn = false;
                        scoreLabel2.setText("Score:   " + player2.score);

                        if (player2.score >= 15) {
                            System.out.println(player2.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    }

                    int randomNumber;

                    while (true) {

                        randomNumber = random.nextInt(90);

                        if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                            cardLabel8.setIcon(c[randomNumber].getCardIcon());
                            cardBuyLabel8.setIcon(c[randomNumber].getCardIcon());
                            break;
                        }

                    }

                    buyFrame.dispose();
                }
            });

            reserveButton.setFont(myFont);
            reserveButton.setBounds(105, 340, 90, 30);
            reserveButton.setFocusable(false);

            buyFrame.add(buyButton);
            buyFrame.add(reserveButton);
            buyFrame.add(cardBuyLabel8);
            buyFrame.setSize(300, 420);
            buyFrame.setLocation(400, 200);
            buyFrame.setVisible(true);
        }

        if (e.getSource() == cardLabel9) {
            JFrame buyFrame = new JFrame("Buy");
            JButton buyButton = new JButton("Buy!");
            JButton reserveButton = new JButton("Reserve");
            Font myFont = new Font("Ink Free", Font.BOLD, 15);
            
            buyButton.setFont(myFont);
            buyButton.setBounds(105, 300, 90, 30);
            buyButton.setFocusable(false);
            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Card currentCard = new Card();

                    for (int i = 0; i < ICON_SIZE; i++) {
                        if (cardBuyLabel9.getIcon() == c[i].getCardIcon()) {
                            currentCard = c[i];
                            break;
                        }
                    }
                    
                    if (player1.turn) {

                        player1.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player1.specialBlack++;
                        else if (currentCard.specialCoin == "white") player1.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player1.specialBlue++;
                        else if (currentCard.specialCoin == "red") player1.specialRed++;
                        else if (currentCard.specialCoin == "green") player1.specialGreen++;

                        specialLabel1.setText("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
                        
                        player1.turn = false;
                        player2.turn = true;
                        scoreLabel1.setText("Score:   " + player1.score);

                        if (player1.score >= 15) {
                            System.out.println(player1.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    } else {

                        player2.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player2.specialBlack++;
                        else if (currentCard.specialCoin == "white") player2.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player2.specialBlue++;
                        else if (currentCard.specialCoin == "red") player2.specialRed++;
                        else if (currentCard.specialCoin == "green") player2.specialGreen++;
                        
                        specialLabel2.setText("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");

                        player1.turn = true;
                        player2.turn = false;
                        scoreLabel2.setText("Score:   " + player2.score);

                        if (player2.score >= 15) {
                            System.out.println(player2.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    }

                    int randomNumber;

                    while (true) {

                        randomNumber = random.nextInt(90);

                        if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                            cardLabel9.setIcon(c[randomNumber].getCardIcon());
                            cardBuyLabel9.setIcon(c[randomNumber].getCardIcon());
                            break;
                        }

                    }

                    buyFrame.dispose();
                }
            });

            reserveButton.setFont(myFont);
            reserveButton.setBounds(105, 340, 90, 30);
            reserveButton.setFocusable(false);

            buyFrame.add(buyButton);
            buyFrame.add(reserveButton);
            buyFrame.add(cardBuyLabel9);
            buyFrame.setSize(300, 420);
            buyFrame.setLocation(400, 200);
            buyFrame.setVisible(true);
        }

        if (e.getSource() == cardLabel10) {
            JFrame buyFrame = new JFrame("Buy");
            JButton buyButton = new JButton("Buy!");
            JButton reserveButton = new JButton("Reserve");
            Font myFont = new Font("Ink Free", Font.BOLD, 15);
            
            buyButton.setFont(myFont);
            buyButton.setBounds(105, 300, 90, 30);
            buyButton.setFocusable(false);
            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Card currentCard = new Card();

                    for (int i = 0; i < ICON_SIZE; i++) {
                        if (cardBuyLabel10.getIcon() == c[i].getCardIcon()) {
                            currentCard = c[i];
                            break;
                        }
                    }
                    
                    if (player1.turn) {

                        player1.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player1.specialBlack++;
                        else if (currentCard.specialCoin == "white") player1.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player1.specialBlue++;
                        else if (currentCard.specialCoin == "red") player1.specialRed++;
                        else if (currentCard.specialCoin == "green") player1.specialGreen++;

                        specialLabel1.setText("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
                        
                        player1.turn = false;
                        player2.turn = true;
                        scoreLabel1.setText("Score:   " + player1.score);

                        if (player1.score >= 15) {
                            System.out.println(player1.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    } else {

                        player2.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player2.specialBlack++;
                        else if (currentCard.specialCoin == "white") player2.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player2.specialBlue++;
                        else if (currentCard.specialCoin == "red") player2.specialRed++;
                        else if (currentCard.specialCoin == "green") player2.specialGreen++;
                        
                        specialLabel2.setText("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");

                        player1.turn = true;
                        player2.turn = false;
                        scoreLabel2.setText("Score:   " + player2.score);

                        if (player2.score >= 15) {
                            System.out.println(player2.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    }

                    int randomNumber;

                    while (true) {

                        randomNumber = random.nextInt(90);

                        if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                            cardLabel10.setIcon(c[randomNumber].getCardIcon());
                            cardBuyLabel10.setIcon(c[randomNumber].getCardIcon());
                            break;
                        }

                    }

                    buyFrame.dispose();
                }
            });

            reserveButton.setFont(myFont);
            reserveButton.setBounds(105, 340, 90, 30);
            reserveButton.setFocusable(false);

            buyFrame.add(buyButton);
            buyFrame.add(reserveButton);
            buyFrame.add(cardBuyLabel10);
            buyFrame.setSize(300, 420);
            buyFrame.setLocation(400, 200);
            buyFrame.setVisible(true);
        }

        if (e.getSource() == cardLabel11) {
            JFrame buyFrame = new JFrame("Buy");
            JButton buyButton = new JButton("Buy!");
            JButton reserveButton = new JButton("Reserve");
            Font myFont = new Font("Ink Free", Font.BOLD, 15);
            
            buyButton.setFont(myFont);
            buyButton.setBounds(105, 300, 90, 30);
            buyButton.setFocusable(false);
            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Card currentCard = new Card();

                    for (int i = 0; i < ICON_SIZE; i++) {
                        if (cardBuyLabel1.getIcon() == c[i].getCardIcon()) {
                            currentCard = c[i];
                            break;
                        }
                    }
                    
                    if (player1.turn) {

                        player1.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player1.specialBlack++;
                        else if (currentCard.specialCoin == "white") player1.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player1.specialBlue++;
                        else if (currentCard.specialCoin == "red") player1.specialRed++;
                        else if (currentCard.specialCoin == "green") player1.specialGreen++;

                        specialLabel1.setText("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
                        
                        player1.turn = false;
                        player2.turn = true;
                        scoreLabel1.setText("Score:   " + player1.score);

                        if (player1.score >= 15) {
                            System.out.println(player1.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    } else {

                        player2.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player2.specialBlack++;
                        else if (currentCard.specialCoin == "white") player2.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player2.specialBlue++;
                        else if (currentCard.specialCoin == "red") player2.specialRed++;
                        else if (currentCard.specialCoin == "green") player2.specialGreen++;
                        
                        specialLabel2.setText("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");

                        player1.turn = true;
                        player2.turn = false;
                        scoreLabel2.setText("Score:   " + player2.score);

                        if (player2.score >= 15) {
                            System.out.println(player2.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    }

                    int randomNumber;

                    while (true) {

                        randomNumber = random.nextInt(90);

                        if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                            cardLabel11.setIcon(c[randomNumber].getCardIcon());
                            cardBuyLabel11.setIcon(c[randomNumber].getCardIcon());
                            break;
                        }

                    }

                    buyFrame.dispose();
                }
            });

            reserveButton.setFont(myFont);
            reserveButton.setBounds(105, 340, 90, 30);
            reserveButton.setFocusable(false);

            buyFrame.add(buyButton);
            buyFrame.add(reserveButton);
            buyFrame.add(cardBuyLabel11);
            buyFrame.setSize(300, 420);
            buyFrame.setLocation(400, 200);
            buyFrame.setVisible(true);
        }

        if (e.getSource() == cardLabel12) {
            JFrame buyFrame = new JFrame("Buy");
            JButton buyButton = new JButton("Buy!");
            JButton reserveButton = new JButton("Reserve");
            Font myFont = new Font("Ink Free", Font.BOLD, 15);
            
            buyButton.setFont(myFont);
            buyButton.setBounds(105, 300, 90, 30);
            buyButton.setFocusable(false);
            buyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Card currentCard = new Card();

                    for (int i = 0; i < ICON_SIZE; i++) {
                        if (cardBuyLabel12.getIcon() == c[i].getCardIcon()) {
                            currentCard = c[i];
                            break;
                        }
                    }
                    
                    if (player1.turn) {

                        player1.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player1.specialBlack++;
                        else if (currentCard.specialCoin == "white") player1.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player1.specialBlue++;
                        else if (currentCard.specialCoin == "red") player1.specialRed++;
                        else if (currentCard.specialCoin == "green") player1.specialGreen++;

                        specialLabel1.setText("Specials:           " + player1.specialBlack + "             " + player1.specialWhite + "             " + player1.specialBlue + "             " + player1.specialRed + "             " + player1.specialGreen + "             "  + "-");
                        
                        player1.turn = false;
                        player2.turn = true;
                        scoreLabel1.setText("Score:   " + player1.score);

                        if (player1.score >= 15) {
                            System.out.println(player1.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    } else {

                        player2.score += currentCard.score;

                        if (currentCard.specialCoin == "black") player2.specialBlack++;
                        else if (currentCard.specialCoin == "white") player2.specialWhite++;
                        else if (currentCard.specialCoin == "blue") player2.specialBlue++;
                        else if (currentCard.specialCoin == "red") player2.specialRed++;
                        else if (currentCard.specialCoin == "green") player2.specialGreen++;
                        
                        specialLabel2.setText("Specials:           " + player2.specialBlack + "             " + player2.specialWhite + "             " + player2.specialBlue + "             " + player2.specialRed + "             " + player2.specialGreen + "             "  + "-");

                        player1.turn = true;
                        player2.turn = false;
                        scoreLabel2.setText("Score:   " + player2.score);

                        if (player2.score >= 15) {
                            System.out.println(player2.name + " is the winner!") ;
                            myFrame.dispose();
                        }

                    }

                    int randomNumber;

                    while (true) {

                        randomNumber = random.nextInt(90);

                        if (c[randomNumber].getCardIcon() != cardLabel1.getIcon() && c[randomNumber].getCardIcon() != cardLabel2.getIcon() && c[randomNumber].getCardIcon() != cardLabel3.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel4.getIcon() && c[randomNumber].getCardIcon() != cardLabel5.getIcon() && c[randomNumber].getCardIcon() != cardLabel6.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel7.getIcon() && c[randomNumber].getCardIcon() != cardLabel8.getIcon() && c[randomNumber].getCardIcon() != cardLabel9.getIcon()
                        && c[randomNumber].getCardIcon() != cardLabel10.getIcon() && c[randomNumber].getCardIcon() != cardLabel11.getIcon() && c[randomNumber].getCardIcon() != cardLabel12.getIcon() && c[randomNumber] != null) {
                            cardLabel12.setIcon(c[randomNumber].getCardIcon());
                            cardBuyLabel12.setIcon(c[randomNumber].getCardIcon());
                            break;
                        }

                    }

                    buyFrame.dispose();
                }
            });

            reserveButton.setFont(myFont);
            reserveButton.setBounds(105, 340, 90, 30);
            reserveButton.setFocusable(false);

            buyFrame.add(buyButton);
            buyFrame.add(reserveButton);
            buyFrame.add(cardBuyLabel12);
            buyFrame.setSize(300, 420);
            buyFrame.setLocation(400, 200);
            buyFrame.setVisible(true);
        }

    }

    @Override
    public void mousePressed(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == cardLabel1) {
            cardLabel1.setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), 3));
        }
        if (e.getSource() == cardLabel2) {
            cardLabel2.setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), 3));
        }
        if (e.getSource() == cardLabel3) {
            cardLabel3.setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), 3));
        }
        if (e.getSource() == cardLabel4) {
            cardLabel4.setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), 3));
        }
        if (e.getSource() == cardLabel5) {
            cardLabel5.setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), 3));
        }
        if (e.getSource() == cardLabel6) {
            cardLabel6.setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), 3));
        }
        if (e.getSource() == cardLabel7) {
            cardLabel7.setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), 3));
        }
        if (e.getSource() == cardLabel8) {
            cardLabel8.setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), 3));
        }
        if (e.getSource() == cardLabel9) {
            cardLabel9.setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), 3));
        }
        if (e.getSource() == cardLabel10) {
            cardLabel10.setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), 3));
        }
        if (e.getSource() == cardLabel11) {
            cardLabel11.setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), 3));
        }
        if (e.getSource() == cardLabel12) {
            cardLabel12.setBorder(BorderFactory.createLineBorder(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)), 3));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        cardLabel1.setBorder(null);
        cardLabel2.setBorder(null);
        cardLabel3.setBorder(null);
        cardLabel4.setBorder(null);
        cardLabel5.setBorder(null);
        cardLabel6.setBorder(null);
        cardLabel7.setBorder(null);
        cardLabel8.setBorder(null);
        cardLabel9.setBorder(null);
        cardLabel10.setBorder(null);
        cardLabel11.setBorder(null);
        cardLabel12.setBorder(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == get2Coin) {
            
            chanceCoin = 3;
            get2Frame.setVisible(true);
            coinLabel.remove(get2Coin);
            coinLabel.remove(get3Coin);
            coinLabel.setIcon(coin);

        }

        if (e.getSource() == black1) {
            if (this.blackCount > 0) {
                chanceCoin--;
                this.blackCount--;
                blackState = true;
                black1.setEnabled(false);
            }
            if (chanceCoin == 0) disableAll1();
            black1Label.setText("BLACK: " + this.blackCount);
        }

        if (e.getSource() == white1) {
            if (this.whiteCount > 0) {
                chanceCoin--;
                this.whiteCount--;
                whiteState = true;
                white1.setEnabled(false);
            }
            if (chanceCoin == 0) disableAll1();
            white1Label.setText("WHITE: " + this.whiteCount);
        }
        
        if (e.getSource() == blue1) {
            if (this.blueCount > 0) {
                chanceCoin--;
                this.blueCount--;
                blueState = true;
                blue1.setEnabled(false);
            }
            if (chanceCoin == 0) disableAll1();
            blue1Label.setText("BLUE: " + this.blueCount);
        }
        
        if (e.getSource() == red1) {
            if (this.redCount > 0) {
                chanceCoin--;
                this.redCount--;
                redState = true;
                red1.setEnabled(false);
            }
            if (chanceCoin == 0) disableAll1();
            red1Label.setText("RED: " + this.redCount);
        }
        
        if (e.getSource() == green1) {
            if (this.greenCount > 0) {
                chanceCoin--;
                this.greenCount--;
                greenState = true;
                green1.setEnabled(false);
            }
            if (chanceCoin == 0) disableAll1();
            green1Label.setText("GREEN: " + this.greenCount);
        }

        if (e.getSource() == done1) {
            if (player1.turn) {

                player1.turn = false;
                player2.turn = true;
                if (blackState) player1.blackCount++;
                if (whiteState) player1.whiteCount++;
                if (blueState) player1.blueCount++;
                if (redState) player1.redCount++;
                if (greenState) player1.greenCount++;

            } else {

                player1.turn = true;
                player2.turn = false;
                if (blackState) player2.blackCount++;
                if (whiteState) player2.whiteCount++;
                if (blueState) player2.blueCount++;
                if (redState) player2.redCount++;
                if (greenState) player2.greenCount++;

            }

            blackState = false;
            whiteState = false;
            blueState = false;
            redState = false;
            greenState = false;

            black1.setEnabled(true);
            white1.setEnabled(true);
            blue1.setEnabled(true);
            red1.setEnabled(true);
            green1.setEnabled(true);

            updateCoin();
            get2Frame.dispose();
        }
        
        
        if (e.getSource() == get3Coin) {
            
            get3Frame.setVisible(true);
            coinLabel.remove(get2Coin);
            coinLabel.remove(get3Coin);
            coinLabel.setIcon(coin);

        }

        if (e.getSource() == black2) {
            if (this.blackCount == 4) {
                this.blackCount -= 2;
                blackState = true;
                black2.setEnabled(false);
            }
            black2Label.setText("BLACK: " + this.blackCount);
            disableAll2();
        }

        if (e.getSource() == white2) {
            if (this.whiteCount == 4) {
                this.whiteCount -= 2;
                whiteState = true;
                white2.setEnabled(false);
            }
            white2Label.setText("WHITE: " + this.whiteCount);
            disableAll2();
        }

        if (e.getSource() == blue2) {
            if (this.blueCount == 4) {
                this.blueCount -= 2;
                blueState = true;
                blue2.setEnabled(false);
            }
            blue2Label.setText("BLUE: " + this.blueCount);
            disableAll2();
        }

        if (e.getSource() == red2) {
            if (this.redCount == 4) {
                this.redCount -= 2;
                redState = true;
                red2.setEnabled(false);
            }
            red2Label.setText("RED: " + this.redCount);
            disableAll2();
        }

        if (e.getSource() == green2) {
            if (this.greenCount == 4) {
                this.greenCount -= 2;
                greenState = true;
                green2.setEnabled(false);
            }
            green2Label.setText("GREEN: " + this.greenCount);
            disableAll2();
        }

        if (e.getSource() == done2) {

            if (player1.turn) {

                player1.turn = false;
                player2.turn = true;
                if (blackState) player1.blackCount += 2;
                if (whiteState) player1.whiteCount += 2;
                if (blueState) player1.blueCount += 2;
                if (redState) player1.redCount += 2;
                if (greenState) player1.greenCount += 2;

            } else {

                player1.turn = true;
                player2.turn = false;
                if (blackState) player2.blackCount += 2;
                if (whiteState) player2.whiteCount += 2;
                if (blueState) player2.blueCount += 2;
                if (redState) player2.redCount += 2;
                if (greenState) player2.greenCount += 2;

            }

            blackState = false;
            whiteState = false;
            blueState = false;
            redState = false;
            greenState = false;

            if (this.blackCount == 4) black2.setEnabled(true);
            if (this.whiteCount == 4) white2.setEnabled(true);
            if (this.blueCount == 4) blue2.setEnabled(true);
            if (this.redCount == 4) red2.setEnabled(true);
            if (this.greenCount == 4) green2.setEnabled(true);

            updateCoin();
            get3Frame.dispose();
        }

    }

}

