public class Debt {
    private double balance; // Storing balance
    private double interestRate; // Storing interest rate

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    // Method for printing the balance
    public void printBalance() {
        System.out.println(this.balance);
    }

    // Grows the debt amount
    public void waitOneYear() {
        this.balance *= this.interestRate;
    }
}
