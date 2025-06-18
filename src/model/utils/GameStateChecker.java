package model.utils;

import model.board.Board;
import model.board.Cell;
import model.gamestate.*;
import model.helper.Status;
import model.helper.Symbol;

public class GameStateChecker implements StatusChecker{
    GameState gameState;

    public GameStateChecker(){
        this.gameState = new InProgressState();
    }
    @Override
    public Status checkStatus(Board board) {
        Cell[][] cells = board.getBoard();
        int n = cells.length;

        // Check rows
        for (int i = 0; i < n; i++) {
            if (cells[i][0].hasPiece()) {
                Symbol symbol = cells[i][0].getPiece();
                boolean win = true;
                for (int j = 1; j < n; j++) {
                    if (!cells[i][j].hasPiece() || cells[i][j].getPiece() != symbol) {
                        win = false;
                        break;
                    }
                }
                if (win) {
                    if(symbol == Symbol.O) {
                        gameState = new OWonState();
                        return Status.OWON;
                    }
                    else {
                        gameState = new XWonState();
                        return Status.XWON;
                    }
                }
            }
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            if (cells[0][j].hasPiece()) {
                Symbol symbol = cells[0][j].getPiece();
                boolean win = true;
                for (int i = 1; i < n; i++) {
                    if (!cells[i][j].hasPiece() || cells[i][j].getPiece() != symbol) {
                        win = false;
                        break;
                    }
                }
                if (win) {
                    if(symbol == Symbol.O) {
                        gameState = new OWonState();
                        return Status.OWON;
                    }
                    else {
                        gameState = new XWonState();
                        return Status.XWON;
                    }
                }
            }
        }

        // Check main diagonal
        if (cells[0][0].hasPiece()) {
            Symbol symbol = cells[0][0].getPiece();
            boolean win = true;
            for (int i = 1; i < n; i++) {
                if (!cells[i][i].hasPiece() || cells[i][i].getPiece() != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                if(symbol == Symbol.O) {
                    gameState = new OWonState();
                    return Status.OWON;
                }
                else {
                    gameState = new XWonState();
                    return Status.XWON;
                }
            }
        }

        // Check anti-diagonal
        if (cells[0][n - 1].hasPiece()) {
            Symbol symbol = cells[0][n - 1].getPiece();
            boolean win = true;
            for (int i = 1; i < n; i++) {
                if (!cells[i][n - 1 - i].hasPiece() || cells[i][n - 1 - i].getPiece() != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                if(symbol == Symbol.O) {return Status.OWON;}
                else return Status.XWON;
            }
        }

        for(Cell[] cell : cells){
            for(Cell c : cell){
                if(!c.hasPiece()){
                    gameState = new InProgressState();
                    return Status.PROGRESS;
                }
            }
        }

        gameState = new DrawState();
        return Status.DRAW;
    }

    @Override
    public boolean getGameState(){
        return this.gameState.isGameOver();
    }
}
