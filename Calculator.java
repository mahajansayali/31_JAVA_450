import java.util.*;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Number: " );
		int a=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b=sc.nextInt();

	System.out.println("Enter Your Choice  +  -  *  / ");
	String choice = sc.next();         
        int c = 0; 
	switch(choice)
	{
	case "+":
		c=a+b;
		System.out.println("Addition: "+c);
		break;
	case "-":
		c=a-b;
		System.out.println("Subtraction: "+c);
		break;
	case "*":
		c=a*b;
		System.out.println("Multiplication: "+c);
		break;
	case "/":
		c=a/b;
		System.out.println("Division: "+c);
		break;
	}
    }
}