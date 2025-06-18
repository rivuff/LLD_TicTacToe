package service;

import model.board.Board;
import model.helper.Status;
import model.helper.Symbol;
import model.player.HumanPlayer;
import model.player.Player;
import utils.GameStateChecker;
import utils.StatusChecker;

import java.util.LinkedList;
import java.util.Queue;

public class GameService {
    Board board;
    Queue<Player> players;

    StatusChecker checker;
    public GameService(){
        this.players = new LinkedList<>();
    }
    public Board intGame(int n){
        this.board = new Board(n);
        this.checker = new GameStateChecker();
        return board;
    }


    public void addPlayer(String name, char symbol){
        if(players.size()==2){
            throw new IllegalArgumentException("No more than two players are allowed");
        }
        Player player;
        if(symbol == 'O'){
            player = new HumanPlayer(name, Symbol.O, board);
        }else {
            player = new HumanPlayer(name, Symbol.X, board);
        }
        players.add(player);
    }


    public void startGame(){
        do{
            Player p = players.poll();

            p.makeMove();

           Status st =  checker.checkStatus(board);
            System.out.println(st.toString());
            System.out.println(checker.getGameState());
            players.add(p);
        }while(!checker.getGameState());
    }

    public void displayBoard(){
        board.displayBoard();
    }
}
