package lesson7;

public class Dog {
    public static void main(String[] args) {
    Animals dog = new Animals();
    dog.nameAnimals = "Dog";
    dog.nickname = "Stesha";
    dog.run = 450;
    dog.swim = 10;
    dog.maxrun = 501;
    dog.maxswim = 11;

    dog.runAnimals(dog.run);
    dog.swimAnimals(dog.swim);
}
}
