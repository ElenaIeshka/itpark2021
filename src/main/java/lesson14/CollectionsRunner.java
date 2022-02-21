package lesson14;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsRunner {

    private static final List<String> WORDS = List.of("Виталий", "Василий");

    public static void main(String[] args) {
        for (String str : generate()){
            System.out.println(str);
        }
    }

    public static Collection<String> generate() {
        return new Random().nextBoolean() ? Collections.emptyList() : WORDS;
    }
}
