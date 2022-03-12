package lesson12.HW;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Для заполнения двумерного массива размером 4*4 необходимо указать 16 значений, каждое с новой строчки ");
//        String n = [0,1,2,...,15];
//        String a(n) = in.next();
        String a = in.next();
        String a1 = in.next();
        String a2 = in.next();
        String a3 = in.next();
        String a4 = in.next();
        String a5 = in.next();
        String a6 = in.next();
        String a7 = in.next();
        String a8 = in.next();
        String a9 = in.next();
        String a10 = in.next();
        String a11 = in.next();
        String a12 = in.next();
        String a13 = in.next();
        String a14 = in.next();
        String a15 = in.next();
        String[][] matrix = new String[][]{{a, a1, a2, a3},
                {a4, a5, a6, a7},
                {a8, a9, a10, a11},
                {a12, a13, a14, a15}};
        System.out.println(Arrays.deepToString(matrix));
        int n = 4;
        int m = 4;
        String[][] matrix1 = new String[n][m];
        System.arraycopy(matrix, 0, matrix1, 0, matrix.length);
        System.out.println("sjksjdkjd" + Arrays.deepToString(matrix1));
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                int matrix1 = Integer.parseInt(String.valueOf(matrix1));
//                System.out.println("2222222222222" + Arrays.deepToString(matrix1));
//            }
//        }
    }}



//
//
//        public int sum for (String[] strings : (matrix)) {
//
//        }
//        ){
////            int[][] matrix1 = new int[][]{}{};
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[i].length; j++) {
//
//
////                matrix[i][j] = in.next();
//////                matrix1 = new int[4][4];
//                    int matrix = Integer.parseInt(String.valueOf(matrix));
////                }
////            }
////            System.out.println(Arrays.toString(matrix1));
//        }
//    }
//}
////        for (int i = 0; i < 4; i++) {
////            for (int j = 0; j < 4; j++) {
////
////        }
//        //            for (int i = 0; i < matrix.length; i++) {
////            for (int j = 0; j < matrix[i].length; j++) {
////                matrix1[i][j] = Integer.parseInt(matrix[i][j]);
////
////            }
////            System.out.println(Arrays.deepToString(matrix));
////        }
////
////    }
//
////
////
////
////        int[][] matrix1 = new int[4][4];
////        for (int i = 0; i < matrix.length; i++) {
////            for (int j = 0; j < matrix[i].length; j++) {
////                matrix1[i][j] = Integer.parseInt(matrix[i][j]);
////
////            }


//        }

//        System.out.println("Общая сумма всех элементов массива: " + s);
//
//
//        public  matrixSumm (int matrix1[][]){
//            int summ = 0;
//            for (int i = 0; i < matrix1.length; i++) {
//                for (int j = 0; j < matrix1[i].length; j++) {
//                    summ += matrix1[i][j];
//                }
//            }
//            System.out.println("Общая сумма всех элементов массива: " + summ);
//        }
//    }
//}


//
//    String[][] matrix1 =matrix;
//    Integer integer = Integer.valueOf(matrix1);
//    public static int JJ (String [][] matrix) {
//        int sum=0;
//
//
//        for (int i=0; i < matrix.length; i++){
//            for (int j= 0; j < matrix[i].length; j++){
//           sum =+ sum + matrix;
//            }
//        }
//    }

//}
//