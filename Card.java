import java.awt.event.*;
import javax.swing.*;

public class Card extends JLabel implements MouseListener {

    final static int COUNT_COIN_PRICE = 4;

    ImageIcon cardIcon;
    int score;
    String specialCoin;
    String price;
    
    public Card(String address, String specialCoin, int score) {

        this.cardIcon = new ImageIcon(address);
        setCardIcon(cardIcon);
        this.specialCoin = specialCoin;
        this.score = score;

    }

    public Card() {
        
    }

    public void setCardIcon(ImageIcon cardIcon) {
        this.cardIcon = cardIcon;
    }
    public ImageIcon getCardIcon() {
        return cardIcon;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }


    @Override
    public void mousePressed(MouseEvent e) { }


    @Override
    public void mouseReleased(MouseEvent e) { }


    @Override
    public void mouseEntered(MouseEvent e) { }


    @Override
    public void mouseExited(MouseEvent e) { }


}
