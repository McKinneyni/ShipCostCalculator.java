import java.util.InputMismatchException;
import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        //Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        try{

        //Step 3 : Prompt the user to enter the price of the item
        System.out.print("Enter the price of the item");

        //Step 4 : Read the price from the user
        double price = scanner.nextDouble();

        //Step 5 : Calculate the shipping cost
        double shippingCost;
        if (price >= 100) {
            shippingCost = 0; //Free Shipping
        } else {
            shippingCost = price * 0.02; //2% of the price
        }
        //Step 6 : Calculate total price
        double totalPrice = price + shippingCost;

        //Step 7 : Output the shipping cost & total
        System.out.println(" Shipping cost :$" + shippingCost);
        System.out.println(" Total price: $" + totalPrice);
        } catch (InputMismatchException e) {
            // Step 8: Handle the exception if the input is not a double
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            // Step 9: Close the Scanner
            scanner.close();
        }
    }
}
