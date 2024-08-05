import java.util.*;
class Array2
{
	public static void main(String args[])
	{
		int a[]=new int[7];
		int flag=0; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an element in an array");
		for(int j=0;j<a.length;j++)
		{
			a[j]=sc.nextInt();
		}
		System.out.println("Enter a number to search an array");
		int n=sc.nextInt();
		for(int i=0;i<a.length-1;i++)
		{
			if(n==a[i])
			{
				flag++;
			}
		}
		System.out.println("Number Occurs "+flag+" times");
	}
}