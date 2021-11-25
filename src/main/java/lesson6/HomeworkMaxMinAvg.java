package lesson6;

import java.util.Random;

public class HomeworkMaxMinAvg {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(11);
            System.out.println(array[i] + " ");
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min значение " + min);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max значение " + max);

        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i] / array.length;
        }
        System.out.println("Average значение " + average);
    }
}
