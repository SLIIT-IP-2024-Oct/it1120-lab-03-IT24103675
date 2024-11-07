import java.util.Scanner;

public class IT24103675Lab3Q1B{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Enter for the price per kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double priceOfKg = scanner.nextDouble();

        // Enter user for the number of kgs they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double numberOfKgs = scanner.nextDouble();

        // Solve the total amount to pay
        double totalAmount = priceOfKg * numberOfKgs;

        // Solve the discounted amount 
        double discount = totalAmount * 0.10;
        double discountedAmount = totalAmount - discount;

        // Display the total amount and the discounted amount
        System.out.println("The total amount before discount is: " +"Rs"+ totalAmount);
        System.out.println("After the dicount the amount what you have to pay:- " + "Rs"+discountedAmount);
    }
}
	