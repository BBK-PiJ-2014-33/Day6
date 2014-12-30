public class Exercise6_5 {
    public static void main(String[] args)
    {
        MatrixChecker myMatrixChecker = new MatrixChecker();

        //test isSymmetrical with two dimensional array
        int [] [] myTestArray4 =new int[][]{
                {1,2,3},
                {2,4,5},
                {3,5,1}
        };

        int [] [] myTestArray5 =new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(myMatrixChecker.isSymmetrical(myTestArray4));
        System.out.println(myMatrixChecker.isSymmetrical(myTestArray5));

        //test isSymmetrical with one dimensional array
        int [] myTestArray1 = {1,2,2,1};
        int [] myTestArray2 = {1,2,3,2,1};
        int [] myTestArray3 = {1,2,3,4};

        System.out.println(myMatrixChecker.isSymmetrical(myTestArray1));
        System.out.println(myMatrixChecker.isSymmetrical(myTestArray2));
        System.out.println(myMatrixChecker.isSymmetrical(myTestArray3));



    }
}
