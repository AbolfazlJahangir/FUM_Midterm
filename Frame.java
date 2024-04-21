import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {

    public static final int ICON_SIZE = 120;

    Player player1 = new Player(1);
    Player player2 = new Player(2);

    JLabel player1Label = new JLabel();
    JLabel player2Label = new JLabel();

    JLabel coinLabel = new JLabel();
    JLabel gameLabel = new JLabel();

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
    
    Frame() {
        player1.turn = true;
        player2.turn = false;



        String name1 = JOptionPane.showInputDialog("Player1, Enter you name:");
        if (name1 == null) name1 = "Player1";

        player1Label.setBounds(10, 10, 500, 350);
        player1Label.setBorder(BorderFactory.createLineBorder(Color.red, 5));

        JLabel player1NameLabel = new JLabel();
        player1NameLabel.setFont(new Font("Ink Free", Font.BOLD, 28));
        player1NameLabel.setBounds(200, 20, 150, 50);
        player1NameLabel.setForeground(Color.white);
        player1NameLabel.setText(name1);
        player1Label.add(player1NameLabel);

        JLabel player1InfoLabel = new JLabel();
        // ...



        String name2 = JOptionPane.showInputDialog("Player2, Enter you name:");
        if (name2 == null) name2 = "Player2";
        
        player2Label.setBounds(10, 400, 500, 350);
        player2Label.setBorder(BorderFactory.createLineBorder(Color.yellow, 5));

        JLabel player2NameLabel = new JLabel();
        player2NameLabel.setFont(new Font("Ink Free", Font.BOLD, 28));
        player2NameLabel.setBounds(200, 20, 150, 50);
        player2NameLabel.setForeground(Color.white);
        player2NameLabel.setText(name2);
        player2Label.add(player2NameLabel);

        JLabel player2InfoLabel = new JLabel();
        // ...


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
                JLabel cardLabel = new JLabel(arrayIcons[0]);
                JButton buyButton = new JButton("Buy!");
                JButton reserveButton = new JButton("Reserve");
                Font myFont = new Font("Ink Free", Font.BOLD, 15);

                buyButton.setFont(myFont);
                buyButton.setBounds(105, 300, 90, 30);
                buyButton.setFocusable(false);

                reserveButton.setFont(myFont);
                reserveButton.setBounds(105, 340, 90, 30);
                reserveButton.setFocusable(false);

                buyFrame.add(buyButton);
                buyFrame.add(reserveButton);
                buyFrame.add(cardLabel);
                buyFrame.setSize(300, 420);
                buyFrame.setLocation(400, 200);
                buyFrame.setVisible(true);
            }
        };

        MouseAdapter mouseAdapter2 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame buyFrame = new JFrame("Buy");
                JLabel cardLabel = new JLabel(arrayIcons[1]);
                JButton buyButton = new JButton("Buy!");
                JButton reserveButton = new JButton("Reserve");
                Font myFont = new Font("Ink Free", Font.BOLD, 15);
                
                buyButton.setFont(myFont);
                buyButton.setBounds(105, 300, 90, 30);
                buyButton.setFocusable(false);

                reserveButton.setFont(myFont);
                reserveButton.setBounds(105, 340, 90, 30);
                reserveButton.setFocusable(false);

                buyFrame.add(buyButton);
                buyFrame.add(reserveButton);
                buyFrame.add(cardLabel);
                buyFrame.setSize(300, 420);
                buyFrame.setLocation(400, 200);
                buyFrame.setVisible(true);
            }
        };

        MouseAdapter mouseAdapter3 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame buyFrame = new JFrame("Buy");
                JLabel cardLabel = new JLabel(arrayIcons[2]);
                JButton buyButton = new JButton("Buy!");
                JButton reserveButton = new JButton("Reserve");
                Font myFont = new Font("Ink Free", Font.BOLD, 15);
                
                buyButton.setFont(myFont);
                buyButton.setBounds(105, 300, 90, 30);
                buyButton.setFocusable(false);

                reserveButton.setFont(myFont);
                reserveButton.setBounds(105, 340, 90, 30);
                reserveButton.setFocusable(false);

                buyFrame.add(buyButton);
                buyFrame.add(reserveButton);
                buyFrame.add(cardLabel);
                buyFrame.setSize(300, 420);
                buyFrame.setLocation(400, 200);
                buyFrame.setVisible(true);
            }
        };

        MouseAdapter mouseAdapter4 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame buyFrame = new JFrame("Buy");
                JLabel cardLabel = new JLabel(arrayIcons[3]);
                JButton buyButton = new JButton("Buy!");
                JButton reserveButton = new JButton("Reserve");
                Font myFont = new Font("Ink Free", Font.BOLD, 15);
                
                buyButton.setFont(myFont);
                buyButton.setBounds(105, 300, 90, 30);
                buyButton.setFocusable(false);

                reserveButton.setFont(myFont);
                reserveButton.setBounds(105, 340, 90, 30);
                reserveButton.setFocusable(false);

                buyFrame.add(buyButton);
                buyFrame.add(reserveButton);
                buyFrame.add(cardLabel);
                buyFrame.setSize(300, 420);
                buyFrame.setLocation(400, 200);
                buyFrame.setVisible(true);
            }
        };

        MouseAdapter mouseAdapter5 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame buyFrame = new JFrame("Buy");
                JLabel cardLabel = new JLabel(arrayIcons[4]);
                JButton buyButton = new JButton("Buy!");
                JButton reserveButton = new JButton("Reserve");
                Font myFont = new Font("Ink Free", Font.BOLD, 15);
                
                buyButton.setFont(myFont);
                buyButton.setBounds(105, 300, 90, 30);
                buyButton.setFocusable(false);

                reserveButton.setFont(myFont);
                reserveButton.setBounds(105, 340, 90, 30);
                reserveButton.setFocusable(false);

                buyFrame.add(buyButton);
                buyFrame.add(reserveButton);
                buyFrame.add(cardLabel);
                buyFrame.setSize(300, 420);
                buyFrame.setLocation(400, 200);
                buyFrame.setVisible(true);
            }
        };

        MouseAdapter mouseAdapter6 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame buyFrame = new JFrame("Buy");
                JLabel cardLabel = new JLabel(arrayIcons[5]);
                JButton buyButton = new JButton("Buy!");
                JButton reserveButton = new JButton("Reserve");
                Font myFont = new Font("Ink Free", Font.BOLD, 15);
                
                buyButton.setFont(myFont);
                buyButton.setBounds(105, 300, 90, 30);
                buyButton.setFocusable(false);

                reserveButton.setFont(myFont);
                reserveButton.setBounds(105, 340, 90, 30);
                reserveButton.setFocusable(false);

                buyFrame.add(buyButton);
                buyFrame.add(reserveButton);
                buyFrame.add(cardLabel);
                buyFrame.setSize(300, 420);
                buyFrame.setLocation(400, 200);
                buyFrame.setVisible(true);
            }
        };

        MouseAdapter mouseAdapter7 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame buyFrame = new JFrame("Buy");
                JLabel cardLabel = new JLabel(arrayIcons[6]);
                JButton buyButton = new JButton("Buy!");
                JButton reserveButton = new JButton("Reserve");
                Font myFont = new Font("Ink Free", Font.BOLD, 15);
                
                buyButton.setFont(myFont);
                buyButton.setBounds(105, 300, 90, 30);
                buyButton.setFocusable(false);

                reserveButton.setFont(myFont);
                reserveButton.setBounds(105, 340, 90, 30);
                reserveButton.setFocusable(false);

                buyFrame.add(buyButton);
                buyFrame.add(reserveButton);
                buyFrame.add(cardLabel);
                buyFrame.setSize(300, 420);
                buyFrame.setLocation(400, 200);
                buyFrame.setVisible(true);
            }
        };

        MouseAdapter mouseAdapter8 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame buyFrame = new JFrame("Buy");
                JLabel cardLabel = new JLabel(arrayIcons[7]);
                JButton buyButton = new JButton("Buy!");
                JButton reserveButton = new JButton("Reserve");
                Font myFont = new Font("Ink Free", Font.BOLD, 15);
                
                buyButton.setFont(myFont);
                buyButton.setBounds(105, 300, 90, 30);
                buyButton.setFocusable(false);

                reserveButton.setFont(myFont);
                reserveButton.setBounds(105, 340, 90, 30);
                reserveButton.setFocusable(false);

                buyFrame.add(buyButton);
                buyFrame.add(reserveButton);
                buyFrame.add(cardLabel);
                buyFrame.setSize(300, 420);
                buyFrame.setLocation(400, 200);
                buyFrame.setVisible(true);
            }
        };

        MouseAdapter mouseAdapter9 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame buyFrame = new JFrame("Buy");
                JLabel cardLabel = new JLabel(arrayIcons[8]);
                JButton buyButton = new JButton("Buy!");
                JButton reserveButton = new JButton("Reserve");
                Font myFont = new Font("Ink Free", Font.BOLD, 15);
                
                buyButton.setFont(myFont);
                buyButton.setBounds(105, 300, 90, 30);
                buyButton.setFocusable(false);

                reserveButton.setFont(myFont);
                reserveButton.setBounds(105, 340, 90, 30);
                reserveButton.setFocusable(false);

                buyFrame.add(buyButton);
                buyFrame.add(reserveButton);
                buyFrame.add(cardLabel);
                buyFrame.setSize(300, 420);
                buyFrame.setLocation(400, 200);
                buyFrame.setVisible(true);
            }
        };

        MouseAdapter mouseAdapter10 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame buyFrame = new JFrame("Buy");
                JLabel cardLabel = new JLabel(arrayIcons[9]);
                JButton buyButton = new JButton("Buy!");
                JButton reserveButton = new JButton("Reserve");
                Font myFont = new Font("Ink Free", Font.BOLD, 15);
                
                buyButton.setFont(myFont);
                buyButton.setBounds(105, 300, 90, 30);
                buyButton.setFocusable(false);

                reserveButton.setFont(myFont);
                reserveButton.setBounds(105, 340, 90, 30);
                reserveButton.setFocusable(false);

                buyFrame.add(buyButton);
                buyFrame.add(reserveButton);
                buyFrame.add(cardLabel);
                buyFrame.setSize(300, 420);
                buyFrame.setLocation(400, 200);
                buyFrame.setVisible(true);
            }
        };

        MouseAdapter mouseAdapter11 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame buyFrame = new JFrame("Buy");
                JLabel cardLabel = new JLabel(arrayIcons[10]);
                JButton buyButton = new JButton("Buy!");
                JButton reserveButton = new JButton("Reserve");
                Font myFont = new Font("Ink Free", Font.BOLD, 15);
                
                buyButton.setFont(myFont);
                buyButton.setBounds(105, 300, 90, 30);
                buyButton.setFocusable(false);

                reserveButton.setFont(myFont);
                reserveButton.setBounds(105, 340, 90, 30);
                reserveButton.setFocusable(false);

                buyFrame.add(buyButton);
                buyFrame.add(reserveButton);
                buyFrame.add(cardLabel);
                buyFrame.setSize(300, 420);
                buyFrame.setLocation(400, 200);
                buyFrame.setVisible(true);
            }
        };

        MouseAdapter mouseAdapter12 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame buyFrame = new JFrame("Buy");
                JLabel cardLabel = new JLabel(arrayIcons[11]);
                JButton buyButton = new JButton("Buy!");
                JButton reserveButton = new JButton("Reserve");
                Font myFont = new Font("Ink Free", Font.BOLD, 15);
                
                buyButton.setFont(myFont);
                buyButton.setBounds(105, 300, 90, 30);
                buyButton.setFocusable(false);

                reserveButton.setFont(myFont);
                reserveButton.setBounds(105, 340, 90, 30);
                reserveButton.setFocusable(false);

                buyFrame.add(buyButton);
                buyFrame.add(reserveButton);
                buyFrame.add(cardLabel);
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
                } else {
                    get2Coin.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == get2Coin) {

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
                                        
                                            if (player1.turn) player1.blackCount += 2;
                                            else player2.blackCount += 2;

                                            blackLabel.setText("BLACK: " + blackCount);

                                            blackState = false;
                                            
                                        } else if (whiteState) {

                                            whiteCount -= 2;
                                        
                                            if (player1.turn) player1.whiteCount += 2;
                                            else player2.whiteCount += 2;

                                            whiteLabel.setText("WHITE: " + whiteCount);

                                            whiteState = false;

                                        } else if (blueState) {

                                            blueCount -= 2;
                                        
                                            if (player1.turn) player1.blueCount += 2;
                                            else player2.blueCount += 2;

                                            blueLabel.setText("BLUE: " + blueCount);

                                            blueState = false;

                                        } else if (redState) {

                                            redCount -= 2;
                                        
                                            if (player1.turn) player1.redCount += 2;
                                            else player2.redCount += 2;

                                            redLabel.setText("RED: " + redCount);

                                            redState = false;

                                        } else if (greenState) {

                                            greenCount -= 2;
                                            
                                            if (player1.turn) player1.greenCount += 2;
                                            else player2.greenCount += 2;

                                            greenLabel.setText("GREEN: " + greenCount);

                                            greenState = false;

                                        }

                                        twoCoinFrame.dispose();
                                        
                                    }
                                });

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
                        }
                    });
                }

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

}

