class factorial 
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		System.out.println("The factorial  of number : "+a+" is ");
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
					
		}
		System.out.println(fact);
	}
}