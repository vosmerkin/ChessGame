package figure;

import util.Cell;

import javax.swing.text.Position;
import java.util.List;

public class Rook extends Figure {
    @Override
    public List<Cell> getAvailableMoves(Cell currentCell) {
        return List.of();
    }
}