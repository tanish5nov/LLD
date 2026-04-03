package Problems.TicTacToe.Engines.GameStateValidationEngine.ValidationStrategies;

import Problems.TicTacToe.Board.Board;
import Problems.TicTacToe.GameState.GameState;
import Problems.TicTacToe.Move.Move;
import Problems.TicTacToe.Players.Player;

public interface GameStateValidationStrategy {
    public GameState check(Player player, Board board, Move move);
}
