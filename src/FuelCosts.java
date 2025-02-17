import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons, mpg, pricePerGallon;

        // Get the number of gallons in the tank
        do {
            System.out.print("Enter the number of gallons: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // clear invalid input
            }
            gallons = scanner.nextDouble();
        } while (gallons <= 0);

        // Get the fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency (miles per gallon): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number. ");
                scanner.next();

            }
            mpg = scanner.nextDouble();
        } while (mpg <= 0);

        // Get the price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number. ");
                scanner.next();

            }
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon < - 0);

        // Calculate results
        double costPer100Miles = (100 / mpg) * pricePerGallon;
        double maxDistance = gallons * mpg;

        // Display results
        System.out.printf("The cost to drive 100 miles: $%.2%n", costPer100Miles);
        System.out.printf("The car can travel %.2f miles with a full tank.%n", maxDistance);


        scanner.close();





        }
    }