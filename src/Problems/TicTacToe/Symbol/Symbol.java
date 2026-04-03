package Problems.TicTacToe.Symbol;

public class Symbol {
    public String symbol;
    public Symbol(String symbol) {
        this.symbol = symbol;
    }
    @Override
    public boolean equals(Object other) {
        Symbol symbol1 = (Symbol) other;
        return symbol1.symbol.equals(this.symbol);
    }

    @Override
    public String toString() {
        return this.symbol;
    }
}
