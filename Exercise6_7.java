import java.util.Scanner;
public class Exercise6_7 {
    public static void main(String[] args) {
        int myEmployeeID;
        String myEmployeeName;
        Scanner myScanner = new Scanner(System.in);
        EmployeeData myEmployeeData = new EmployeeData();
        System.out.println("Please enter employee ID");
        myEmployeeID = myScanner.nextInt();
        System.out.println("Please enter employee name");
        myEmployeeName = myScanner.nextLine();

        while(myEmployeeID!=0 && !myEmployeeName.equals(""))
        {
            myEmployeeData.addEmployeeData(myEmployeeID,myEmployeeName);
            System.out.println("Please enter next employee ID");
            myEmployeeID = myScanner.nextInt();
            System.out.println("Please enter next employee name");
            myEmployeeName = myScanner.nextLine();
        }
        myEmployeeData.printEmployees();
    }
}
