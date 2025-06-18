package model.player;

import model.board.Board;
import model.helper.Symbol;

import java.util.Scanner;

public class HumanPlayer extends Player{

    Board board;
    public HumanPlayer(String name, Symbol symbol, Board board) {
        super(name, symbol);
        this.board = board;
    }

    public Board getBoard(){
        return this.board;
    }

    @Override
    public void makeMove() {
        this.board.displayBoard();

        Scanner scr = new Scanner(System.in);

        System.out.println("Select row");
        int row = scr.nextInt();

        System.out.println("Select column");
        int col = scr.nextInt();

        board.setPiece(this, row, col);
    }
}
