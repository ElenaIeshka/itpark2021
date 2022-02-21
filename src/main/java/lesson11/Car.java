package lesson11;

public class Car implements Cloneable {
    private Engine engine;
    public double distance;
    private String mark;
    private String model;

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", distance=" + distance +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
//    глубокое клонирование

    @Override
    public Object clone() throws CloneNotSupportedException {
        Car clone = (Car) super.clone();
        clone.setEngine( this.engine.clone());
        return clone();
    }

    public class Engine implements Cloneable{
        private double volume;

        public Engine(double volume){
            this.volume = volume;
        }
// глубокое клонирование
        @Override
        protected Engine clone() throws CloneNotSupportedException {
            return (Engine) super.clone();
        }
    }
}
