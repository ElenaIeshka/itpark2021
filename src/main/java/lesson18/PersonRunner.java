package lesson18;

import lesson18.dto.Person;
import lesson18.dto.Sex;
import lombok.SneakyThrows;

public class PersonRunner {
    @SneakyThrows
    public static void main(String[] args) {
        Person person = new Person("Иванов Виталий");
        person.setAge(35);
        Person newperson = new Person();
        Person ivanov = new Person("Иванов", 33, Sex.MALE, 190);
        person.beOlder();

//        try {
//            person.beOlder();
//        } catch (Exception e){
//            throw e;
//        } создает SneakyThrow и подстваляет в байт код
    }
}
