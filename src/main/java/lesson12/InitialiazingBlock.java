package lesson12;

import java.util.Random;

public class InitialiazingBlock {
    private final String name;

    {
        if (new Random().nextBoolean()) {
            throw new UnnamedException("ghjggv");
        }
    }

    public InitialiazingBlock() {
        throw new UnnamedException("Задайте имя блока");
    }

    public InitialiazingBlock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
