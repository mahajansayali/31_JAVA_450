import java.util.*;
class Copy
{
	String name;
	int age;
	void Copy()
	{
	Scanner sc=new Scanner(System.in);
	name=sc.nextLine();
	age=sc.nextInt();
	}	
}
class CopyConstructor
{
	public static void main(String args[])
	{
		Copy c1=new Copy();
		c1.Copy();
	}
}