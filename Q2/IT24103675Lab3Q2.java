import java.util.Scanner;
public class IT24103675Lab3Q2{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Amount of salary:");
    double amount = input.nextDouble();
    System.out.println("The amount of the salary is: "+amount);
    System.out.println("Enter the OT hours: ");
    double OThours = input.nextDouble();
    System.out.println("The OT hours: "+OThours);
    double OTrate =input.nextDouble();
    System.out.println("The Ot rate: "+OTrate);

    double OT_Salary = (OThours*OTrate);
    double Tot_Salary = (amount + OT_Salary);
    System.out.println("The total salary is; "+Tot_Salary);
}
}
