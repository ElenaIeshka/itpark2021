package lesson9;

public class Account {
    private double balance;
    private String owner;
    private boolean blocked;


    public Account(String name) {
        this.owner = name;
        this.balance = 0.0;
        this.blocked = false;
    }

    public boolean deposit(double amount) {
        if (blocked){
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
        balance -= amount;
        return true;
    }
    return false;
}
public void activated(){
        this.blocked = false;
}

    public double getBalance() {
        return balance;
    }
}
