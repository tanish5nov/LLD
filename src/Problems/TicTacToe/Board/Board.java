package Problems.TicTacToe.Board;

import Problems.TicTacToe.Symbol.Symbol;

public class Board {
    public Symbol[][] board;
    private int n;
    private int m;

    public Board(int n, int m) {
        this.n = n;
        this.m = m;
        board = new Symbol[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                this.board[i][j] = new Symbol(" ");
            }
        }
    }

    public void render() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == null) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(board[i][j].symbol);
                }
                if (j != m - 1) System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }
}
