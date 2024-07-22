class SwapNo1
{
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		System.out.println("Before Swapping the value of a : "+a);
		System.out.println("Before Swapping the value of b : "+b);
    		b=b+a;
    		a=b-a;
    		b=b-a;
    		System.out.println("After Swapping the value of a : "+a);
		System.out.println("After Swapping the value of b : "+b);
	}
}