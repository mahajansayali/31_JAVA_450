import java.util.Scanner;
class Cal
{
	double length,width,area,side;
	Scanner obj=new Scanner(System.in);
	void get_length()
	{
		System.out.println("Enter the length");
		length=obj.nextDouble();
	}
	void get_width()
	{
		System.out.println("Enter the width");
		width=obj.nextDouble();
	}
	void get_side()
	{
		System.out.println("Enter the side");
		side=obj.nextDouble();
	}
	void find_area()
	{
		area=length*width;
		System.out.println("area is: "+area);
	}
	void find_area_sqr()
	{
		area=side*side;
		System.out.println("area is: "+area);
	}
}
class Exp3
{
	public static void main(String[] args)
	{
		Cal r1= new Cal();
		r1.get_length();
		r1.get_width();
		r1.find_area();
		Cal s1= new Cal();
		s1.get_side();
		s1.find_area_sqr();

	}
}
