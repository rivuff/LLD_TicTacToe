package model.board;

import model.helper.Symbol;

import java.util.Optional;

public class Cell {
    int row;
    int col;

    Optional<Symbol> piece;

    public Cell(int row, int col){
        this.row = row;
        this.col= col;
        this.piece = Optional.empty();
    }

    public boolean hasPiece(){
        return piece.isPresent();
    }

    public void setPiece(Symbol piece){
        this.piece = Optional.of(piece);
    }

    public Symbol getPiece(){
        return piece.get();
    }
}
