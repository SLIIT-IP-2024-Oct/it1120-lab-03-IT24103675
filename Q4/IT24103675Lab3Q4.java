import java.util.Scanner;

public class IT24103675Lab3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        int number = input.nextInt();

        // Convert the number to a string
        String NumberString = Integer.toString(number);

        // Iterate over each character and print it
        for (char digit : NumberString.toCharArray()) {
            System.out.print(digit + " ");
        }

        input.close();
    }
}