

// How to receive I/P from user at run time

import java.io.*;
/*

* means everything
In this case we can also write
import java.io.InputStreamreader;
import java.io.BufferedReader;
*/

class inputfromuser
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println(" Enter the name");
		String name=br.readLine();
		System.out.println("The name is :"+name);
		
		
	}
}