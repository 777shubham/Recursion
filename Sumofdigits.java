
import java.util.*;
class Sumofdigits
{
	
	
	public static int add(int n)
	{
		int sum2=n%10;
		if(n==0)
		{
			return 0;
		}
		else
		{
			return sum2+add(n/10);
		}
	}
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
     String s1=s.next();
	 char c[]=s1.toCharArray();
     
   String sum1="";
	int j=0;
	int count=0;
	for(int i=0;i<s1.length();i++)
	{
		if(Character.isDigit(c[i]))
		{
			Character c1=c[i];
			String add=c1.toString();
			sum1=sum1+add;
		
		}
	}
	int sum=Integer.parseInt(sum1);
	int c1=add(sum);
	System.out.println("Sum of digits in a String : "+c1);
	
   
  
        

    }
}
