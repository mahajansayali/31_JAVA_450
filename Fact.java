import java.util.*;
class Fact
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		a=sc.nextInt();
		int sum=0;
		System.out.println("Factors : ");
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
				sum+=i;	
			}
		}
		System.out.println("Sum : "+sum);
	}
}