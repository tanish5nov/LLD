package Problems.TicTacToe.Players;

import Problems.TicTacToe.Symbol.Symbol;

public class Player {
    public String ID;
    public Symbol symbol;
    public Player(String ID, Symbol symbol) {
        this.ID = ID;
        this.symbol = symbol;
    }
}