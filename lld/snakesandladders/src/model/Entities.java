package model;

import java.util.HashMap;
import java.util.Map;

/**
 * Date 29/04/24
 * Time 08:24
 *
 * @author akhilpathivada
 */
public class Entities {

    public static Entities instance = null;

    public static Map<Integer, Integer> snakes;

    public static Map<Integer, Integer> ladders;

    public static Map<Integer, Player> players;

    public Entities() {
        snakes = new HashMap<>();
        ladders = new HashMap<>();
        players = new HashMap<>();
    }

    public static Entities getInstance() {
        if (instance == null) {
            return new Entities();
        }
        return instance;
    }

    public void setSnake(int startPosition, int endPosition) {
        snakes.put(startPosition, endPosition);
    }

    public void setLadder(int startPosition, int endPosition) {
        ladders.put(startPosition, endPosition);
    }

    public void setPlayer(int id, String name) {
        players.put(id, new Player(id, name));
    }

    public Map<Integer, Integer> getSnakes() {
        return snakes;
    }

    public Map<Integer, Integer> getLadders() {
        return ladders;
    }

    public String getPlayerName(int id) {
        return players.get(id).getName();
    }

    public int getNumberOfPlayers() {
        return players.size();
    }
}
