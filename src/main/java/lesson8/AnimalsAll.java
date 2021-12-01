package lesson8;

public class AnimalsAll {
    public static void main(String[] args) {
        WildAnimal mila = new WildAnimal("Tiger", "Mila", 2, false, "rrrrrr");
        DomesticAnimal barsik = new DomesticAnimal("Cat", "Barsik", 3, true, "meow");
        System.out.println(mila);
        System.out.println(barsik);

        AnimalsHw[] animal = new AnimalsHw[]{mila, barsik};
        for (AnimalsHw animals : animal) {
            animals.voice();
        }
    }
}
