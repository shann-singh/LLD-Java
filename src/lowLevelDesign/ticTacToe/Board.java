package lowLevelDesign.ticTacToe;

public class Board {

    private int size;

    private PlayingPiece[][] board;

    private int cellCount;

    Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
        this.cellCount = size * size;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            System.out.print("|");
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(board[i][j].getPieceType());
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public boolean placePiece(int row, int col, PlayingPiece playingPiece) {
        if (board[row][col] != null) {
            return false;
        }
        board[row][col] = playingPiece;
        cellCount--;
        return true;
    }

    public boolean areCellsFree() {
        return this.cellCount > 0;
    }
}
