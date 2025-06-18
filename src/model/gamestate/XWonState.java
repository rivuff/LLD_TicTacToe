package model.gamestate;

public class XWonState implements GameState{
    @Override
    public boolean isGameOver() {
        return true;
    }
}
