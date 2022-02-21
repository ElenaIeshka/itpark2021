package lesson8;

public class Human {
    private String fio;
     private int age;
    private String nationality;
    private boolean sex;

    public Human(String fio, int age, String nationality, boolean sex) {
        this.fio = fio;
        this.age = age;
        this.nationality = nationality;
        this.sex = sex;
    }

    public void changeName(String newName) {
        this.fio = newName;
    }

    public void beOlder() {
        this.age++;

    }

    public void changeNationality(String nationality) {
        this.nationality=nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", sex=" + sex +
                '}';
    }
}
