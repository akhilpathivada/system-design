package model;

import java.util.Random;

/**
 * Date 29/04/24
 * Time 08:20
 *
 * @author akhilpathivada
 */
public class Dice {

    private static int MIN = 1;

    private final int numberFromTheDice;

    private final Random random;

    public Dice(int numberFromTheDice) {
        this.numberFromTheDice = numberFromTheDice;
        this.random = new Random();
    }

    public int getNumberOfDice() {
        return random.nextInt((this.numberFromTheDice - MIN) + 1) + 1;
    }
}
