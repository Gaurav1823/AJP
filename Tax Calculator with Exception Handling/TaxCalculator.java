import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
  
            System.out.print("Enter your annual income (in Rupees): ");  // Input salary
            double income = Double.parseDouble(scanner.nextLine());

            if (income < 0) {
                throw new IllegalArgumentException("Income cannot be negative.");
            }

            double tax = calculateTax(income);
            System.out.printf("Calculated tax: %.2f%n Rupees", tax);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Thank you for using the Tax Calculator.");
        }
    }

    // Basic tax calculation 
    public static double calculateTax(double income) {
        double tax = 0.0;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = (250000 * 0.05) + (income - 500000) * 0.2;
        } else {
            tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3;
        }

        return tax;
    }
}
