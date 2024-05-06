package model;

public abstract class Board {

    Cell[][] board;

    public Board(int size) {
        this.board = new Cell[size][size];
    }

    abstract void fillBoardIntially();

    abstract void resetBoard();

    abstract void updateBoard(Move move);
}
