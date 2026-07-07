package extraHomework_2;

import java.util.Random;

public class AI {
    private int iAI;
    private int jAI;
    private char letter;


    public void makeAITurn(){
        Random random = new Random();
        int i = random.nextInt(3);
        int j = random.nextInt(3);
       this.iAI = i;
       this.jAI = j;

    }
    public int getiAI() {
        return iAI;
    }
    public int getjAI() {
        return jAI;
    }
    public void setLetter(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }
}
