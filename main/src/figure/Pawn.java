package figure;

import util.Cell;

import javax.swing.text.Position;
import java.util.List;

public class Pawn extends Figure {
    @Override
    public List<Cell> getAvailableMoves(Cell currentCell) {
        return List.of();
    }
}