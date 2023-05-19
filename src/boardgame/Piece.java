package boardgame;

public class Piece {
    protected Position position;
    private board Board;

    protected board getBoard() {
        return Board;
    }
    public Piece(board board) {
        Board = board;
    }
}
