
public class Driver
{
	public static void main(String[] args)
	{
		verifyRandomValueGenerator();
		PartA();
		PartB();
	}
	
	private static void PartA()
	{
		System.out.println("\nPart A:");
		Data d = new Data(3, 3);
		d.repopulate();
		System.out.println("Grid:\n" + d);
	}

	private static void PartB()
	{
		System.out.println("\nPart B:");
		System.out.println("2 x 3 Grid:");
		Data d = new Data(2, 3);
		d.repopulate();
		System.out.print(d);
		int n = d.countIncreasingCols();
		System.out.println("Number of increasing columns = " + n);
		
		System.out.println("\n2 x 4 Grid:");
		d = new Data(2, 4);
		d.repopulate();
		System.out.print(d);
		n = d.countIncreasingCols();
		System.out.println("Number of increasing columns = " + n);	
		
		System.out.println("\n3 x 12 Grid:");
		d = new Data(3, 12);
		d.repopulate();
		System.out.print(d);
		n = d.countIncreasingCols();
		System.out.println("Number of increasing columns = " + n);
	}

	/**
	 * Pseudo-unit test of method getUsableRandomValue in the Data class.
	 */
	private static void verifyRandomValueGenerator()
	{
		System.out.println("verify random value generator works:");
		Data d = new Data(1, 1);
		for (int i = 0; i < 10; i++)
		{
			System.out.println(d.getUsableRandomValue());			
		}		
	}

}
