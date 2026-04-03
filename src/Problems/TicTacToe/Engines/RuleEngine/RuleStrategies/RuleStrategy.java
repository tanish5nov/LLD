package Problems.TicTacToe.Engines.RuleEngine.RuleStrategies;

import Problems.TicTacToe.Board.Board;
import Problems.TicTacToe.Move.Move;
import Problems.TicTacToe.Players.Player;

public interface RuleStrategy {
    public boolean validate(Move move, Player player, Board board);
}
