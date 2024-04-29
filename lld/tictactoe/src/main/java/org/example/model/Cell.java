package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cell {

    private final int row;

    private final int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
