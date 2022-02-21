package lesson10.inter;

import lesson10.inter.Enumerattion.Language;

public class EnumRunner {
    public static void main(String[] args) {
        Printable printable= new Printer();
        printable.printHelloWord(Language.ENGLISH);
        printable.printHelloWord(Language.as(12));

        System.out.println(Language.RUSSIAN.asString());
    }
}
