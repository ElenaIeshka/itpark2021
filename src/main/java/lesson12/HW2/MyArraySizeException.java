package lesson12.HW2;

import static lesson12.HW2.Matrix.*;

public class MyArraySizeException extends RuntimeException{
    private final int wrongRows;
    private final int wrongColumns;

    public MyArraySizeException(int wrongRows,int wrongColumns, String message){
        super(message + String.format(". Количество строк в матрице ожидалось равным %d, а количество колонок, равны %d",ROWS,COLUMNS));
        this.wrongColumns =wrongColumns;
        this.wrongRows = wrongRows;
    }

    public int getWrongRows() {
        return wrongRows;
    }

    public int getWrongColumns() {
        return wrongColumns;
    }
}
