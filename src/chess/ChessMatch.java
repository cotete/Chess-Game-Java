package chess;
import boardgame.Piece;
import boardgame.Position;
import boardgame.board;
import chess.pieces.*;

public class ChessMatch {
    private board board;
    private int turn;

    public ChessMatch() {
        board = new board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getRows(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);

            }
        }
        return mat;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('a', 8, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.WHITE));
        placeNewPiece('h', 8, new Rook(board, Color.WHITE));
    }

    public ChessPiece performChessMove(ChessPosition soucePosition, ChessPosition targetPosition) {
        Position source = soucePosition.toPosition();
        Position target = targetPosition.toPosition();
        validateSourcePosition(source);
        Piece capturedPiece = makeMove(source, target);
        return (ChessPiece) capturedPiece;
    }

    private void validateSourcePosition(Position position) {
        if (!board.thereIsAPiece(position)) {
            throw new ChessException("there is no piece on source position");
        }
    }

    private Piece makeMove(Position source, Position target){
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p, target);
        return capturedPiece;
    }
}
