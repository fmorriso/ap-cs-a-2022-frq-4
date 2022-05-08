
public class Data
{
	public static final int MAX = 100;
	private int[][] grid;	
	
	@SuppressWarnings("unused")
	private Data() {/* prevent uninitalized instances */}
	
	public Data(int rows, int cols)
	{
		grid = new int[rows][cols];
	}
}
