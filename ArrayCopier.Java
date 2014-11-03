public class ArrayCopier
	{
		public ArrayCopier ()
			{
			}
		public void copy (int [] mySourceArray, int [] myDestinationArray)
			{
				int myCount;
				initializeToZero (myDestinationArray);
				if (mySourceArray.length <= myDestinationArray.length)
					{
						myCount = mySourceArray.length;
					}
				else
					{
						myCount = myDestinationArray.length;
					}

				for (int i = 0; i < myCount; i++)
					{
						myDestinationArray [i] = mySourceArray [i];

					}

					//print out the array
					myCount = myDestinationArray.length;
					for (int i = 0; i < myCount; i++)
						{
							System.out.println(myDestinationArray [i]);
						}
					System.out.println("                    ");
			}
		private void initializeToZero ( int [] myArray)
			{
				int myArrayLength = myArray.length;
				for (int i = 0; i<myArrayLength; i++)
				myArray [i] = 0;
			}
	}