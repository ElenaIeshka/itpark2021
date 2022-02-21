package lesson5;

import java.util.Scanner;

public class PrimeNumberRunner {

    public static void main(String[] args) {
        System.out.println("Введите число, как верхнюю границу расчета простых чисел");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int limit = scanner.nextInt();
        printPrimeNumbers(limit);
    }

    public static void printPrimeNumbers(int threshold) {
        if (threshold <= 2) {
            System.out.println("Ожидается ввод числа, больше 2");
        }

        for (int i = 2; i < threshold; i++) {
            if (isPrime(i)) {
                System.out.println("Текущее значение " + i + " является простым");
            }
        }
    }
        public static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}

