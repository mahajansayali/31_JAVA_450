import java.util.*;
class DimentionalArraySum2
{
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an element in an array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("3x3 array is ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for (int i=0;i<3;i++)
		{
			int Rowsum=0;
			for(int j=0;j<3;j++)
			{
				Rowsum=Rowsum+a[i][j];
			}
			System.out.println("sum "+Rowsum);
		}
		for (int j=0;j<3;j++)
		{
			int sumcol=0;
			for(int i=0;i<3;i++)
			{
				sumcol=sumcol+a[i][j];
			}
			System.out.println("sum "+sumcol);
		}
	}
	
} 