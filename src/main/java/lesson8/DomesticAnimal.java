package lesson8;

public class DomesticAnimal extends AnimalsHw{
    public DomesticAnimal (String nameAnimals, String nickname, int age, boolean sex, String voice) {
        super(nameAnimals, nickname, age, sex, voice);
    }
    public void voice(String[] newVoice){
        System.out.println("Звук");
        super.voice(newVoice);
    }
}
