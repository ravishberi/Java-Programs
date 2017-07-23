

//Arrays
class positive
{
	public static void main(String args[])
	{
		int ar[]={10,-20,30,-40,-50};
		//print negative numbers
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
				System.out.println(ar[i]);
			
		}
		//print positive numbers
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>=0)
				System.out.println(ar[i]);
			
		}
		
			
	}
}