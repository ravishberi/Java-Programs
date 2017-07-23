class powerr 
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int pw=1;
		System.out.println("The power of number : is ");
		for(int i=1;i<=b;i++)
		{
			pw=pw*a;

		}
		System.out.print(pw);

	}
}