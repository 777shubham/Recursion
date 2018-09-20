
import java.util.Scanner;
class array
{
	private int arr[],size;
	
	array(int size)
	{
		this.size = size;
		arr = new int[size];
	}
	
	public void insertVals(Scanner sc)
	{
		System.out.println("Enter elements of array");
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
	}
	
	public void displayArray()
	{
		
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public void reverse(int index)
	{
		if(index < (size/2))
		{
			int temp = arr[index];
			arr[index] = arr[size-index-1];
			arr[size-index-1] = temp;
			
			reverse(++index);
		}
		else
			return;
	}
}
class reverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int N = sc.nextInt();
		if(N > 0)
		{
			array a = new array(N);
			a.insertVals(sc);
			a.displayArray();
			System.out.print("After Reversing the array\n");
			
			a.reverse(0);
			a.displayArray();
		}
		System.out.println();
		sc.close();
	}
}