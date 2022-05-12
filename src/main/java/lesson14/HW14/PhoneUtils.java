package lesson14.HW14;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PhoneUtils {
    public static String generatePhone(){
        String suffixPhone = IntStream.range(0, 7).boxed().map(value -> new Random().nextInt(10)+ "").collect(Collectors.joining());
        return "8(800)" + suffixPhone;
        }

    }

