package Problems.TicTacToe.Engines.GameEngine;

import Problems.TicTacToe.Board.Board;
import Problems.TicTacToe.Engines.GameStateValidationEngine.GameStateValidationEngine;
import Problems.TicTacToe.Engines.RuleEngine.RuleEngine;
import Problems.TicTacToe.GameState.GameState;
import Problems.TicTacToe.Move.Move;
import Problems.TicTacToe.Players.Player;
import Problems.TicTacToe.Symbol.Symbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class GameEngine {
    private static List<Symbol> symbols = new ArrayList<>();
    private static Board board = null;
    private static List<Player> players = new ArrayList<>();
    private static int lastAssignedSymbol = -1;

    public static void registerSymbol(String value) {
        Symbol symbol = new Symbol(value);
        symbols.add(symbol);
    }

    public static void registerBoard(int n) {
        board = new Board(n, n);
    }

    public static void registerPlayer(String ID) {
        if(lastAssignedSymbol + 1 >= symbols.size()) {
            throw new RuntimeException("NOT ENOUGH SYMBOLS AVAILABLE");
        }
        lastAssignedSymbol += 1;
        Symbol symbolToBeAssigned = symbols.get(lastAssignedSymbol);

        Player player = new Player(ID, symbolToBeAssigned);
        players.add(player);
    }

    public static void startGame() {
        // there should be atleast two players
        // board should be initialised

        if(board == null) {
            throw new RuntimeException("Board is not initializes");
        }

        if(players.size() < 2) {
            throw new RuntimeException("Not enough players");
        }

        play();
    }

    private static void play() {
        int currentPlayerTurn = 0;
        while(true) {
            Player player = players.get(currentPlayerTurn);
            Scanner scanner = new Scanner(in);

            board.render();

            System.out.println("Player: " + player.ID + ", Please tell what cell you want to make a move: ");
            System.out.println("X: ");
            int x = scanner.nextInt();
            System.out.println("Y: ");
            int y = scanner.nextInt();

            Move move = new Move(player, x, y);
            boolean moveIsValid = RuleEngine.getInstance().validate(move, player, board);

            if(!moveIsValid) {
                System.out.println("This move is not valid, please try another");
            }
            else {
                move.apply(board);
                GameState gameState = GameStateValidationEngine.getInstance().getGamestate(player, board, move);
                if(gameState.gameIsEnded()) {
                    System.out.println("The game is Ended and the winner is: " + gameState.getWinner().ID);
                    break;
                }
                currentPlayerTurn = (currentPlayerTurn + 1) % players.size();
            }
        }
    }
}
