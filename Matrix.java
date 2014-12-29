public class Matrix 
	{ 
		private int [] [] myArray;
        int MatrixDimension1;
        int MatrixDimension2;

		public Matrix ( int x, int y) 
			{
                MatrixDimension1 = x;
                MatrixDimension2 = y;
				myArray = new int [MatrixDimension1][MatrixDimension2];
				for (int i = 0; i < MatrixDimension1; i++)
					{ 
						for (int k = 0; k < MatrixDimension2; k++)
							{ 
								myArray [i][k] = 1; 
							} 
					} 
			} 
		public void setElement (int dimension1, int dimension2, int newValue)
			{
				if ((dimension1<MatrixDimension1 ) && (dimension2<MatrixDimension2))
					{                                                 
						myArray [dimension1][dimension2] = newValue; 
					} 
			} 
		public void setRow (int myRowDimension, String myNewRowValues)
			{
                //check first that there are enough columns in matrix
                int count=0;
                int elementValue = 0;
                //count number of elements in the string
                for (int i = 0; i<myNewRowValues.length();i++)
                {
                    if (myNewRowValues.charAt(i)==',')
                    {
                        count = count +1;
                    }
                }
                if (myRowDimension<MatrixDimension1 && count+1 == MatrixDimension2)
                {
                   count = 0;
                    int previousSemicolonPosition=0;
                   for (int i = 0; i<myNewRowValues.length();i++)
                    {
                        if (myNewRowValues.charAt(i)==',')
                        {
                            elementValue = Integer.parseInt(myNewRowValues.substring(previousSemicolonPosition,i));
                            previousSemicolonPosition=i+1;
                            setElement(myRowDimension,count,elementValue);
                            count = count+1;
                        }
                        else if (i==myNewRowValues.length()-1)
                        {
                            elementValue = Integer.parseInt(myNewRowValues.substring(previousSemicolonPosition));
                            setElement(myRowDimension,count,elementValue);
                        }
                    }

                }
			} 
	}