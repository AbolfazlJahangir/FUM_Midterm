import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Frame extends JFrame {

    public static final int ICON_SIZE = 90;

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

    JButton black = new JButton(blackIcon);
    JButton white = new JButton(whiteIcon);
    JButton blue = new JButton(blueIcon);
    JButton red = new JButton(redIcon);
    JButton green = new JButton(greenIcon);
    JButton gold = new JButton(goldIcon);


    int blackCount = 4;
    int whiteCount = 4;
    int blueCount = 4;
    int redCount = 4;
    int greenCount = 4;
    int goldCount = 4;

    boolean blackState = false, whiteState = false, blueState = false, redState = false, greenState = false;
    boolean bs = true, ws = true, bls = true, rs = true, gs = true;
    boolean anyButtonClicked2Coin = false, anyButtonClickedCoin = false;

    int chanceCoin;

    Random random = new Random();


    Frame() {

        JFrame myFrame = this;

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
        if (name1 == "") name1 = "Player1";
        player1.name = name1;

        player1Label.setBounds(10, 10, 500, 350);
        player1Label.setBorder(BorderFactory.createLineBorder(Color.red, 5));

        player1NameLabel = new JLabel();
        player1NameLabel.setFont(new Font("Ink Free", Font.BOLD, 28));
        player1NameLabel.setBounds(200, 20, 150, 50);
        player1NameLabel.setForeground(Color.white);
        player1NameLabel.setText(name1);
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
        if (name2 == " ") name2 = "Player2";
        player2.name = name2;
        
        player2Label.setBounds(10, 400, 500, 350);
        player2Label.setBorder(BorderFactory.createLineBorder(Color.yellow, 5));

        player2NameLabel = new JLabel();
        player2NameLabel.setFont(new Font("Ink Free", Font.BOLD, 28));
        player2NameLabel.setBounds(200, 20, 150, 50);
        player2NameLabel.setForeground(Color.white);
        player2NameLabel.setText(name2);
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

        MouseAdapter mouseAdapter1 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        };

        MouseAdapter mouseAdapter2 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        };

        MouseAdapter mouseAdapter3 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        };

        MouseAdapter mouseAdapter4 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        };

        MouseAdapter mouseAdapter5 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        };

        MouseAdapter mouseAdapter6 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        };

        MouseAdapter mouseAdapter7 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        };

        MouseAdapter mouseAdapter8 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        };

        MouseAdapter mouseAdapter9 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        };

        MouseAdapter mouseAdapter10 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        };

        MouseAdapter mouseAdapter11 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        };

        MouseAdapter mouseAdapter12 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        };

        cardLabel1.setBounds(1150, 600, 130, 180);
        cardLabel1.setIcon(arrayIcons[0]);
        cardLabel1.addMouseListener(mouseAdapter1);

        cardLabel2.setBounds(970, 600, 130, 180);
        cardLabel2.setIcon(arrayIcons[1]);
        cardLabel2.addMouseListener(mouseAdapter2);

        cardLabel3.setBounds(790, 600, 130, 180);
        cardLabel3.setIcon(arrayIcons[2]);
        cardLabel3.addMouseListener(mouseAdapter3);

        cardLabel4.setBounds(610, 600, 130, 180);
        cardLabel4.setIcon(arrayIcons[3]);
        cardLabel4.addMouseListener(mouseAdapter4);

        cardLabel5.setBounds(1150, 410, 130, 180);
        cardLabel5.setIcon(arrayIcons[4]);
        cardLabel5.addMouseListener(mouseAdapter5);

        cardLabel6.setBounds(970, 410, 130, 180);
        cardLabel6.setIcon(arrayIcons[5]);
        cardLabel6.addMouseListener(mouseAdapter6);

        cardLabel7.setBounds(790, 410, 130, 180);
        cardLabel7.setIcon(arrayIcons[6]);
        cardLabel7.addMouseListener(mouseAdapter7);

        cardLabel8.setBounds(610, 410, 130, 180);
        cardLabel8.setIcon(arrayIcons[7]);
        cardLabel8.addMouseListener(mouseAdapter8);

        cardLabel9.setBounds(1150, 220, 130, 180);
        cardLabel9.setIcon(arrayIcons[8]);
        cardLabel9.addMouseListener(mouseAdapter9);

        cardLabel10.setBounds(970, 220, 130, 180);
        cardLabel10.setIcon(arrayIcons[9]);
        cardLabel10.addMouseListener(mouseAdapter10);

        cardLabel11.setBounds(790, 220, 130, 180);
        cardLabel11.setIcon(arrayIcons[10]);
        cardLabel11.addMouseListener(mouseAdapter11);

        cardLabel12.setBounds(610, 220, 130, 180);
        cardLabel12.setIcon(arrayIcons[11]);
        cardLabel12.addMouseListener(mouseAdapter12);

        gameLabel.setOpaque(true);
        gameLabel.setIcon(background);

        coinLabel.setIcon(coin);
        coinLabel.setOpaque(false);
        coinLabel.setBorder(null);
        coinLabel.setBounds(1300, 300, 200, 200);
        coinLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                chanceCoin = 3;

                black.setEnabled(true);
                white.setEnabled(true);
                blue.setEnabled(true);
                red.setEnabled(true);
                green.setEnabled(true);

                JFrame coinFrame = new JFrame("Coins");
                JLabel cl = new JLabel();
                JButton get2Coin = new JButton("Get Two Coin!");
                JLabel infoLabel = new JLabel("Pick your coins!");
                JLabel blackLabel = new JLabel("BLACK: " + blackCount);
                JLabel whiteLabel = new JLabel("WHITE: " + whiteCount);
                JLabel blueLabel = new JLabel("BLUE: " + blueCount);
                JLabel redLabel = new JLabel("RED: " + redCount);
                JLabel greenLabel = new JLabel("GREEN: " + greenCount);
                JLabel goldLabel = new JLabel();
                JButton addCoins = new JButton("Done!");

                addCoins.setEnabled(true);
                addCoins.setBackground(Color.yellow);

                cl.setOpaque(true);
                cl.setBounds(0, 0, 935, 400);
                cl.setBackground(Color.cyan);

                get2Coin.setBounds(760, 300, 150, 50);
                get2Coin.setBackground(Color.pink);
                get2Coin.setFont(new Font("Ink Free", Font.BOLD, 15));
                get2Coin.setFocusable(false);
                cl.add(get2Coin);

                if (blackCount < 4 && whiteCount < 4 && blueCount < 4 && redCount < 4 && greenCount < 4) {
                    get2Coin.setEnabled(false);
                }

                JFrame twoCoinFrame = new JFrame("Two coin Frame");
                JLabel coinLabel = new JLabel();
                coinLabel.setBounds(0, 0, 400, 250);
                coinLabel.setOpaque(true);
                twoCoinFrame.setLocation(400, 250);
                twoCoinFrame.setSize(400, 250);

                JButton blackBtn = new JButton("BLACK");
                blackBtn.setFont(new Font("Ink Free", Font.BOLD, 10));
                blackBtn.setBounds(10, 40, 72, 40);
                blackBtn.setForeground(Color.white);
                blackBtn.setBackground(Color.black);
                blackBtn.setFocusable(false);
                coinLabel.add(blackBtn);

                JButton whiteBtn = new JButton("WHITE");
                whiteBtn.setFont(new Font("Ink Free", Font.BOLD, 10));
                whiteBtn.setBounds(82, 40, 72, 40);
                whiteBtn.setForeground(Color.black);
                whiteBtn.setBackground(Color.white);
                whiteBtn.setFocusable(false);
                coinLabel.add(whiteBtn);

                JButton blueBtn = new JButton("BLUE");
                blueBtn.setFont(new Font("Ink Free", Font.BOLD, 10));
                blueBtn.setBounds(154, 40, 72, 40);
                blueBtn.setBackground(Color.blue);
                blueBtn.setFocusable(false);
                coinLabel.add(blueBtn);

                JButton redBtn = new JButton("RED");
                redBtn.setFont(new Font("Ink Free", Font.BOLD, 10));
                redBtn.setBounds(226, 40, 72, 40);
                redBtn.setBackground(Color.red);
                redBtn.setFocusable(false);
                coinLabel.add(redBtn);

                JButton greenBtn = new JButton("GREEN");
                greenBtn.setFont(new Font("Ink Free", Font.BOLD, 10));
                greenBtn.setBounds(298, 40, 72, 40);
                greenBtn.setBackground(Color.green);
                greenBtn.setFocusable(false);
                coinLabel.add(greenBtn);

                JButton doneButton = new JButton("Done!");
                doneButton.setFont(new Font("Ink Free", Font.BOLD, 15));
                doneButton.setBounds(160, 180, 80, 30);
                coinLabel.add(doneButton);

                blackBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        anyButtonClicked2Coin = true;

                        blackState = true;
                        whiteState = false;
                        blueState = false;
                        redState = false;
                        greenState = false;

                    }
                });

                whiteBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        anyButtonClicked2Coin = true;

                        blackState = false;
                        whiteState = true;
                        blueState = false;
                        redState = false;
                        greenState = false;

                    }
                });

                blueBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        anyButtonClicked2Coin = true;

                        blackState = false;
                        whiteState = false;
                        blueState = true;
                        redState = false;
                        greenState = false;

                    }
                });

                redBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        anyButtonClicked2Coin = true;

                        blackState = false;
                        whiteState = false;
                        blueState = false;
                        redState = true;
                        greenState = false;

                    }
                });

                greenBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        anyButtonClicked2Coin = true;

                        blackState = false;
                        whiteState = false;
                        blueState = false;
                        redState = false;
                        greenState = true;

                    }
                });

                doneButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        
                        // blackBtn.setEnabled(false);
                        // whiteBtn.setEnabled(false);
                        // blueBtn.setEnabled(false);
                        // redBtn.setEnabled(false);
                        // greenBtn.setEnabled(false);
                        if (anyButtonClicked2Coin) {

                            black.setEnabled(false);
                            white.setEnabled(false);
                            blue.setEnabled(false);
                            red.setEnabled(false);
                            green.setEnabled(false);

                        }

                        if (blackState) {

                            blackCount -= 2;
                        
                            if (player1.turn) {
                                player1.blackCount += 2;
                                player1.turn = false;
                                player2.turn = true;
                            } else {
                                player2.blackCount += 2;
                                player1.turn = true;
                                player2.turn = false;
                            }

                            blackLabel.setText("BLACK: " + blackCount);

                            blackState = false;
                            
                        } else if (whiteState) {

                            whiteCount -= 2;
                        
                            if (player1.turn) {
                                player1.whiteCount += 2;
                                player1.turn = false;
                                player2.turn = true;
                            } else {
                                player2.whiteCount += 2;
                                player1.turn = true;
                                player2.turn = false;
                            }

                            whiteLabel.setText("WHITE: " + whiteCount);

                            whiteState = false;

                        } else if (blueState) {

                            blueCount -= 2;
                        
                            if (player1.turn) {
                                player1.blueCount += 2;
                                player1.turn = false;
                                player2.turn = true;
                            } else {
                                player2.blueCount += 2;
                                player1.turn = true;
                                player2.turn = false;
                            }

                            blueLabel.setText("BLUE: " + blueCount);

                            blueState = false;

                        } else if (redState) {

                            redCount -= 2;
                        
                            if (player1.turn) {
                                player1.redCount += 2;
                                player1.turn = false;
                                player2.turn = true;
                            } else {
                                player2.redCount += 2;
                                player1.turn = true;
                                player2.turn = false;
                            }

                            redLabel.setText("RED: " + redCount);

                            redState = false;

                        } else if (greenState) {

                            greenCount -= 2;
                            
                            if (player1.turn) {
                                player1.greenCount += 2;
                                player1.turn = false;
                                player2.turn = true;
                            } else {
                                player2.greenCount += 2;
                                player1.turn = true;
                                player2.turn = false;
                            }

                            greenLabel.setText("GREEN: " + greenCount);

                            greenState = false;

                        }

                        updateCoin();
                        twoCoinFrame.dispose();
                        
                    }
                });

                get2Coin.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        if (blackCount < 4) {

                            blackBtn.setEnabled(false);
                            blackBtn.setBackground(Color.gray);

                        }
                        if (whiteCount < 4) {

                            whiteBtn.setEnabled(false);
                            whiteBtn.setBackground(Color.gray);

                        }
                        if (blueCount < 4) {

                            blueBtn.setEnabled(false);
                            blueBtn.setBackground(Color.gray);

                        }
                        if (redCount < 4) {

                            redBtn.setEnabled(false);
                            redBtn.setBackground(Color.gray);

                        }
                        if (greenCount < 4) {

                            greenBtn.setEnabled(false);
                            greenBtn.setBackground(Color.gray);

                        }
                        twoCoinFrame.add(coinLabel);
                        twoCoinFrame.setVisible(true);
                    }
                });

                infoLabel.setFont(new Font("Ink Free", Font.BOLD, 35));
                infoLabel.setBounds(350, 0, 300, 60);
                infoLabel.setForeground(Color.darkGray);
                cl.add(infoLabel);

                Font counterLabelFont = new Font("Ink Free", Font.BOLD, 15);

                blackLabel.setBounds(10, 250, 90, 20);
                blackLabel.setFont(counterLabelFont);
                cl.add(blackLabel);

                whiteLabel.setBounds(10, 270, 80, 20);
                whiteLabel.setFont(counterLabelFont);
                cl.add(whiteLabel);

                blueLabel.setBounds(10, 290, 80, 20);
                blueLabel.setFont(counterLabelFont);
                cl.add(blueLabel);

                redLabel.setBounds(10, 310, 80, 20);
                redLabel.setFont(counterLabelFont);
                cl.add(redLabel);

                greenLabel.setBounds(10, 330, 80, 20);
                greenLabel.setFont(counterLabelFont);
                cl.add(greenLabel);

                goldLabel.setBounds(10, 350, 80, 20);
                goldLabel.setFont(counterLabelFont);
                cl.add(goldLabel);

                black.setBounds(10, 60, 150, 150);
                black.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (chanceCoin > 0) {

                            if (bs) {
                                chanceCoin--;
                                bs = false;
                                black.setEnabled(bs);
                            } else {
                                chanceCoin++;
                                bs = true;
                                black.setEnabled(bs);
                            }

                            if (player1.turn) {
                                if (blackCount > 0) {
                                    blackCount--;
                                    player1.blackCount++;
                                    blackLabel.setText("BLACK: " + blackCount);
                                }
                            } else {
                                if (blackCount > 0) {
                                    blackCount--;
                                    player2.blackCount++;
                                    blackLabel.setText("BLACK: " + blackCount);
                                }
                            }
                        }
                        if (chanceCoin == 0) {
                            black.setEnabled(false);
                            white.setEnabled(false);
                            blue.setEnabled(false);
                            red.setEnabled(false);
                            green.setEnabled(false);
                        }
                    }
                });

                white.setBounds(160, 60, 150, 150);
                white.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (chanceCoin > 0) {

                            if (ws) {
                                chanceCoin--;
                                ws = false;
                                white.setEnabled(ws);
                            } else {
                                chanceCoin++;
                                ws = true;
                                white.setEnabled(ws);
                            }

                            if (player1.turn) {
                                if (whiteCount > 0) {
                                    whiteCount--;
                                    player1.whiteCount++;
                                    whiteLabel.setText("WHITE: " + whiteCount);
                                }
                            } else {
                                if (whiteCount > 0) {
                                    whiteCount--;
                                    player2.whiteCount++;
                                    whiteLabel.setText("WHITE: " + whiteCount);
                                }
                            }
                        }
                        if (chanceCoin == 0) {
                            black.setEnabled(false);
                            white.setEnabled(false);
                            blue.setEnabled(false);
                            red.setEnabled(false);
                            green.setEnabled(false);
                        }
                    }
                });

                blue.setBounds(310, 60, 150, 150);
                blue.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (chanceCoin > 0) {

                            if (bls) {
                                chanceCoin--;
                                bls = false;
                                blue.setEnabled(bls);
                            } else {
                                chanceCoin++;
                                bls = true;
                                blue.setEnabled(bls);
                            }

                            if (player1.turn) {
                                if (blueCount > 0) {
                                    blueCount--;
                                    player1.blueCount++;
                                    blueLabel.setText("BLUE: " + blueCount);
                                }
                            } else {
                                if (blueCount > 0) {
                                    blueCount--;
                                    player2.blueCount++;
                                    blueLabel.setText("BLUE: " + blueCount);
                                }
                            }
                        }
                        if (chanceCoin == 0) {
                            black.setEnabled(false);
                            white.setEnabled(false);
                            blue.setEnabled(false);
                            red.setEnabled(false);
                            green.setEnabled(false);
                        }
                    }
                });

                red.setBounds(460, 60, 150, 150);
                red.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (chanceCoin > 0) {

                            if (rs) {
                                chanceCoin--;
                                rs = false;
                                red.setEnabled(rs);
                            } else {
                                chanceCoin++;
                                rs = true;
                                red.setEnabled(rs);
                            }

                            if (player1.turn) {
                                if (redCount > 0) {
                                    redCount--;
                                    player1.redCount++;
                                    redLabel.setText("RED: " + redCount);
                                }
                            } else {
                                if (redCount > 0) {
                                    redCount--;
                                    player2.redCount++;
                                    redLabel.setText("RED: " + redCount);
                                }
                            }
                        }
                        if (chanceCoin == 0) {
                            black.setEnabled(false);
                            white.setEnabled(false);
                            blue.setEnabled(false);
                            red.setEnabled(false);
                            green.setEnabled(false);
                        }
                    }
                });

                green.setBounds(610, 60, 150, 150);
                green.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (chanceCoin > 0) {

                            if (gs) {
                                chanceCoin--;
                                gs = false;
                                green.setEnabled(gs);
                            } else {
                                chanceCoin++;
                                gs = true;
                                green.setEnabled(gs);
                            }
                            
                            if (player1.turn) {
                                if (greenCount > 0) {
                                    greenCount--;
                                    player1.greenCount++;
                                    greenLabel.setText("GREEN: " + greenCount);
                                }
                            } else {
                                if (greenCount > 0) {
                                    greenCount--;
                                    player2.greenCount++;
                                    greenLabel.setText("GREEN: " + greenCount);
                                }
                            }
                        }
                        if (chanceCoin == 0) {
                            black.setEnabled(false);
                            white.setEnabled(false);
                            blue.setEnabled(false);
                            red.setEnabled(false);
                            green.setEnabled(false);
                        }
                    }
                });

                gold.setBounds(760, 60, 150, 150);


                // Add the chosen coins to the player's coins
                addCoins.setBounds(410, 300, 100, 50);
                addCoins.setFocusable(false);
                addCoins.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        // add coins ......
                        if (player1.turn) {
                            player1.turn = false;
                            player2.turn = true;
                        }
                        else {
                            player1.turn = true;
                            player2.turn = false;
                        }
                        updateCoin();
                        coinFrame.dispose();
                    }
                });
                cl.add(addCoins);

                coinFrame.setLayout(null);
                coinFrame.setSize(935, 405);
                coinFrame.setLocation(100, 100);

                coinFrame.add(black);
                coinFrame.add(white);
                coinFrame.add(blue);
                coinFrame.add(red);
                coinFrame.add(green);
                coinFrame.add(gold);
                coinFrame.add(cl);

                coinFrame.setVisible(true);

            }

            @Override
            public void mousePressed(MouseEvent e) { }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }
        });

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

}

