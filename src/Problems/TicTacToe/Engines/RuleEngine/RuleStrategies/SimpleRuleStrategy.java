package Problems.TicTacToe.Engines.RuleEngine.RuleStrategies;

import Problems.TicTacToe.Board.Board;
import Problems.TicTacToe.Move.Move;
import Problems.TicTacToe.Players.Player;
import Problems.TicTacToe.Symbol.Symbol;

public class SimpleRuleStrategy implements RuleStrategy{
    public SimpleRuleStrategy(){

    }

    @Override
    public boolean validate(Move move, Player player, Board board) {
        int n = board.getN();
        int m = board.getM();

        int moveX = move.x;
        int moveY = move.y;

        // trying to go out of bounds
        if(moveX >= n || moveY >= m || moveY < 0 || moveX < 0) return false;

        // trying to put in occupied cell
        Symbol empty = new Symbol(" ");
        if(!board.board[moveX][moveY].equals(empty)) return false;

        return true;
    }
}
