import java.util.*;
interface std
{
	public void display()
{
}
}
class c
{
	String name;
	int age;
}
class c1 extends c
{
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Name : ");
		name=sc.next();
		System.out.println("Age : ");
		age=sc.nextInt();
		
	}	
}
class c2 extends c1 implements std
{
	public void display()
	{
		System.out.println("Name : "+name+" Age : "+age);
	}
	public static void main(String args[])
	{
		
		c2 a= new c2();
		a.get();
		a.display();
	}
}