import java.util.Scanner;

public class  IT24103675Lab3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total bill amount: ");
        double totalBill = input.nextDouble();

        // Calculate the discount amount
        double discouAmou = totalBill * 0.1;

        // Calculate the final amount after discount
        double finalAmou = totalBill - discouAmou;

        System.out.println("Discount amount is = Rs" + discouAmou);
        System.out.println("Final amount after discount is = Rs" + finalAmou);
    }
}