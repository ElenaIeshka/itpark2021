package lesson12;

public class NotEnoughMoneyException extends RuntimeException{
    private double balance;

    public NotEnoughMoneyException(double balance) {
        this.balance = balance;
    }

    public NotEnoughMoneyException(String message, double balance) {
        super(message);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
