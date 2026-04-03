package Problems.TicTacToe;

import Problems.TicTacToe.Engines.GameEngine.GameEngine;

public class GameDemo {
    public static void main(String[] args) {
        GameEngine.registerSymbol("X");
        GameEngine.registerSymbol("O");
        GameEngine.registerBoard(3);
        GameEngine.registerPlayer("TANISH");
        GameEngine.registerPlayer("INTERVIEWER");
        GameEngine.startGame();
    }
}
