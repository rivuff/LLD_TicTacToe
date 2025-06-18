package model.board;

import model.player.Player;

import java.util.List;

public class Board {
    Cell[][] board;
    int nc;

    public Board( int nc){
        if(nc<3){
            throw new IllegalArgumentException("Board length should be greater than or equal to 3");
        }
        this.nc = nc;
        board = new Cell[nc][nc];
        for(int i =0;i<nc;i++){
            for(int j =0;j<nc;j++){
                board[i][j] = new Cell(i, j);
            }
        }
    }

    public Cell[][] getBoard(){
        return this.board;
    }

    public void displayBoard(){
        for(int i =0;i<nc;i++){
            for(int j =0;j<nc;j++){
                if(board[i][j].hasPiece()){
                    System.out.print(board[i][j].getPiece().toString()+"|");
                }else {
                    System.out.print("__|");
                }
            }

            System.out.println();
        }
    }

    public void setPiece(Player player, int row, int col){
        if(board[row][col].hasPiece() || row<0 || row>= nc || col<0 || col>=nc){
            throw new IllegalArgumentException("This move is illegal");
        }

        board[row][col].setPiece(player.getSymbol());
    }


}
