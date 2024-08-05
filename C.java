import java.util.*;
class A
{
	String name;
	int age;
	void getData()
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter name : ");
	name=sc.next();
	System.out.print("Enter name : ");
	age=sc.nextInt();
	}
}
class B extends A
{
	void display()
	{
		System.out.print("Name : "+name+" Age : "+age);
	}
}
class C
{
	public static void main(String args[])
	{
		B a=new B();
		a.getData();
		a.display();
	}
}