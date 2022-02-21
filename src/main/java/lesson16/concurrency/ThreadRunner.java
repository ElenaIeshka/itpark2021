package lesson16.concurrency;

public class ThreadRunner {
    public static void main(String[] args) throws Exception {
//        System.gc(); сборка мусора
        Thread.currentThread().setPriority(8);
        int a =15;
        int b = 20;
        print(summa(a,b));

        PrinterThread printerThread1 = new PrinterThread("Первый поток printer","Привет, мир", 5);
       Thread.State state = printerThread1.getState();
        PrinterThread printerThread2 = new PrinterThread("Добро пожаловать, мир", 1, true);
        printerThread1.start();
        printerThread1.join();
        printerThread2.start();
        printerThread2.join();
        new Thread(() -> print(Thread.currentThread().getName() + ":" + summa(a,b))).start();
//        new Thread(() -> print(summa(a,b))).start(); создыние 3 потока другим современным способом (строчка выше) так надо делать!
        System.out.println(Thread.currentThread().getName());
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                print(summa(a,b));
//            }
//        }).start();


//        Thread.sleep(60*1000);
    }

    private static int summa (int a, int b){
        return a+b;
    }

    public static void print (Object ab) {
        System.out.println(ab);
    }
}
