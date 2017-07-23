
//Functions
//1. call by value for function without arguments
/*class function
{
	void show()
	{
		System.out.println("Show Function");
	}
	public static void main(String args[]) 
	{
		function obj=new function();   // creation of object of class function
		obj.show();
		obj.disp();
	}
	void disp()
	{
		System.out.println("Disp Function");
	}
}
*/

//2. call by value for function with arguments
/*class function
{
	void show(int a)
	{
		a=a+100;
		System.out.println("the value of a is:"+a);
	}
	public static void main(String args[]) 
	{
		function obj=new function();   // creation of object of class function
		int num=10;
		obj.show(num);
		System.out.println("the value of num is "+num);
		
	}
	
}
*/
//3. To return value from function

/*class function
{
	int sum (int n1,int n2)
	{
		int s=n1+n2;
		return s;
	}
	public static void main(String args[]) 
	{
		int num1=10;
		int num2=10;
		function obj=new function();
		int result=obj.sum(num1,num2);
		System.out.println("The result is "+result);
		System.out.println("The result is "+obj.sum(20,30));
	}
	
}
*/

//4. Call by reference
/*class function
{
	void show (int ar[])
	{
		ar[3]=100;
	}
	public static void main(String args[]) 
	{
		int a[]={10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		function obj=new function();
		obj.show(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}
*/

//5. Recursive function  to print 5 to 1 natural numbers 

/*class function
{
	void show(int num)
	{
		if(num>5)
			return;
		else
		{
			show(num+1);
			System.out.println(num);
		}
	}
	public static void main(String args[]) 
	{
		
		function obj=new function();
		obj.show(1);
	}
	
}
*/
//6. Find factorial of a number using recursion
import java.io.*;
class function
{
	int fact (int n1)
	{
		if((n1==0)||(n1==1))
			return 1;
		else
		{
			return n1*fact(n1-1);
		}
	}
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println(" Enter the number");
		int num=Integer.parseInt(br.readLine());
		function obj=new function();
		System.out.println("the factorial is "+obj.fact(num));
		
	}
	
}




















































































