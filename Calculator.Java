public class Calculator
{
	public Calculator ()
		{
		}


	public void add (int myFirstVariable, int mySecondVariable)
		{
			int myResult = myFirstVariable + mySecondVariable;
			System.out.println("Result of adding " + myFirstVariable + " and " +  mySecondVariable + " is " + myResult);
		}

	public void subtract (int myFirstVariable, int mySecondVariable)
		{
			int myResult = myFirstVariable - mySecondVariable;
			System.out.println("Result of subtracting " + mySecondVariable + " from " +  myFirstVariable + " is " + myResult);
		}

	public void multiply (int myFirstVariable, int mySecondVariable)
		{
			int myResult = myFirstVariable * mySecondVariable;
			System.out.println("Result of multipying " + myFirstVariable + " and " +  mySecondVariable + " is " + myResult);
		}

	public void divide (int myFirstVariable, int mySecondVariable)
		{
			double myResult = (double) myFirstVariable / (double) mySecondVariable;
			System.out.println("Result of dividing " + myFirstVariable + " by " +  mySecondVariable + " is " + myResult);
		}

	public void modulus (int myFirstVariable, int mySecondVariable)
		{
			int myResult = myFirstVariable % mySecondVariable;
			System.out.println("Remainder of dividing " + myFirstVariable + " by " +  mySecondVariable + " is " + myResult);
		}
}