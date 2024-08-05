import java.util.*;
class Array1
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int flag=0;
		int ch;
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in array");
		for(int j=0;j<a.length;j++){
			a[j]=sc.nextInt();
}
		System.out.println("Enter a number to search an array");
		ch=sc.nextInt();
		for(int i=0;i<a.length-1;i++)
		{
			if(ch==a[i])
			{
				flag=1;
				break;	
			}
		
		}
		if(flag==1)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Error");
		}
	}

}










