class bitwis
{
	// program to see the o/P of bitwise operator
	public static void main (String args[])
	{	
		int a=5,b=3,c;
		c=a&b;
		System.out.println("after biwise and c="+c);
		c=a|b;
		System.out.println("after biwise or c="+c);
		c=a^b;
		System.out.println("after biwise XOR c="+c);
		c=a>>1;
		System.out.println("after bitwise right shift c="+c);
		c=a<<1;
		System.out.println("after biwise left shift c="+c);
		
		
	}
}