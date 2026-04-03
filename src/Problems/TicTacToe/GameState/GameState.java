package Problems.TicTacToe.GameState;

import Problems.TicTacToe.Players.Player;

public class GameState {
    private Player winner;
    private Boolean isGameWon;

    public GameState(Player player, Boolean isGameWon) {
        this.isGameWon = isGameWon;
        if(isGameWon) this.winner = player;
        else this.winner = null;
    }

    public Boolean gameIsEnded() {
        return this.isGameWon;
    }

    public Player getWinner() {
        return this.winner;
    }
}
