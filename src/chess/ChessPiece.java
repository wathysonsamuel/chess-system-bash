package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

import javax.swing.*;
import java.io.PipedOutputStream;

public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected boolean isThereOponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return  p != null && p.getColor() != color;
    }


}
