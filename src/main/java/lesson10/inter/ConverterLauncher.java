package lesson10.inter;

public class ConverterLauncher {
    public static void main(String[] args) {
        Converter fahrenheit = new Temperature();
        fahrenheit.Fahrenheit(50);
        Converter celsius = new Temperature();
        celsius.Сelsius(20);

    }
}
