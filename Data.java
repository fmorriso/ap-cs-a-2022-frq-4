import java.util.Arrays;

public class Data
{
	public static final int MAX = 2000;
	private int[][] grid;

	@SuppressWarnings("unused")
	private Data()
	{
		/* prevent uninitalized instances */}

	public Data(int rows, int cols)
	{
		grid = new int[rows][cols];
	}

	public void repopulate()
	{
		for (int r = 0; r < grid.length; r++)
		{
			for (int c = 0; c < grid[r].length; c++)
			{
				grid[r][c] = getUsableRandomValue();
			}
		}
	}

	/**
	 * Returns a usable random value that meats
	 * 
	 * @return
	 */
	public int getUsableRandomValue()
	{
		final int MIN = 1, RANGE = MAX - MIN + 1;
		int val = 0;
		while (val < MIN || val % 10 != 0 || val % 100 == 0)
		{
			val = (int) (Math.random() * RANGE) + MIN;
		}
		return val;
	}

	@Override
	public String toString()
	{
		String retval = "";

		for (int[] row : grid)
		{
			retval += Arrays.toString(row) + "\n";
		}

		return retval;
	}

	public int countIncreasingCols()	
	{
		int n = 0;
		for(int c = 0; c < grid[0].length; c++)
		{
			int prev = 0, current;
			boolean isIncreasing = true;
			for(int r = 0; r < grid.length && isIncreasing; r++)
			{
				current = grid[r][c];
				if(current < prev)
				{
					// not increasing, so skip to next column
					// by short-circuiting the inner loop
					isIncreasing = false;
				}
				else
				{
					prev = current;
				}
			}
			if(isIncreasing) n++;
		}
		return n;
	}
}
