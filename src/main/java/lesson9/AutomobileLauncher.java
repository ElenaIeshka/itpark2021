package lesson9;

import java.util.Arrays;
import java.util.Random;

public class AutomobileLauncher {

    public static void main(String[] args) {
        int getDistance = (int) (Math.random() * 1000);
        Automobile bmw = new Car("BMW", "X5", getDistance);
        Automobile mercedes = new Car("Mercedes", "GLE", getDistance);
        Automobile cadillac = new Car("Cadillac", "Escalade", getDistance);
        Automobile tesla = new Car("Tesla", "S", getDistance);
        Automobile volkswagen = new Car("Volkswagen", "polo", getDistance);
        Automobile kamaz = new Truck("Kamaz", "53228", getDistance);
        Automobile kraz = new Truck("Kraz", "255", getDistance);
        Automobile maz = new Truck("Maz", "5334", getDistance);
        Automobile volvo = new Truck("Volvo", "FN750", getDistance);
        Automobile zil = new Truck("Zil", "4331", getDistance);


        for (Automobile automobile : Arrays.asList(bmw, mercedes, cadillac, tesla, volkswagen, kamaz, kraz, maz, volvo, zil)) {
            automobile.move();

        }
    }


}






