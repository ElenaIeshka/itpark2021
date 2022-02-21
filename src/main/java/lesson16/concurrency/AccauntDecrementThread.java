package lesson16.concurrency;

import java.math.BigDecimal;

public class AccauntDecrementThread extends Thread{

    private final Account account;
    private final BigDecimal value;

    public AccauntDecrementThread(Account account, BigDecimal delta){
        this.account = account;
        this.value = delta;
    }

    public void run(){
        synchronized (account) {
        System.out.println("Осуществляем снятие со счета " + Thread.currentThread().getName());
        account.withdraw(value);
        System.out.println("Текущее состояние счета: " + account.getBalance());
        }

    }
}
