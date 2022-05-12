package lesson14.HW14;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContactRunner {
    private static final Integer LIMIT = 10_000;
    private static final Integer LIMIT_OF_LINKED_CONTACTS = 100;

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        Contact[] contacts = new Contact[LIMIT];
        for (int i = 0; i < contacts.length; i++) {
            contacts[i] = new Contact();

        }

        long time = System.currentTimeMillis() - now;
        System.out.println("Заполнение массива составило : " + time + " милисекунд");


        long now1 = System.currentTimeMillis();
        List<Contact> contacts1 = new ArrayList<>(LIMIT);
        IntStream.range(0, LIMIT).forEach(value -> {
            contacts1.add(new Contact());
        });
        long time1 = System.currentTimeMillis() - now1;
        System.out.println("Заполнение списка составило : " + time1 + " милисекунд");
        for (Contact contact: contacts1){
            IntStream.range(0, LIMIT_OF_LINKED_CONTACTS).boxed().map(i -> randomElement(contacts1))
                    .forEach(contact.getLinkedContacts()::add);
        }
        Map<Contact,Integer> mapOfContacts = contacts1.stream().map(Contact::getLinkedContacts)
                .flatMap(Collection::stream)
                .collect(Collectors.toMap(Function.identity(),contact-> 1, Integer::sum));
        mapOfContacts.entrySet().stream().max((c1,c2)->c1.getValue().compareTo(c2.getValue()))
                .ifPresent(System.out::println);

        long now2 = System.currentTimeMillis();
        Set<Contact> contacts2 = new HashSet<>(LIMIT);
        IntStream.range(0, LIMIT).forEach(value -> {
            contacts2.add(new Contact());
        });
        long time2 = System.currentTimeMillis() - now2;
        System.out.println("Заполнение множества составило : " + time2 + " милисекунд");


    }
    private static Contact randomElement (Collection<Contact>collection){
        int counter = 0;
        int element = new Random().nextInt(collection.size());
        for (Contact contact: collection){
            if (counter++ == element){
                return contact;
            }
        }
        throw new IllegalArgumentException("Ошибка");
    }



    }



