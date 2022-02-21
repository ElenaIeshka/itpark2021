package lesson11;

public class CarRunner {
    public static void main(String[] args) throws Exception{
        Car car = new Car();
        car.setDistance(100_000);
        car.setMark("Skoda");
        car.setModel("Rapid");
//        car.setEngine(new Car.Engine(1.4));  для статичного класса
        car.setEngine(car.new Engine(1.4)); // для нестатичного класса

        car.new Engine(1.6);
//        new Car.Engine(1.4)


//     клонирование
        Object carClone = car.clone();
        System.out.println(car);
        System.out.println(carClone);
    }
}
