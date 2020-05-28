import chase.chessHelper.ChessHelper;
import processing.core.PApplet;

public class Driver
{
	public static void main(String[] args)
	{
		ChessHelper sketch = new ChessHelper();
		String[] processingArgs = { "chase.chessHelper.ChessHelper.java" };
		PApplet.runSketch(processingArgs, sketch);
	}
}
