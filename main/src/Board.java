import util.Cell;
import util.GameEnding;

public class Board {

    private Cell[][] cells;


    public Board() {
        cells = new Cell[8][8];
        setToInitialPositions();
    }

    void setToInitialPositions() {

    }

    boolean validateMove() {
        return true;
    }

    ;


    GameEnding checkForGameEnding() {
        return null;
    }
}
