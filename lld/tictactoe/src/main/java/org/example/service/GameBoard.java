package org.example.service;

import org.example.model.Cell;
import org.example.model.Player;

import java.util.*;

public class GameBoard {

    private final int boardSize;

    private final char[][] board;

    private final Queue<Player> nextTurn;

    private final Scanner scanner;

    public GameBoard(int boardSize, Player[] players) {
        this.boardSize = boardSize;
        this.board = new char[boardSize][boardSize];
        this.nextTurn = new LinkedList<>();
        this.scanner = new Scanner(System.in);
        Collections.addAll(nextTurn, players);
    }

    private int getPlayerInput(Player player) {
        int value = scanner.nextInt();
        while (!isValidInput(value)) {
            System.out.println("wrong position to place, please enter correct input: ");
            value = scanner.nextInt();
        }
        return value;
    }

    private boolean isValidInput(int value) {
        if (value < 1 || value > (boardSize * boardSize)) {
            return false;
        }
        // or also check cell is occupied or not
        // ...
        return true;
    }

    private Cell positionToCell(int position) {
        return new Cell(0, 0);
    }

    private boolean checkEndGame(Player player, int row, int col) {
        // based on the inputs and the latest move
        // check row-wise, col-wise, diag-wise
        // ...
        return true;
    }

    public void startGame() {
        int movesCount = 0;
        while (true) {
            if (movesCount == (boardSize * boardSize) + 1) {
                System.out.printf("match draw");
                break;
            }
            Player player = nextTurn.poll();
            int position = getPlayerInput(player);
            // get row and col based on the position
            Cell cell = positionToCell(position);
            int row = cell.getRow();
            int col = cell.getCol();
            board[row][col] = player.getSymbol();
            System.out.printf("board after the move: " + Arrays.deepToString(board));
            if (movesCount >= boardSize && checkEndGame(player, row, col)) {
                break;
            }
            nextTurn.offer(player);
        }
    }
}
