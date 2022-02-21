package lesson12;

public class Account {
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }


    public void deposit (double amount){
        balance += amount;
    }
    public void withdraw (double amount) {
        if (balance < amount){
            throw new NotEnoughMoneyException("Недостаточно средств", this.balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
