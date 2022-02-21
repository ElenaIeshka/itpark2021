package lesson10.inter;

public class Printer implements Printable{
    @Override
    public void print() {
        System.out.println("Печать из класса "+ Printer.class.getName());
    }
}
