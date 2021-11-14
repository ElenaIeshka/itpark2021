package lesson3;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа решает квадратное уравнение вида: ax^2 + bx + c = 0. " +
                "Введите a, b, c");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double D = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + " x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x =" + x);
        } else {
            System.out.println("Нет действительных решений уравнения");
        }
    }
}
