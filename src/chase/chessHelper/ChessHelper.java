package chase.chessHelper;

import processing.core.PApplet;
import processing.core.PFont;

public class ChessHelper extends PApplet
{
	public Board board;
	public Player white;
	public Player black;

	public int w = 100;
	public int outlineW = 50;

	PFont myFont;

	@Override
	public void settings()
	{
		size(w * 8 + outlineW * 2, w * 8 + outlineW * 2);
	}

	@Override
	public void setup()
	{
		background(30);

		board = new Board(this);
		white = new Player(this, Color.White);
		black = new Player(this, Color.Black);

		drawBorder();
	}

	@Override
	public void draw()
	{
		translate(outlineW, outlineW);
		board.show();
	}

	void drawBorder()
	{
		textAlign(CENTER, CENTER);
		textSize(24);

		for(int i = 0; i < 8; i++)
		{
			text((char)(i + 'A'), i * w + outlineW + w / 2f, outlineW / 2f);
			text((char)(i + 'A'), i * w + outlineW + w / 2f, height - outlineW / 2f);
		}

		for(int i = 1; i < 9; i++)
		{
			text((char)(i + '0'), outlineW / 2f, (i - 1) * w + outlineW + w / 2f);
			text((char)(i + '0'), width - outlineW / 2f, (i - 1) * w + outlineW + w / 2f);
		}
	}
}
