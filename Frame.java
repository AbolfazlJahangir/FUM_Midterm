import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {

    Player player1 = new Player(1);
    Player player2 = new Player(2);

    JLabel coinLabel = new JLabel();
    JLabel gameLabel = new JLabel();

    ImageIcon coin = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\coinIcon.png");
    ImageIcon background = new ImageIcon("C:\\Users\\pc\\Desktop\\FUM_Midterm_Project\\background.jpg");

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
    
    Frame() {
        player1.turn = true;
        player2.turn = false;

        gameLabel.setOpaque(true);
        gameLabel.setIcon(background);

        coinLabel.setIcon(coin);
        coinLabel.setOpaque(false);
        coinLabel.setBorder(null);
        coinLabel.setBounds(1300, 250, 200, 200);
        coinLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                JFrame coinFrame = new JFrame("Coins");
                JLabel cl = new JLabel();
                JLabel infoLabel = new JLabel("Pick your coins!");
                JLabel blackLabel = new JLabel("BLACK: " + blackCount);
                JLabel whiteLabel = new JLabel("WHITE: " + whiteCount);
                JLabel blueLabel = new JLabel("BLUE: " + blueCount);
                JLabel redLabel = new JLabel("RED: " + redCount);
                JLabel greenLabel = new JLabel("GREEN: " + greenCount);
                JLabel goldLabel = new JLabel();
                JButton addCoins = new JButton("Done!");

                cl.setOpaque(true);
                cl.setBounds(0, 0, 935, 400);
                cl.setBackground(Color.cyan);

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
                });

                white.setBounds(160, 60, 150, 150);
                white.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
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
                });

                blue.setBounds(310, 60, 150, 150);
                blue.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
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
                });

                red.setBounds(460, 60, 150, 150);
                red.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
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
                });

                green.setBounds(610, 60, 150, 150);
                green.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
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

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600, 850);

        add(gameLabel);

        setVisible(true);
    }

}

