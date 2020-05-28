package chase.chessHelper.piece;

import chase.chessHelper.ChessHelper;
import chase.chessHelper.Color;

public class Pawn extends Piece
{
	public Pawn(ChessHelper sketch, int col, int row, Color color)
	{
		super(sketch, col, row, color, 'P');
	}
}
