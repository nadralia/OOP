public class CheckingAccount extends Account {
    public CheckingAccount(int id) {
        super(id);
    }

    private static double overdraft = 5000;
 
    public double getBalance() {
        return overdraft;
    }
 }