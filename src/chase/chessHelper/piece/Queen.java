package chase.chessHelper.piece;

import chase.chessHelper.ChessHelper;
import chase.chessHelper.Color;

public class Queen extends Piece
{
	public Queen(ChessHelper sketch, int col, int row, Color color)
	{
		super(sketch, col, row, color, 'Q');
	}
}
