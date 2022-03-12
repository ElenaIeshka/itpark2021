package lesson12.HW;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRunner {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Для заполнения двумерного массива размером 4*4 необходимо указать 16 значений, каждое с новой строчки ");
            String mat= in.next();


            int n = 4;
            int m = 4;
            String[][] matrix = new String[n][m];

//                for (int i = 0; i < n; i++) {
//                    for (int j = 0; j < m; j++) {
//                        String matrix= in.next();
//
//                    }
//                }

                System.out.println("2222222222222" + Arrays.deepToString(new String[]{String.valueOf(matrix)}));

        }
    }

