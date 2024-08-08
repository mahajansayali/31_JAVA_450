import java.util.*;
class Emp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int basicSalary;
		String name;
		int withdrawl;
		int finalAmount;

		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Basic Salary : ");
		basicSalary = sc.nextInt();
		System.out.println("Enter Withdrawl Amount : ");
		withdrawl = sc.nextInt();
		finalAmount=basicSalary-withdrawl;

		System.out.println("Name :  "+name);
		System.out.println("Basic Salary :  "+basicSalary);
		System.out.println("Name :  "+name);
		System.out.println("Final Amount: "+finalAmount);




	}
}