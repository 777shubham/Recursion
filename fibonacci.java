import java.util.*;
class fibonacci
{
	public static int count=0;
	public static int fibb(int a,int b,final int n)
	{
		
		int c=0;
	
		
		if(count == n)
			return 0;
		else
		{
			c = a+b;
			System.out.print(a + " ");
			a=b;
			b=c;
			count++;
			
			return fibb(a,b,n);
		}
			
		
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=0;
		int b=1;
		System.out.println("Enter n : ");
		int n =s.nextInt();
		//System.out.print(a + " ");
		//System.out.print(b + " ");
		if(n>0)
		{
	     fibb(a,b,n);
		}
		else
		{
			System.out.println("Not possible Fibonacci Series ");
		}
		
	}
}