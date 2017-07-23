class breakcontinue
{
	public static void main(String args[])
	{
		int i;
		/*for( i=1;i<=10;i++)
		{	
			System.out.println("hello"+i);
			if(i==5)
			break;
			System.out.println("Welcome"+i);
		}
		System.out.println("done"+i);*/
		for( i=1;i<=10;i++)
		{	
			System.out.println("hello"+i);
			if(i==5)
			continue;
			System.out.println("Welcome"+i);
		}
		System.out.println("done"+i);
		
		
	}
}