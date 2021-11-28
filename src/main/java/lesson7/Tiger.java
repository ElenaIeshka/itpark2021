package lesson7;

public class Tiger {
    public static void main(String[] args) {
        Animals tiger = new Animals();
        tiger.nameAnimals = "Tiger";
        tiger.nickname = "Marun";
        tiger.run = 600;
        tiger.swim = 1000;
        tiger.maxrun =701;
        tiger.maxswim = 1001;


        tiger.runAnimals(tiger.run);
        tiger.swimAnimals(tiger.swim);
    }
}
