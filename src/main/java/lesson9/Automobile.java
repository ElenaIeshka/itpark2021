package lesson9;

public abstract class Automobile {
    private int distance;
    private String brand;
    private String model;

    public Automobile(String brand, String model, int distance) {
        this.brand = brand;
        this.model = model;
        this.distance = (int) (Math.random() * 1000);
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getDistance() {
        return distance;
    }
    public abstract void move();
}







