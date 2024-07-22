import java.util.Scanner;
class SimpleInterest
{
    	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
		int principal;
		int rate;
		int time;
		int simpleInterest;

		System.out.print("Enter the principal amount: ");
        	principal = scanner.nextInt();
	        System.out.print("Enter the annual interest rate: ");
        	rate = scanner.nextInt();
		System.out.print("Enter the time period : ");
        	time = scanner.nextInt();
		simpleInterest = (principal * rate * time) / 100;

       
        	System.out.println("Simple Interest: " + simpleInterest);

        	
    }
}
