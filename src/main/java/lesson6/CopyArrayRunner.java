package lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyArrayRunner {
    public static void main(String[] args) {
        String[] words = {"Мама", "мыла", "раму"};
        String[] anotherwords = copyArray(words);
        anotherwords[words.length] = "конец";
        System.out.println(Arrays.toString(anotherwords));
        String[] newArrays = Arrays.copyOf(anotherwords, Math.round(words.length * 1.5f));
        System.out.println(Arrays.toString(newArrays));
        String[] effectiveArray =new String[100];
        System.arraycopy(words,1,effectiveArray,5,words.length);
        System.out.println(Arrays.toString(effectiveArray));

    }

    public static String[] copyArray(String[] words) {
        String[] newArray = new String[Math.round(words.length * 1.5f)];
        for (int i = 0; i < words.length; i++) {
            newArray[i] = words[i];
        }
        return newArray;
    }
}