package chase.chessHelper;

import processing.core.PConstants;

public class Piece
{
	ChessHelper sketch;
	int col, row;

	Piece(ChessHelper sketch, int col, int row)
	{
		this.sketch = sketch;
		this.col = col;
		this.row = row;
	}

	void show()
	{
		sketch.fill(255, 0, 0);
		sketch.ellipseMode(PConstants.CENTER);
		sketch.circle(col * sketch.w + sketch.w / 2f, row * sketch.w + sketch.w / 2f, sketch.w / 2f);
	}
}
