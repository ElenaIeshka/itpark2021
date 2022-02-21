package lesson10.inter;

import lesson10.inter.Enumerattion.Language;

public interface Printable {
    int INDEX = 1;
    void print();

    default void printHelloWord (Language language){
        switch (language){
            case RUSSIAN -> System.out.println("Привет, мир!");
            case ENGLISH -> System.out.println("Hello, word!");
        }
    }
}
