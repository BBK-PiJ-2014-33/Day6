
public class MatrixChecker
{
    public boolean isSymmetrical(int [] myArray)
    {
        Boolean checkResult = true;

        for ( int i = 0; i<myArray.length/2; i++)
        {
            if(myArray[i]!=myArray[myArray.length-i-1])
            {
                checkResult=false;
            }
        }
        return checkResult;
    }

    public boolean isSymmetrical (int [][] myArray)
    {
        Boolean checkResult = true;

        for(int i =0; i<myArray.length; i++)
        {
            for (int n = 0; n < myArray[0].length; n++)
            {
                if(myArray[i][n]!=myArray[n][i])
                {
                    checkResult=false;
                }
            }
        }

        return  checkResult;
    }
}
