import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // creating variables
        int people;
        double tip;

        // initializing the values, from the user
        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your group? ");
        people = scan.nextInt();
        System.out.print("What is the tip percentage (in decimal form)? ");
        tip = scan.nextDouble();

        // creating an object
        TipCalculator bill1 = new TipCalculator(people, tip);

        // adding to the bill
        System.out.print("How many meals are there? ");
        int numOfMeals = scan.nextInt();
        double meal;
        if (numOfMeals > 0) {
            System.out.print("Enter a cost in dollars and cents: ");
            meal = scan.nextDouble();
            bill1.addMeal(meal);
            numOfMeals -= 1;
        }
    }
}
