package chess;
import boardgame.board;

public class ChessMatch {
    private board board;
    private int turn;

    public ChessMatch() {
        board = new board(8, 8);
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
}
