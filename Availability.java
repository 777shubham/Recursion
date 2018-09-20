
import java.util.*;
class Availability
{
	public static int i=-1;
	public static int search(int a[],int k)
	{
		int l=a.length;
		i++;
		if(l<=i)
		{
			return -1;
		}
		if(a[i]==k)
		{
			return i;
		}
		return search(a,k);
	}
	public static void main(String ars[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" Elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter element you want to search");
		int k=s.nextInt();
		int c=search(a,k);
		if(c==-1)
		{
			System.out.println(k+" not found ");
		}
		else
		{
			System.out.println(k+" found at "+c);
		}
		
	}
}
