package lesson9;

public class Car extends Automobile {


    public Car(String brand, String model, int distance) {

        super(brand, model, distance);
    }


    @Override

    public void move() {
        if (getDistance() >= 500) {

            System.out.println("Автомобиль " + this.getBrand() + " " + this.getModel() + " не может проехать " + this.getDistance() + " км. Нет бензина! После 500 км. надо заправиться!");
        } else
            System.out.println(this.getBrand() + " " + this.getModel() + " проехал " + this.getDistance() + " км.");
    }


}
