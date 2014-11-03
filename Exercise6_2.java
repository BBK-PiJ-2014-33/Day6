import java.util.Scanner;
public class Exercise6_2
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{


ArrayCopier myArrayCopier = new ArrayCopier();



int [] mySourceArray = {1, 2, 3, 4, 5};

int [] mySameLengthDestinationArray = new int [5];

int [] myLongerDestinationArray = new int [7];

int [] myShorterDestinationArray = new int [3];





myArrayCopier.copy(mySourceArray, mySameLengthDestinationArray);

myArrayCopier.copy(mySourceArray, myLongerDestinationArray);

myArrayCopier.copy(mySourceArray, myShorterDestinationArray);

}}

