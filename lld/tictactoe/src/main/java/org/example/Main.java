package org.example;

import org.example.model.Player;
import org.example.service.GameBoard;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Tic-Tac-Toe!");

        Player player1 = new Player(1, 'X', "Alice");
        Player player2 = new Player(2, 'O', "Bob");
        Player[] players = new Player[]{player1, player2};
        GameBoard gameBoard = new GameBoard(3, players);
        gameBoard.startGame();
    }
}