public class TipCalculator {
    // instance variables
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip;

    // constructor
    public TipCalculator(int people, double percent) {
        numPeople = people;
        tipPercentage = percent;
        totalBillBeforeTip = 0.0;
    }

    // methods
    // "getter" method that returns the bill before the tip
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    // "getter" method that returns the tip percent
    public double getTipPercentage() {
        return tipPercentage;
    }

    // increases the bill value by the parameter
    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    // calculates the tip
    public double tipAmount() {
        return totalBillBeforeTip * tipPercentage;
    }

    // finds the bill with tip
    public double totalBill() {
        return tipAmount() + totalBillBeforeTip;
    }

    // calculates the amount that each person pays, excluding the tip
    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }

    // calculates the amount that each person pays, only the tip
    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    // calculates the amount each person pays, including the tip
    public double perPersonTotalCost() {
        return totalBill() / numPeople;
    }
}
