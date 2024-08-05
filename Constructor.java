import java.util.*;
class Constructor
{
	String name;
	int age;
	public Constructor()
	{
		this.name="sonu";
		this.age=20;
	}	
	public Constructor(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void dis()
	{
		System.out.println("Name : "+name+" and age : "+age);
	}


	public static void main(String args[])
	{
		Constructor c1=new Constructor();
		c1.dis();
		Constructor c2=new Constructor("shraddha",2);
		c2.dis();
	}
}