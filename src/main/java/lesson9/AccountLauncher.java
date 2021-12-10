package lesson9;

public class AccountLauncher {
    public static void main(String[] args) {

        Account myAccount = new Account("Ieshkina Elena");
        myAccount.activated();
        myAccount.deposit(10_000);
        myAccount.withdraw(1_000);
        myAccount.deposit(5_000);
        System.out.println("Состояние счета: " + myAccount.getBalance());

    }
}
