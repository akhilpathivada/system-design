package service;

import model.Dice;
import model.Entities;
import model.Player;

import java.util.HashMap;
import java.util.Map;

/**
 * Date 29/04/24
 * Time 08:37
 *
 * @author akhilpathivada
 */
public class SnakesAndLadders {

    private static final int MAX_VALUE_IN_DICE = 6;

    private final Entities entities;

    private final Dice dice;

    private final Map<String, Integer> playerToLatestPosition;

    public SnakesAndLadders() {
        this.entities = Entities.getInstance();
        this.dice = new Dice(MAX_VALUE_IN_DICE);
        this.playerToLatestPosition = new HashMap<>();
    }

    public String playGame() {
        intializePlayersStartValue();
        int i = 0;
        do {
            if (i > entities.getNumberOfPlayers()) { // players get turn in circular
                i = 0;
            }
            StringBuilder sb = new StringBuilder(); // to print output
            String playerName = entities.getPlayerName(i);
            int numberFromTheDice = dice.getNumberOfDice();
            sb.append(playerName).append(" rolled a dice value: ").append(numberFromTheDice);
            int endPosition = playerToLatestPosition.get(playerName) + numberFromTheDice;
            if (endPosition > 100) {
                continue;
            }
            if (entities.getSnakes().containsKey(endPosition)) { // captured a snake
                playerToLatestPosition.put(playerName, entities.getSnakes().get(endPosition));
            } else if (entities.getLadders().containsKey(endPosition)) { // captured a ladder
                playerToLatestPosition.put(playerName, entities.getLadders().get(endPosition));
            } else {
                playerToLatestPosition.put(playerName, endPosition);
            }
            // we can add more rules like:
            // if a player rolled got dice value 6 - they will get one more turn
        } while (!isPlayerWon(entities.getPlayerName(i)));
        return entities.getPlayerName(i);
    }

    private void intializePlayersStartValue() {
        for (int i = 0; i < entities.getNumberOfPlayers(); ++i) {
            playerToLatestPosition.put(entities.getPlayerName(i), 0);
        }
    }

    private boolean isPlayerWon(String player) {
        return playerToLatestPosition.get(player) == 100;
    }
}
