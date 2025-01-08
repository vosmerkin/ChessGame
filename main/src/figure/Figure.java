package figure;


import util.Cell;
import util.Color;

import java.util.List;

public abstract class Figure {
    private Color color;
    private boolean isCaptured;

    public abstract List<Cell> getAvailableMoves(Cell currentCell);
}
