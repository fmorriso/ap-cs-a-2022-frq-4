
public class Driver
{
	public static void main(String[] args)
	{
		verifyRandomValueGenerator();
		PartA();
		PartB();
	}

	private static void PartB()
	{
		Data d = new Data(2, 3);
		d.repopulate();
		System.out.println("Grid:\n" + d);
		int n = d.countIncreasingCols();
		System.out.println("\nNumber of increasing columns = " + n);
		
	}

	private static void PartA()
	{
		Data d = new Data(3, 3);
		d.repopulate();
		System.out.println("Grid:\n" + d);
		
	}

	/**
	 * Pseudo-unit test of method getUsableRandomValue in the Data class.
	 */
	private static void verifyRandomValueGenerator()
	{
		Data d = new Data(1, 1);
		for (int i = 0; i < 10; i++)
		{
			System.out.println(d.getUsableRandomValue());
			
		}		
	}

}
