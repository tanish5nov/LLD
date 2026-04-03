package Problems.TicTacToe.Move;

import Problems.TicTacToe.Board.Board;
import Problems.TicTacToe.Players.Player;

public class Move {
    public Player player;
    public int x;
    public int y;
    public Move(Player player, int x, int y) {
        this.player = player;
        this.x = x;
        this.y = y;
    }

    public void apply(Board board) {
        board.board[x][y] = player.symbol;
    }
}
