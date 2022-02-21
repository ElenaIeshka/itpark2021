package lesson4;

import java.util.Scanner;

public class ScannerRunner{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Представьтесь!");
        String userName = scanner.nextLine();
        System.out.println("Добро пожаловать," + userName + ". Введите число для расчета:");
        while (!scanner.hasNextInt()){
            String text =scanner.next();
            System.out.println("Ожидается введение целого числа, а вы ввели " + text);
        }
        int value = scanner.nextInt();
        System.out.println("Подтверждаем, что вы ввели " + value);
    }
}
