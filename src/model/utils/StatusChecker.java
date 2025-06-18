package model.utils;

import model.board.Board;
import model.helper.Status;

public interface StatusChecker {
    public Status checkStatus(Board board);

    public boolean getGameState();
}
