package lesson4;

import java.util.Scanner;

public class HomeworkSqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введити целое число, из которого нужно вычислить корень квадратный," +
                " с новой строки введите погрешность вычисления (формат числа напр: 0,1).");
        int a = scanner.nextInt();
        double err = scanner.nextDouble();
        System.out.println( "Ответ решения методом Герона: " + sqrt(a, err));
    }

    public static double sqrt(int a, double err) {
        double x0 = a;
        double x1 = 0.5 * (x0 + a / x0);
        double d = Math.abs(x1 - x0);
        while (d >= 2 * err && d * d >= 2 * err) {
            x0 = x1;
            x1 = 0.5 * (x0 + a / x0);
            d = Math.abs(x1 - x0);
        }
        return x1;
    }
}
