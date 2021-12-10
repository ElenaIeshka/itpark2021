package lesson9;

public class Truck extends Automobile {


    public Truck(String brand, String model, int distance) {
        super(brand, model, distance);
    }


    @Override
    public void move() {
        if (getDistance() >= 1200) {
            System.out.println("Грузовик " + this.getBrand() + " " + this.getModel() + " не может проехать " + this.getDistance() + " км. Нет бензина! После 1200 км надо заправиться!");
        } else
            System.out.println("Грузовик " + this.getBrand() + " " + this.getModel() + " проехал " + this.getDistance() + " км.");
    }
}




