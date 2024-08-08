interface expression
{
	public void calculate(int a, int b);
}
class LamdaExp
{
	public static void main(String args[])
	{
		expression lb=(a,b)-> System.out.println(a+b);
		lb.calculate(4,7);
	}
}