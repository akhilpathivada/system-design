package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {

    private final int id;

    private final char symbol;

    private final String name;

    public Player(int id, char symbol, String name) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
    }
}
