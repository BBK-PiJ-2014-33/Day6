public class Exercise6_5 {
    public static void main(String[] args)
    {
        MatrixChecker myMatrixChecker = new MatrixChecker();
        int [] myTestArray1 = {1,2,2,1};
        int [] myTestArray2 = {1,2,3,2,1};
        int [] myTestArray3 = {1,2,3,4};

        System.out.println(myMatrixChecker.isSymmetrical(myTestArray1));
        System.out.println(myMatrixChecker.isSymmetrical(myTestArray2));
        System.out.println(myMatrixChecker.isSymmetrical(myTestArray3));

    }
}
