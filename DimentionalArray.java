import java.util.*;
class DimentionalArray
{
	public static void main(String args[])
	{
		int a[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an element in an array");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("2x3 array is ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
} 