package model.gamestate;

public class DrawState implements GameState{
    @Override
    public boolean isGameOver() {
        return true;
    }
}
