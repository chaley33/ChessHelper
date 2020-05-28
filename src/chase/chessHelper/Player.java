package chase.chessHelper;

import chase.chessHelper.piece.*;

import java.util.ArrayList;

public class Player
{
	ChessHelper sketch;
	Color color;
	ArrayList<Piece> pieces = new ArrayList<Piece>();

	Player(ChessHelper sketch, Color color)
	{
		this.sketch = sketch;
		this.color = color;
		initializePieces();
	}

	void initializePieces()
	{
		if(color == Color.White)
		{
			sketch.board.nodes[0][0].piece = new Rook(sketch, 0, 0, Color.White);
			sketch.board.nodes[1][0].piece = new Knight(sketch, 1, 0, Color.White);
			sketch.board.nodes[2][0].piece = new Bishop(sketch, 2, 0, Color.White);
			sketch.board.nodes[3][0].piece = new Queen(sketch, 3, 0, Color.White);
			sketch.board.nodes[4][0].piece = new King(sketch, 4, 0, Color.White);
			sketch.board.nodes[5][0].piece = new Bishop(sketch, 5, 0, Color.White);
			sketch.board.nodes[6][0].piece = new Knight(sketch, 6, 0, Color.White);
			sketch.board.nodes[7][0].piece = new Rook(sketch, 7, 0, Color.White);

			sketch.board.nodes[0][1].piece = new Pawn(sketch, 0, 1, Color.White);
			sketch.board.nodes[1][1].piece = new Pawn(sketch, 1, 1, Color.White);
			sketch.board.nodes[2][1].piece = new Pawn(sketch, 2, 1, Color.White);
			sketch.board.nodes[3][1].piece = new Pawn(sketch, 3, 1, Color.White);
			sketch.board.nodes[4][1].piece = new Pawn(sketch, 4, 1, Color.White);
			sketch.board.nodes[5][1].piece = new Pawn(sketch, 5, 1, Color.White);
			sketch.board.nodes[6][1].piece = new Pawn(sketch, 6, 1, Color.White);
			sketch.board.nodes[7][1].piece = new Pawn(sketch, 7, 1, Color.White);
		}
		else if(color == Color.Black)
		{
			sketch.board.nodes[0][7].piece = new Rook(sketch, 0, 7, Color.Black);
			sketch.board.nodes[1][7].piece = new Knight(sketch, 1, 7, Color.Black);
			sketch.board.nodes[2][7].piece = new Bishop(sketch, 2, 7, Color.Black);
			sketch.board.nodes[3][7].piece = new Queen(sketch, 3, 7, Color.Black);
			sketch.board.nodes[4][7].piece = new King(sketch, 4, 7, Color.Black);
			sketch.board.nodes[5][7].piece = new Bishop(sketch, 5, 7, Color.Black);
			sketch.board.nodes[6][7].piece = new Knight(sketch, 6, 7, Color.Black);
			sketch.board.nodes[7][7].piece = new Rook(sketch, 7, 7, Color.Black);

			sketch.board.nodes[0][6].piece = new Pawn(sketch, 0, 6, Color.Black);
			sketch.board.nodes[1][6].piece = new Pawn(sketch, 1, 6, Color.Black);
			sketch.board.nodes[2][6].piece = new Pawn(sketch, 2, 6, Color.Black);
			sketch.board.nodes[3][6].piece = new Pawn(sketch, 3, 6, Color.Black);
			sketch.board.nodes[4][6].piece = new Pawn(sketch, 4, 6, Color.Black);
			sketch.board.nodes[5][6].piece = new Pawn(sketch, 5, 6, Color.Black);
			sketch.board.nodes[6][6].piece = new Pawn(sketch, 6, 6, Color.Black);
			sketch.board.nodes[7][6].piece = new Pawn(sketch, 7, 6, Color.Black);
		}
	}
}
