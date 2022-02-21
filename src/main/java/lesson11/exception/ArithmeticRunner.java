package lesson11.exception;

import java.util.Scanner;

public class ArithmeticRunner {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа для деления");
        Scanner scanner = new Scanner(System.in);
        int num1;
//        while (!scanner.hasNextInt()){
//            scanner.next();
//        }
//        Обработка исключения:
        try {
            System.out.println("Введите 1 число ");
            num1 = scanner.nextInt();
        } catch (Exception e){
            num1=11;
            scanner.next();
        }
//        Без обработки исключения та же ситуация.(другой способ)
        System.out.println("Введите 2 число ");
        while (!scanner.hasNextInt()){
            scanner.next();
        }
        int num2 = scanner.nextInt();
        int result = divide (num1,num2);
        System.out.println(result);
    }

    public static int divide(int a, int b) {
        return a/b;
    }
}
