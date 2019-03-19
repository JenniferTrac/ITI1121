public class Account{

    private double balance;

    public Account() {
        this.balance=0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
	    // Your code here
        balance += amount;
        System.out.println("new balance=" + balance + "$");
    }

    public void withdraw(double amount){
	    // Your code here
        if (amount > balance) {
            throw new NotEnoughMoneyException(amount, balance);
        } else {
            balance -= amount;
            System.out.println("new balance=" + balance + "$");
        }
    }
}
