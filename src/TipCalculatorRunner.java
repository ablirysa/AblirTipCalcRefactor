import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // creating variables
        int people;
        double tip;
        double meal = 0.0;

        // initializing the values, from the user
        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your group? ");
        people = scan.nextInt();
        System.out.print("What is the tip percentage (in decimal form)? ");
        tip = scan.nextDouble();

        // creating an object
        TipCalculator bill1 = new TipCalculator(people, tip);

        // adding to the bill
        while (meal != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g 12.50 (-1 to end): ");
            meal = scan.nextDouble();
            scan.nextLine();
            if (meal != -1) {
                bill1.addMeal(meal);
            }
        }

        // printing out information
        System.out.println("-----------------------------------");
        System.out.printf("Total Bill Before Tip: " + "%.2f", + bill1.getTotalBillBeforeTip());
        System.out.println();
        System.out.printf("Tip Percentage (in decimal form): " + "%.2f", + bill1.getTipPercentage());
        System.out.println();
        System.out.printf("Total Tip: " + "%.2f", + bill1.tipAmount());
        System.out.println();
        System.out.printf("Total Bill with Tip: " + "%.2f", + bill1.totalBill());
        System.out.println();
        System.out.printf("Per Person Cost Before Tip: " + "%.2f", + bill1.perPersonCostBeforeTip());
        System.out.println();
        System.out.printf("Tip Per Person: " + "%.2f", + bill1.perPersonTipAmount());
        System.out.println();
        System.out.printf("Total Cost Per Person: " + "%.2f", +  bill1.perPersonTotalCost());
    }
}
