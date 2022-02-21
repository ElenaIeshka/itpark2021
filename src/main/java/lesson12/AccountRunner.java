package lesson12;

public class AccountRunner {
    public static void main (String[] args){
        Account account = new Account(1_000);
                System.out.println("Текущий баланс" + account.getBalance());
        try{
            account.withdraw(5_000);
        } catch (NotEnoughMoneyException exception) {
            exception.printStackTrace();
            System.out.println("Снятия не произошло.");
        }
        System.out.println("Текущий баланс"+account.getBalance());
    }
}
