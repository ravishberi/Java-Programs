//Sum of indiviual digits of 4 digit number
class digitsum
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int num=a;
		int sum=0;
		while(a>0)
		{
			num=a%10;
			a=a/10;
			sum=sum+num;
		}
		System.out.println("sum of two numbers is: "+sum);
	}
}