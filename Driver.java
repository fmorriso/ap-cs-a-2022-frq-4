
public class Driver
{
	public static void main(String[] args)
	{
		verifyRandomValueGenerator();
		PartA();
		
	}

	private static void PartA()
	{
		Data d = new Data(2, 3);
		d.repopulate();
		System.out.println(d);
		
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
