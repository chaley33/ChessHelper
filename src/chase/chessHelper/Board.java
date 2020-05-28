package chase.chessHelper;

public class Board
{
	ChessHelper sketch;
	Node[][] nodes;

	Board(ChessHelper sketch)
	{
		this.sketch = sketch;

		createNodes();
	}

	public void createNodes()
	{
		nodes = new Node[8][8];

		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				nodes[i][j] = new Node(sketch, i, j);
			}
		}
	}

	void show()
	{
		for(Node[] nodeA : nodes)
		{
			for(Node node : nodeA)
				node.show();
		}
	}
}
