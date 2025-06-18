package model.gamestate;

public class InProgressState implements GameState{
    @Override
    public boolean isGameOver() {
        return false;
    }
}
