package lowLevelDesign.ticTacToe;

public class PlayingPiece {
    private PieceType pieceType;

    PlayingPiece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }
}
