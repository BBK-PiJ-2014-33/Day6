import java.util.Scanner;
public class Exercise6_1
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
Calculator myCalculator = new Calculator();



myCalculator.add(1,2);

myCalculator.subtract(2,1);

myCalculator.multiply(3,2);

myCalculator.divide(3,2);

myCalculator.modulus(3,2);
}}

