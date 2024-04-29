import model.Entities;
import service.SnakesAndLadders;

import java.util.Scanner;

/**
 * Date 29/04/24
 * Time 08:19
 *
 * @author akhilpathivada
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Snakes and Ladders!");

        Scanner scanner = new Scanner(System.in);
        Entities entities = Entities.getInstance();

        System.out.println("enter no. of snakes");
        int numberOfSnakes = scanner.nextInt();
        while (numberOfSnakes-- > 0) {
            int startPosition = scanner.nextInt();
            int endPosition = scanner.nextInt();
            entities.setSnake(startPosition, endPosition);
        }

        System.out.println("enter no. of ladders");
        int numberOfLadders = scanner.nextInt();
        while (numberOfLadders-- > 0) {
            int startPosition = scanner.nextInt();
            int endPosition = scanner.nextInt();
            entities.setLadder(startPosition, endPosition);
        }

        System.out.println("enter no. of players");
        int numberOfPlayers = scanner.nextInt();
        for (int i = 0; i < numberOfPlayers; ++i) {
            String playerName = scanner.next();
            entities.setPlayer(i, playerName);
        }

        // let's play the game
        SnakesAndLadders snakesAndLadders = new SnakesAndLadders();
        System.out.println("winner is: " + snakesAndLadders.playGame());
    }
}