import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    static ImageIcon gameIcon = new ImageIcon("Amusement_Park.png");
    ImageIcon wood = new ImageIcon("wood.png");
    Font myFont = new Font("MV Boli", Font.BOLD, 30);
    
    GamePanel(int playerCount) {

        //setPreferredSize(new Dimension(500, 500));

    }

    public boolean endGame() {

        return false;
    }

    public void paint(Graphics g) {
        
        g.drawImage(wood.getImage(), 0, 0, null);
        
        // Player1
        g.setColor(Color.blue);
        g.fillRect(0, 0, getWidth(), 100);
        
        // Player2
        g.setColor(Color.red);
        g.fillRect(0, getHeight() - 100, getWidth(), 100);
        
        // Player3
        g.setColor(Color.magenta);
        g.fillRect(0, 0, 100, getHeight() - 100);
        
        // Player4
        g.setColor(Color.orange);
        g.fillRect(getWidth() - 100, 100, 100, getHeight());



    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Amusement Park");
                frame.setIconImage(gameIcon.getImage());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setContentPane(new GamePanel(2));
                frame.setVisible(true);
            }
        });
    }

}

class BoardPanel extends JPanel {

    BoardPanel() {
        
    }
}

class Player {

    static final int MAX_COIN_NUMBER = 100;
    static final int MAX_CARD_NUMBER = 100;

    int score = 0;
    int playerCode;
    int reservation = 0;
    boolean canReserve = false;
    Coins[] coins = new Coins[MAX_COIN_NUMBER];
    Cards[] cards = new Cards[MAX_CARD_NUMBER];

    Player() {

        for (int i = 0; i < MAX_COIN_NUMBER; i++) {
            coins[i] = new Coins();
        }

    }
}

class Coins {

    int type;
    int value;
    String color;
    ImageIcon imageCoin;

    Coins() {

    }

    Coins(int type) {

    }
}

class Cards {

    static final int MAX_TYPE_COIN = 10;

    int type;
    int specialValue;
    String color;
    Coins[] price = new Coins[MAX_TYPE_COIN];
    ImageIcon imageIcon;

    Cards() {


    }
}