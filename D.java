import java.util.*;
class A
{
	String name;
	String clg;
	int RollNo;
}
class B extends A
{
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Name : ");
		name=sc.next();
		System.out.println("College : ");
		clg=sc.next();
		System.out.println("Roll Number : ");
		RollNo=sc.nextInt();
	}
}
class C extends B
{
	void display()
	{
		System.out.println("Name : "+name+" College : "+clg+" RollNo : "+RollNo);
	}
}
class D
{
	public static void main(String args[])
	{
		C c=new C();
		c.get();
		c.display();
	}
}