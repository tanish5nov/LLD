package Problems.TicTacToe.Engines.GameStateValidationEngine;

import Problems.TicTacToe.Board.Board;
import Problems.TicTacToe.Engines.GameStateValidationEngine.ValidationStrategies.GameStateValidationStrategy;
import Problems.TicTacToe.Engines.GameStateValidationEngine.ValidationStrategies.SimpleGameStateValidationStrategy;
import Problems.TicTacToe.GameState.GameState;
import Problems.TicTacToe.Move.Move;
import Problems.TicTacToe.Players.Player;

public class GameStateValidationEngine {
    private GameStateValidationStrategy gameStateValidationStrategy;
    private static GameStateValidationEngine gameStateValidationEngine = null;

    private GameStateValidationEngine(){}

    public static GameStateValidationEngine getInstance() {
        if(gameStateValidationEngine == null) {
            gameStateValidationEngine = new GameStateValidationEngine();
            gameStateValidationEngine.gameStateValidationStrategy = new SimpleGameStateValidationStrategy();
        }
        return gameStateValidationEngine;
    }

    public GameState getGamestate(Player player, Board board, Move move) {
        return this.gameStateValidationStrategy.check(player, board, move);
    }

}
