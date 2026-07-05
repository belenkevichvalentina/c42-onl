package extraHomework_2;

import java.util.Random;

public class People {
    private int iPeople;
    private int jPeople;
    private char leater;

    public void makePeopleTurn() {
        Random random = new Random();
        int i = random.nextInt(3);
        int j = random.nextInt(3);
        this.iPeople = i;
        this.jPeople = j;
    }

    public int getiPeople() {
        return iPeople;
    }

    public int getjPeople() {
        return jPeople;
    }

    public void setiPeople(int iPeople) {
        this.iPeople = iPeople;
    }

    public void setjPeople(int jPeople) {
        this.jPeople = jPeople;
    }

    public void setLeater(char leater) {
        this.leater = leater;
    }

    public char getLeater() {
        return leater;
    }
}
