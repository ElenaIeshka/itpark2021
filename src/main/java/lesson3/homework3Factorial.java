package lesson3;

import java.util.Scanner;

public class homework3Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вычисление факториала числа n! " +
                "Введите n (целое число)");
        int value = in.nextInt();
        System.out.println("Факториал " + value + "! = " + calculateFactorial(value));
    }

    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
