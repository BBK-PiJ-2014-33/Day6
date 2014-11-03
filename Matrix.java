public class Matrix 
	{ 
		private int [] [] myArray; 
		public Matrix ( int x, int y) 
			{ 
				myArray = new int [x][y]; 
				for (int i = 0; i < x; i++) 
					{ 
						for (int k = 0; k < y; k++) 
							{ 
								myArray [i][k] = 1; 
							} 
					} 
			} 
		public setElement (int dimension1, int dimension2, int newValue) 
			{
				if ((dimension1<x ) && (dimension2<y)) 
					{                                                 
						myArray [dimension1][dimension2] = newValue; 
					} 
			} 
		public setRow (int myRowDimension, String myNewRowValues) 
			{ 
			} 
	}