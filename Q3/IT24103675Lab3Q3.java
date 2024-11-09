import java.util.Scanner;

public class IT24103675Lab3Q3{
public static void main(String[] args){
	//Declare and Initialize  variables
	int amount = 2754;
	int count5000 =0;
	int count1000 =0;
	int count500 =0;
	int count200 =0;
	int count100 =0;
	int count50  =0;
    int count20  =0;
    int count10  =0;
    int count5   =0;
    int count2   =0;
    int count1   =0;

         //Create a Scanner object to read input 
    Scanner input = new Scanner(System.in);

        // Input the rupee amount
    System.out.print("Enter the Rupee amount: ");
    amount = input.nextInt(); // if amount entered is 2754
	   //Calculate the number of 5000 rupee notes
	   count5000 = amount/5000; //count5000 =0(2754/5000 =0)
	   amount = amount%5000; //amount = 2754(In modulus operation if Dividend;
	                        // [2754] Divisor [5000], tehn remainder is the orginal dividend number)//
       //Calculate the number of 1000 rupee notess
	   count1000 = amount/1000; // count1000 = 2(2754/1000 =2.754 =>2)
	   amount = amount%1000; //amount =745(2754%1000=resinder =.754)
	                      //How the amount variables isupdated to 754 no longer 2754
		count500 = amount/500;
                amount = amount%500;

	        count200 = amount/200;
	        amount = amount%200;
     
	        count100 = amount/100;
		amount =amount%100;
		
		count50 = amount/50;
		amount = amount%50;
		
		count20 = amount/20;
		amount =  amount%20;
		
		count10 = amount/10;
		amount = amount%10;
		
		count5 = amount/5;
		amount = amount%5;
		
		count2 = amount/2;
		amount = amount%2;
		
		count1 = amount/1;
		amount = amount%1;
		// Print the calculated notes and coins
        System.out.println("\nNumber of Notes and Coins:");
        System.out.println("5000 Notes : " + count5000);
        System.out.println("1000 Notes : " + count1000);
        System.out.println("500 Notes :" + count500);
        System.out.println("200 Notes : " + count200);
        System.out.println("100 Notes : " + count100);
        System.out.println("50 Notes : " + count50);
        System.out.println("20 Notes : " + count20);
        System.out.println("10 Notes : " + count10);
        System.out.println("5 Coins : " + count5);
        System.out.println("2 Coins : " + count2);
        System.out.println("1 Coins : " + count1);

        input.close(); // Close the Scanner object (good practice)
    }
}
		
		
       	 
