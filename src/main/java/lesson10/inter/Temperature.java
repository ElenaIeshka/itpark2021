package lesson10.inter;

public class Temperature implements Converter{
    public double getF() {
        return f;
    }

    public double getC() {
        return c;
    }

    double f;
    double c;


    @Override
    public void Fahrenheit(double c) {
        f = c* 9/5 +32;
        System.out.println("Конвертер темпратур из Цельсия в Фарингейт "+ f);
    }

    @Override
    public void Сelsius(double f) {
        c = (f-32)*5/9;
        System.out.println("Конвертер темпратур из Фаренгейта в Цельсия "+ c);

    }
}
