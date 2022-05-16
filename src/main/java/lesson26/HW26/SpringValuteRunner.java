package lesson26.HW26;

import lesson26.HW26.service.ValuteFetcher;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan("lesson26.HW26")
public class SpringValuteRunner {

    private static final String EXIT_PHRASE = "выход";

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringValuteRunner.class);
        final ValuteFetcher va = annotationConfigApplicationContext.getBean(ValuteFetcher.class);
        System.out.println("Введите код валюты");
        System.out.printf("или введите %s для завершения работы программы:\n", EXIT_PHRASE);
        final Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final String text = scanner.nextLine();
            if (EXIT_PHRASE.equalsIgnoreCase(text)) {
                return;
            }

            va.getValuteByCode(text.toUpperCase()).ifPresentOrElse(
                    value -> {
                        System.out.printf("Текущий курс валюты %s равен %.4f рублей\n", text, value);
                        System.out.println("Укажите следующий код валюты или завершите работу программы");
                    },
                    () -> System.out.println("Введен несуществующий код валюты. Попробуйте еще!")
            );
        }
    }
}