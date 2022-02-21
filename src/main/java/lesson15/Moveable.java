package lesson15;

import static lesson14.QueueRunner.print;

@FunctionalInterface
public interface Moveable {
    void move();

//    void moveDistance(int distance);


    default void moveAndPrint(){
        print("Начало движения");
        move();
        print("Конец движения");
    }

    static void print(String str){
        System.out.println(str);
    }
}
