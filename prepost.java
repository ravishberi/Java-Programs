class prepost
{
	// program to see the o/P of pre and post operator
	public static void main (String args[])
	{	
		int a=2;
		int b=a++ + a++;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=2;
		b=++a + ++a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=2;
		b=a++ + ++a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
}