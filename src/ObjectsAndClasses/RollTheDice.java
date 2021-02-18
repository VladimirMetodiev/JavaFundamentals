package ObjectsAndClasses;

import java.util.Random;

public class RollTheDice {
    public static void main(String[] args) {
        Dice myDice = new Dice();
        myDice.roll();
    }
}

class Dice{
    public int side;

    void roll(){
        Random rnd = new Random();
        int randomNumber = 0;
        while (randomNumber == 0) {
            randomNumber = rnd.nextInt(7);
        }
        System.out.println(randomNumber);
    }
}