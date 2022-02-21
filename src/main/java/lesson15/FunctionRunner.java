package lesson15;

import lesson15.dto.Account;

import java.util.Random;
import java.util.function.*;

public class FunctionRunner {
    public static void main(String[] args) {
        final String value= "Тестовая строка";
        Function<String, Integer> spr2Int = str -> Integer.decode(str);
        Integer result123 = spr2Int.apply("123");
        System.out.println(result123);
        Integer result1 = spr2Int.apply("1");
        System.out.println(result1);
        Comparable<String> comparable= str-> value.compareTo(str);
        summa("123", "325", spr2Int, comparable );
        summa("1237","32545",spr2Int, comparable);

        Function<Account, Integer> account2Int = account -> account.hashCode();
        Predicate<Account> activeAccountPredicate = account -> account.getBalance()>0;
        Consumer<Account> printAccount = account -> System.out.println(account);
        BiFunction<String, String, String> concatStrings = (str1, str2) -> str1+str2;
        Supplier<Integer> generatorInts = () -> new Random().nextInt();

    }

    public static int summa(String arg1, String arg2, Function<String,Integer> converter, Comparable<String> comparable){
       return (comparable.compareTo(arg1)>0 ? converter.apply(arg1) : 0) + (comparable.compareTo(arg2)>0 ? converter.apply(arg2): 0);

    }
}


