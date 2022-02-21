package lesson7;


public class Animals {
    String nameAnimals;
    String nickname;
    int run;
    int swim;



    public String getNameAnimals() {
        return nameAnimals;
    }

    public String getNickname() {
        return nickname;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }


    int maxrun;

    public void runAnimals(int run) {
        if ((run < maxrun) && (run >= 0)) {
            System.out.println(getNameAnimals() + " " + getNickname() + " пробежал/а " + getRun() + " м.");
        } else {
            System.out.println("Ошибка данных, " + getNameAnimals() + " " + getNickname() +
                    " не может пробежать " + getRun() + " м.");
        }
    }

    int maxswim;

    public void swimAnimals(int swim) {
        if ((swim < maxswim) && (swim > 0)) {
            System.out.println(getNameAnimals() + " " + getNickname() + " проплыл/а " + getSwim() + " м.");
        } else if (maxswim == 0) {
            System.out.println(getNameAnimals() + " " + getNickname() + " не умеет плавать ");
        } else {
            System.out.println("Ошибка данных, " + getNameAnimals() + " " + getNickname() +
                    " не может проплыть " + getSwim() + " м.");
        }
    }
}
















