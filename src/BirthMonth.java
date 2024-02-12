import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        // Step 1: Display a message asking the user to enter their birth month.
        System.out.println("Enter your birth month (1-12):");

        // Step 2: Read the input from the user and store it in a variable (birthMonth).
        Scanner scanner = new Scanner(System.in);
        int birthMonth = scanner.nextInt();

        // Step 3: Check if the input is in the range of 1 to 12 (inclusive).
        if (birthMonth >= 1 && birthMonth <= 12) {
            // Step 4-6: If the input is in the range, display a message echoing the input.
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            // Step 4-7: Otherwise, display an error message indicating that the input is out of range.
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        // Step 8: Close the Scanner.
        scanner.close();
    }
}
