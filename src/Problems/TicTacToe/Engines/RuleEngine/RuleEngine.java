package Problems.TicTacToe.Engines.RuleEngine;

import Problems.TicTacToe.Board.Board;
import Problems.TicTacToe.Engines.RuleEngine.RuleStrategies.RuleStrategy;
import Problems.TicTacToe.Engines.RuleEngine.RuleStrategies.SimpleRuleStrategy;
import Problems.TicTacToe.Move.Move;
import Problems.TicTacToe.Players.Player;

public class RuleEngine {
    private RuleStrategy ruleStrategy;
    private static RuleEngine ruleEngine = null;
    private RuleEngine(){};

    public static RuleEngine getInstance() {
        if(ruleEngine == null) {
            ruleEngine = new RuleEngine();
            ruleEngine.ruleStrategy = new SimpleRuleStrategy();
        }
        return ruleEngine;
    }

    public boolean validate(Move move, Player player, Board board) {
        return this.ruleStrategy.validate(move, player, board);
    }

    public void changeStrategy(RuleStrategy ruleStrategy) {
        this.ruleStrategy = ruleStrategy;
    }
}
