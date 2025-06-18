package model.player;

import model.helper.Symbol;

public abstract class Player {

    String name;
    Symbol symbol;

    public Player(String name, Symbol symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public Symbol getSymbol(){
        return this.symbol;
    }

    public abstract void makeMove();
}
