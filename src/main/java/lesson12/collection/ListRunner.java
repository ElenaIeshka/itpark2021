package lesson12.collection;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListRunner {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};
        List <Integer> integers = List.of(1,2,3,4,5);
        for (Integer value :integers){
            System.out.println(value + " ");
        }
        System.out.println();
        System.out.println("------------");
        for (Iterator <Integer> iterator = integers.iterator(); iterator.hasNext();) {
            Integer value = iterator.next();
            System.out.println(value + " ");
        }
        List<String> names = new ArrayList<>();
        names.add("Виталий");
        names.add("Ольга");
        names.add("Сергей");
        names.add("Максим");
        System.out.println(names);

        String name ="Виталий";
        System.out.println("В списке имен " + name + " " + (names.contains(name) ? "найден" : "не найден"));

        names.remove("Сергей");
        System.out.println(names);
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        System.out.println("Теперь на первом месте стоит " + names.get(names.size()-1));
        names.addAll(List.of("Марина","Сергей", "Надя", "Виталий"));
        System.out.println(name.indexOf("Виталий"));
        System.out.println(name.lastIndexOf("Виталий"));
    }

}
