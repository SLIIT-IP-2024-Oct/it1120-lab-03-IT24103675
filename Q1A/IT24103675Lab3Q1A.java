import java.util.Scanner;
public class IT24103675Lab3Q1A{
public static void main(String[] args){
Scanner scanner= new Scanner(System.in);
//Enter the price of a 1kg of rice
System.out.println("Enter the price of 1kg of rice:-");
double priceOfrice = scanner.nextDouble();	
System.out.println("The Price of a 1kg is "+priceOfrice+"kg");
//Enter the amount the 1kg of rice
System.out.println("Enter the amount of the 1kg of rice:-");
double amouOfrice= scanner.nextDouble();
//Make equation to get the total amount of the rice
double TotAmount = amouOfrice*priceOfrice;
//Command to print the value of the rice
System.out.println("The Total amount is = "+"Rs"+TotAmount);
}
} 
