//NESTING OF LOOPS
//PYRAMIDS

/*
1.  
****
****
****
****

class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)   //for rows
		{
			for(int j=1;j<=4;j++) // for columns
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
*/

/*
2. 
*
**
***
****


class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
*/

/*
3. 
1
22
333
4444



class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}
*/

/*
4. 
1
12
123
1234

class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
*/
/*
5. 
****
***
**
*

class pyramid
{
	public static void main(String args[])
	{
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
*/

/*
6. 
1234
123
12
1

class pyramid
{
	public static void main(String args[])
	{
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
*/

/*
7.
4444
333
22
1

class pyramid
{
	public static void main(String args[])
	{
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}
*/

/*
8. 
    *
   **
  ***
 ****
*****

class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)   // for rows
		{
			for (int k=1;k<=5-i;k++)   // for spaces
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++)  // for columns
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
*/
/*
9.
    *
   * *
  * * *
 * * * *
* * * * *

class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)   // for rows
		{
			for (int k=1;k<=5-i;k++)   // for spaces
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++)  // for columns
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
*/
/*
10.
    *
   ***
  *****
 *******
*********

class pyramid
{
	public static void main(String args[]) throws Exception    // throws Exception is used because Thread.sleep(time in milliseconds) throws an exception
	{
		for(int i=1;i<=5;i++)   // for rows
		{
			for (int k=1;k<=5-i;k++)   // for spaces
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i-1;j++)  // for columns
			{
				System.out.print("*");
				Thread.sleep(1000);
			}
			System.out.println();
		}
		
	}
}
*/
/*
11.
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

class pyramid
{
	public static void main(String args[]) throws Exception    // throws Exception is used because Thread.sleep(time in milliseconds) throws an exception
	{
		//1. for triangle
		for(int i=1;i<=5;i++)   // for rows
		{
			for (int k=1;k<=5-i;k++)   // for spaces
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i-1;j++)  // for columns
			{
				System.out.print("*");
				Thread.sleep(100);
			}
			System.out.println();
		}
		
		//2. for inverted triangle
		for(int i=4;i>=1;i--)   // for rows
		{
			for (int k=1;k<=5-i;k++)   // for spaces
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i-1;j++)  // for columns
			{
				System.out.print("*");
				Thread.sleep(100);
			}
			System.out.println();
		}
		
	}
}
































































































































































































































































