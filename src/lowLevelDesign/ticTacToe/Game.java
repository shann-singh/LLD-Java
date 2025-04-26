package lowLevelDesign.ticTacToe;

public class Game {

    Game() {
        initializeGame();
    }

    private void initializeGame() {
        Player player1 = new Player("Player 1", new PlayingPieceX());
        Player player2 = new Player("Player 2", new PlayingPieceO());
        Board board = new Board(3);
        board.printBoard();
    }
}
