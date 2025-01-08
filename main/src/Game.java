import util.Move;

import java.util.Collections;
import java.util.List;

public class Game {
    private Player[] players;
    private Board board;
    private List<Move> movesHistory;

    public Game(Player whitePlayer, Player blackPlayer, int timeLimitSeconds) {
        this.players = new Player[2];
        this.players[0] = whitePlayer;
        this.players[1] = blackPlayer;
        this.players[0].setTimeLimitSeconds(timeLimitSeconds);
        this.players[1].setTimeLimitSeconds(timeLimitSeconds);
        movesHistory = Collections.emptyList();

        board = new Board();
    }

    public void playGame() {
        //players make their moves
    }
}
