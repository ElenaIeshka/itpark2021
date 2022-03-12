package lesson12.HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {

    public static final int ROWS = 4;

    public static final int COLUMNS = 4;

    private static final List<String> SYMBOLS = List.of("1", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "11", "12",
            "13", "14", "15", "16");
    private List<List<String>> values; // private String[][] values;

    public Matrix(int n, int m) {
        if (n != ROWS || m != COLUMNS) {
            throw new MyArraySizeException(n, m, "Произошла ошибка во время инициализации матрицы ");
        }
        this.values = new ArrayList<>(n);
    }

    public void fillUp(int n, int m) {
        for (int i = 0; i < n; i++) {
            List<String> lines = new ArrayList<>(m);
            this.values.add(lines);
            for (int j = 0; j < m; j++) {
                int randomIndex = new Random().nextInt(SYMBOLS.size() - 1);
                lines.add(SYMBOLS.get(randomIndex));
            }
        }

    }

//    public int sum() {
//        for (int i = 0; i < this.values.size(); i++) {
//            List<String> row = this.values.get(i);
//            for (int j = 0; j < row.size(); i++) {
//                String value = row.get(j);
//
//            }
//        }
//  }



    public void print(){
        for (List<String> lines: this.values){
            System.out.println(lines);
        }
    }
}
