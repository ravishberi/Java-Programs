


//Arrays
class array
{
	public static void main(String args[])
	{
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		int b[]={10,20,30};
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		ar=b;  // assigning b's address to reference variable ar
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
			
	}
}