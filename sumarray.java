
//WAP to find sum and average of n elements entered by user in an array using command line arguments
class sumarray
{
	public static void main(String args[])
	{
		int ar[]=new int[args.length];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=Integer.parseInt(args[i]);
		}
		int sum=0,avg;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		avg=sum/ar.length;
		System.out.println("The sum is :"+sum);
		System.out.println("The average is :"+avg);
		
		
		
			
	}
}