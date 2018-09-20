
import java.util.*;
class power
{
	public static int Power(int a,int b)
	{
		if(b!=0)
		{
			return a*Power(a,b-1);
		}
		else
			return 1;
	}
	public static void main(String ars[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a");
		int a=s.nextInt();
			System.out.println("Enter b");
		int b=s.nextInt();
		int c=Power(a,b);
		System.out.println(a+"power"+b+" = "+c);
		
		
	}
}
