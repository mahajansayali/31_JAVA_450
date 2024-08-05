import java.util.*;
class Add100
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		int sum=0;
		
		System.out.println("Enter number");
		
		while(sum<100)
		{
			a=sc.nextInt();
			sum+=a;
			
		}
	
	System.out.println("DONE!");

System.out.println(sum);
	}
}