class labelbreak
{
	public static void main(String args[])
	{
		int i=4;
		/*aa:
		{
			System.out.println("first");
			if(i>3)
			{
				break aa;
			}
			System.out.println("second");
		}
		System.out.println("third");*/
		aa:
		{
			System.out.println("first");
			bb:
			{
				System.out.println("second");
				if(i>3)
					break aa;
				System.out.println("third");
			
			}
			
			System.out.println("fourth");
		}
		System.out.println("fifth");
		
		
		
	}
}