/*
Q6.* Take as input str, a string. Write a recursive function which returns a new string in which all duplicate consecutive characters are reduced to a single char. 
E.g. for hello return helo. Print the value returned.
*/

import java.util.Scanner;
class unique
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter your string : ");
		String str = sc.nextLine();
		int len = str.length();
		System.out.println("After removing consecutive duplicates " + fun(str,len));
		
	}
	
	public static int i=0;
	 public static String s2 = "";//initialize at beginning only assign memory once
	public static String fun(String str,int len)
	{
		
		// String s2 = "";when fun calls, s2 reinitialize as "" and output will be ""always.
	
		if(i == len || len == 0)
			return s2;
		else if(i == 0)
			s2 += str.charAt(i);
		else if(str.charAt(i-1) != str.charAt(i))
		{
			s2=s2+ str.charAt(i);
		}
		
			i++;
		return fun(str,len);
	}
}
