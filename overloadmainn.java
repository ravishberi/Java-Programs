 class overloadmain
{
	public static void main(String args[])
	{
	     System.out.println("HELLO USER");
	     main();
	     main(5);	
	}
	public static void main()
	{
	     System.out.println("Hi");
	}
	public static void main(int a)
	{
	     System.out.println("the value of a is :"+a);
	}
}