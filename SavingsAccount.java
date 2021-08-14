public class SavingsAccount extends Account{
    private static double annualInterestRate = 0.0;

    public SavingsAccount(int id) {
        super(id);
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
    }
}