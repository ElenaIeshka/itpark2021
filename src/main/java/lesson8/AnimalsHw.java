package lesson8;

public class AnimalsHw {
    private String nameAnimals;
    private String nickname;
    private int age;
    private boolean sex;
    private String voice;


        public AnimalsHw(String nameAnimals, String nickname, int age, boolean sex, String voice) {
            this.nameAnimals = nameAnimals;
            this.nickname = nickname;
            this.age = age;
            this.sex = sex;
            this.voice = voice;
        }

    @Override
    public String toString() {
        return "AnimalsHw{" +
                "nameAnimals='" + nameAnimals + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", voice='" + voice + '\'' +
                '}';
    }

    public void voice(String[] arg) {
            System.out.println(voice);
        }
        }





