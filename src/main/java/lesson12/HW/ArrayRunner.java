package lesson12.HW;
import lesson12.HW2.MyArraySizeException;

import java.util.Scanner;

public class ArrayRunner {

    public static void main(String[] args) throws RuntimeException {
        Scanner in = new Scanner(System.in); //объявляем сканер
        System.out.println("Для заполнения двумерного массива размером 4*4 необходимо указать 16 значений, " +
                "каждое значение вводим с новой строчки (через Enter)");

        int length = 0;
        int n = 4;
        int m = 4;
        String[][] array = new String[n][m];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = in.next();//заполняем массив элементами введенными с клавиатуры.
            }
            length += 4;
        }
        System.out.println("массив, сумма элементов массива " + newArraySum(array));


        if (length > array.length + 1) {
            throw new ArraySizeException("Введено лишнее значение " + in.next());
        }
        return;


    }

    public static int newArraySum(String[][] array) {
        int sum = 0;
        int k = 4;
        int l = 4;

        int[][] newArray = new int[k][l];


        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                try {
                    newArray[i][j] = Integer.parseInt(array[i][j]); //преобразуем String в int

                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Введено некорректное значение" +
                            " , которое находится на месте с индексом k = " + i +
                            " индексом l = " + j);
                }
            }
        }

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print(newArray[i][j] + " "); // выводим строку массива
            }
            System.out.println();// переходим на новую строку
        }


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = sum + newArray[i][j];// сумма элементов массива
            }
        }
        return sum;


    }
}

