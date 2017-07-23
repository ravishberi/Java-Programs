// WAP to get two numbers from user and find their sum and average

import java.io.*;
/*

* means everything
In this case we can also write
import java.io.InputStreamreader;
import java.io.BufferedReader;
*/

class inputsum
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println(" Enter the number 1");
		int num1=Integer.parseInt(br.readLine());
		System.out.println(" Enter the number 2");
		int num2=Integer.parseInt(br.readLine());
		int sum,avg;
		sum=num1+num2;
		avg=sum/2;
		System.out.println("The sum is :"+sum);
		System.out.println("The average is :"+avg);
		
		
	}
}