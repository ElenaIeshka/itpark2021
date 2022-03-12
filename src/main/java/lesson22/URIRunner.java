package lesson22;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class URIRunner {
    public static void main(String[] args) throws URISyntaxException, IOException {
        URI uri = new URI("https://www.starhit.ru/novosti/oni-unichtojili-samuyu-talantlivuyu-figuristku-mira-tragediya-kamilyi-valievoy-na-olimpiade-267384/");
        System.out.println("Протокол: " + uri.getScheme());
        System.out.println("Хост: " + uri.getHost());
        System.out.println("Порт: " + uri.getPort());
        System.out.println("Путь: " + uri.getPath());
        System.out.println("Параметры: " + uri.getRawQuery());
        System.out.println("Фрагмент: " + uri.getFragment());
        System.out.println("--------");
        URL url = uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36");

//
//        Scanner scanner = new Scanner(url.openStream());
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());


            System.out.println("-----------");
            URL resource = URIRunner.class.getResource("/file.txt");
            System.out.println("Протокол" + resource.toURI().getScheme());
            System.out.println("Адрес ресурса: " + resource);
        }
    }



