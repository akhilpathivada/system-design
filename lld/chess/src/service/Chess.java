/**
 * author: akhilpathivada
 * time: 06/05/24 10:19
 */
package service;

import model.*;
import model.piece.Piece;

import java.util.List;

public class Chess {

    ChessBoard chessBoard;

    Player[] players;

    Player currentPlayer;

    List<Move> moves;

    GameStatus gameStatus;

    // piece: means horse, elephant ...
    public boolean playerMove(int fromPos, int toPos, Piece piece) {
        // once the logic is done...
        // ...
        chessBoard.updateBoard(new Move(currentPlayer, piece, killedPiece, new CellPosition(fromPos), new CellPosition(toPos)));
        // at the end
        changeTurn();
    }

    public boolean endGame() {

    }

    private void changeTurn() {

    }
}
