package lesson2;

public class FirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        long summa = calculate(3, 5);
        System.out.println(summa);
        long summa1 = calculate(5, 5);
        System.out.println(summa1);


        long resultOfMinus = minus(2, 18);
        System.out.println(resultOfMinus);


        long result = multiplyAndSumma(5);
        System.out.println(result);



    }

    /**
     * Метод будет складывать 2 аргумента и возвращать результат этой операции
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     * @return результат сложения двух чисел
     */
    public static long calculate (int arg1,  int arg2) {
        return arg1 + arg2;
    }

    public static long minus (int arg1,  int arg2) {
        return arg1 - arg2;
    }


    public static long multiplyAndSumma (int arg1) {
        int result = 3 * arg1 + 15;
        result = result - 38;
        return result;
    }
}