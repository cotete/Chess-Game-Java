package chess;

import boardgame.Piece;
import boardgame.board;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
