package chase.chessHelper.piece;

import chase.chessHelper.ChessHelper;
import chase.chessHelper.Color;
import processing.core.PConstants;

public class Piece
{
	ChessHelper sketch;
	Color color;
	int col, row;
	char symbol;

	public Piece(ChessHelper sketch, int col, int row, Color color, char symbol)
	{
		this.sketch = sketch;
		this.col = col;
		this.row = row;
		this.color = color;
		this.symbol = symbol;
	}

	public void show()
	{
		if(color == Color.White)
		{
			sketch.fill(255, 0, 0);
			sketch.stroke(0);
			sketch.text(symbol, col * sketch.w + sketch.w / 2f, row * sketch.w + sketch.w / 2f);
		}

		if(color == Color.Black)
		{
			sketch.fill(255, 0, 0);
			sketch.stroke(0);
			sketch.textSize(50);
			sketch.text(symbol, col * sketch.w + sketch.w / 2f, row * sketch.w + sketch.w / 2f);
		}
	}
}
