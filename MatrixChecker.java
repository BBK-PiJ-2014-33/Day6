
public class MatrixChecker
{
    public boolean isSymmetrical(int [] myArray)
    {
        Boolean checkResult = true;
        int myArrayLength = myArray.length/2;

        for ( int i = 0; i<myArrayLength; i++)
        {
            if(myArray[i]!=myArray[myArray.length-i-1])
            {
                checkResult=false;
            }
        }
        return checkResult;
    }
}
