package lesson16.concurrency;

import java.math.BigDecimal;

public class AccountRunner {
    public static void main(String[] args) throws InterruptedException{

        Account account = new Account();


        AccountIncrementThread AccountIncrementThread = new AccountIncrementThread(account, new BigDecimal("10000"));
        AccountIncrementThread.start();
   //     AccountIncrementThread.join();

        AccauntDecrementThread AccauntDecrementThread = new AccauntDecrementThread(account, new BigDecimal("5000"));
        AccauntDecrementThread.start();
   //     AccauntDecrementThread.join();

        AccountChangeBalanceThread AccountChangeBalanceThread = new AccountChangeBalanceThread(account);
        AccountChangeBalanceThread.start();
    //    AccountChangeBalanceThread.join();

        System.out.println("Текущее состояние счета: " + account.getBalance());
    }
}
