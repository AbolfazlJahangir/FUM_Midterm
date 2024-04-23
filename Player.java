public class Player {

    int codePlayer;
    String name;
    int blackCount = 0, whiteCount = 0, blueCount = 0, redCount = 0, greenCount = 0, goldCount = 0;
    int specialBlack = 0, specialWhite = 0, specialBlue = 0, specialRed = 0, specialGreen = 0;
    int score = 0;
    boolean turn;
    
    Player(int codePlayer) {
        this.codePlayer = codePlayer;
        
    }
}
