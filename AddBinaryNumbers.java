public class AddBinaryNumbers 
{
    	public static void main(String[] args) 
	{
        	String binary1 = "1010";
        	String binary2 = "1101";
        
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        
        int sum = num1 + num2;

       
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("The sum of " + binary1 + " and " + binary2 + " is: " + binarySum);
    }
}
