package chess;
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
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i< board.getRows(); i++){
            for(int j = 0; j< board.getRows(); j++){
                mat[i][j] = (ChessPiece) board.piece(i , j);

            }
        }
        return mat;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
        board.placePiece(new King(board, Color.WHITE), new Position(0, 4));
        board.placePiece(new Rook(board, Color.WHITE), new Position(0, 7));
}
}
