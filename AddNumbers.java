import java.util.*;
class AddNumbers 
{
	public static void main(String[] args) 
	{
		int num1,num2;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first Number : ");
		num1=sc.nextInt();
		System.out.print("Enter second Number : ");
		num2=sc.nextInt();
		int sum=num1+num2;
        	System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
