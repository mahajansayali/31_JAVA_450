interface A
{
	int getA(int a,int b);
}
interface B 
{
	int getB(int a,int b);
}
class InterfaceDemo implements A,B

{
	public int getA(int a,int b){
		return a + b;
	}
	public int getB(int a,int b){
		return a - b;
	}
	public static void main(String args[])
	{
		InterfaceDemo b= new InterfaceDemo();
		int result1=b.getA(30,25);
		int result2=b.getB(30,25);
		System.out.println("Interface A, Addition is: "+result1); 
		System.out.println("Interface B, Subtraction is: "+result2); 
	}
}