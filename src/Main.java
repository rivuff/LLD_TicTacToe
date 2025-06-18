import model.board.Board;
import model.player.HumanPlayer;
import model.player.Player;
import service.GameService;

public class Main {
    public static void main(String[] args) {

        GameService service = new GameService();

        service.intGame(3);

        service.addPlayer("Rivu", 'O');
        service.addPlayer("Pratik", 'X');

        service.startGame();
    }
}