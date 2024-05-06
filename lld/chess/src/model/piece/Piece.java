package model.piece;

import model.CellPosition;
import model.Color;

import java.util.List;

public abstract class Piece {

    Color color;

    boolean move(CellPosition from, CellPosition to) {

    }

    List<CellPosition> possibleMoves() {

    }


}
