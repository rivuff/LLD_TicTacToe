package model.gamestate;

public class OWonState implements GameState{

    @Override
    public boolean isGameOver() {
        return true;
    }
}
