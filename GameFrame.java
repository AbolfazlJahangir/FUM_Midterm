import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    ImageIcon splendorIcon = new ImageIcon("splendor.jpg");
    ImageIcon wood = new ImageIcon("wood.png");
    JLabel backgroundLabel = new JLabel(wood);
    Font myFont = new Font("MV Boli", Font.BOLD, 30);
    JPanel playerPanel1 = new JPanel();
    JPanel playerPanel2 = new JPanel();
    JPanel playerPanel3 = new JPanel();
    JPanel playerPanel4 = new JPanel();
    
    GameFrame() {

        playerPanel1.setBackground(Color.red);
        playerPanel2.setBackground(Color.gray);
        playerPanel3.setBackground(Color.blue);
        playerPanel4.setBackground(Color.green);

        this.setTitle("Splendor");
        this.setIconImage(splendorIcon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setUndecorated(true);
        this.setResizable(false);
        this.getContentPane().add(backgroundLabel);

        this.add(playerPanel1, BorderLayout.NORTH);
        this.add(playerPanel2, BorderLayout.SOUTH);
        this.add(playerPanel3, BorderLayout.EAST);
        this.add(playerPanel4, BorderLayout.WEST);

        this.setVisible(true);
    }

}
