package lesson18;

import lesson18.dto.Person;
import lesson18.dto.Sex;
import lombok.SneakyThrows;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationRunner {
    @SneakyThrows
    public static void main(String[] args) {
        Person ivanovV = new Person("ivanov V12", 33, Sex.MALE, 190);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Java test\\test\\person.dat"))) {
        oos.writeObject(ivanovV);
        }
    }
}
