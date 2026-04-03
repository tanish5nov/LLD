package Problems.TicTacToe.Engines.GameStateValidationEngine.ValidationStrategies;

import Problems.TicTacToe.Board.Board;
import Problems.TicTacToe.GameState.GameState;
import Problems.TicTacToe.Move.Move;
import Problems.TicTacToe.Players.Player;
import Problems.TicTacToe.Symbol.Symbol;

public class SimpleGameStateValidationStrategy implements GameStateValidationStrategy {
    @Override
    public GameState check(Player player, Board board, Move move) {
        // coordinates of cell with latest move
        int x = move.x;
        int y = move.y;

        // symbol put on latest move
        Symbol symbol = player.symbol;

        boolean horizontal = checkHorizontal(x, y, symbol, board);
        boolean vertical = checkVertical(x, y, symbol, board);
        boolean diagonal = checkDiagonal(x, y, symbol, board);

        boolean isGameEnded = horizontal || vertical || diagonal;

        return new GameState(player, isGameEnded);
    }

    private boolean checkHorizontal(int x, int y, Symbol symbol, Board board) {
        int count = 0;
        for(int j = 0; j < board.getM(); j++) {
            if(board.board[x][j].equals(symbol)) count += 1;
        }
        if(count == board.getM()) return true;
        return false;
    }

    private boolean checkVertical(int x, int y, Symbol symbol, Board board) {
        int count = 0;
        for(int i = 0; i < board.getN(); i++) {
            if(board.board[i][y].equals(symbol)) count += 1;
        }
        if(count == board.getN()) return true;
        return false;
    }

    private boolean checkDiagonal(int x, int y, Symbol symbol, Board board) {
        int X = x;
        int Y = y;

        int countDiagonal1 = 0;
        while(x >= 0 && y >= 0) {
            if(board.board[x][y].equals(symbol)) countDiagonal1 += 1;
            x--;
            y--;
        }

        x = X + 1;
        y = Y + 1;

        while(x < board.getN() && y < board.getM()) {
            if(board.board[x][y].equals(symbol)) countDiagonal1 += 1;
            x++;
            y++;
        }

        x = X;
        y = Y;

        int countDiagonal2 = 0;
        while(x >= 0 && y < board.getM()) {
            if(board.board[x][y].equals(symbol)) countDiagonal2 += 1;
            x--;
            y++;
        }

        x = X + 1;
        y = Y - 1;
        while(x < board.getN() && y >= 0) {
            if(board.board[x][y].equals(symbol)) countDiagonal2 += 1;
            x++;
            y--;
        }

        if(countDiagonal2 == board.getN() || countDiagonal1 == board.getM()) return true;
        return false;
    }
}
