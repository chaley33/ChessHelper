package chase.chessHelper;

public class Node
{
	ChessHelper sketch;
	int col, row;
	Piece piece;

	Node(ChessHelper sketch, int col, int row)
	{
		this.sketch = sketch;
		this.col = col;
		this.row = row;
		this.piece = null;
	}

	void show()
	{
		if(col % 2 == 0 && row % 2 == 0)
			sketch.fill(235);
		else if(col % 2 == 0 && row % 2 == 1)
			sketch.fill(15);
		else if(col % 2 == 1 && row % 2 == 0)
			sketch.fill(15);
		else if(col % 2 == 1 && row % 2 == 1)
			sketch.fill(235);

		sketch.square(col * sketch.w, row * sketch.w, sketch.w);

		if(piece != null)
			piece.show();
	}
}
