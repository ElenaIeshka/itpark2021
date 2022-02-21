package lesson18;

import lesson18.dto.Person;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationRunner {

    @SneakyThrows
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Java test\\test\\person.dat"))) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
    }}
}
