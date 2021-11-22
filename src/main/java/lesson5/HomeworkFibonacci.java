package lesson5;

import java.util.Scanner;

public class HomeworkFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вычисление n-го члена последовательности Фибоначчи." +
                " Введите n (целое число)");
        int n = in.nextInt();
        System.out.println(n + " член последоательности Фибоначчи = " + fib(n));
    }


    public static int fib(int n){
            if (n < 2)
                return n;
        return fib(n-1)+ fib(n - 2);

    }


}



