package lesson22.HW22;

import com.fasterxml.jackson.databind.ObjectMapper;
import lesson22.HW22.exception.MandatoryParameterSkippedException;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Scanner;

public class WeatherRunner {

    //https://api.openweathermap.org/data/2.5/weather?q=Samara&appid=526f6c5a918e4d86510716cf04d794a7&units=metric&mode=xml
    private static final ResourceBundle RESOURCES = ResourceBundle.getBundle("messages");
    private static final String EXIT_PHRASE = "выход";
    private static final String APP_ID = "appID";
    private static final String API_WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";


    public static void main(String[] args) throws IOException {

        final String appId = Arrays.stream(args).findFirst()
                .orElseThrow(() -> new MandatoryParameterSkippedException("app.errorParameter"));
//        final String appId = Optional.ofNullable(System.getProperty(APP_ID))
//                .orElseThrow(()->new MandatoryParameterSkippedException(RESOURCES
//                        .getString("app.errorParameter")));

        Scanner inputScanner = new Scanner(System.in);
        System.out.println(RESOURCES.getString("app.title"));
        while (inputScanner.hasNextLine()) {
            String city = inputScanner.nextLine();
            if (EXIT_PHRASE.equalsIgnoreCase(city)) {
                return;
            }

            String transformedCityName = getCityEn(city);
            URL apiUrl = new URL(String.format(API_WEATHER_URL, transformedCityName, appId));
            try (InputStream is = apiUrl.openStream()) {
                ObjectMapper objectMapper = new ObjectMapper();
                Weather weather = objectMapper.readValue(is, Weather.class);
                System.out.printf(RESOURCES.getString("app.result"), city, weather.getMain().getTemp());

            }
            System.out.println("Введите название следующего города, при необходимости завершить программу введите \"выход\"");
        }
    }

    private static String getCityEn(String city) {
        try {
            return RESOURCES.getString(city);
        } catch (Exception e) {
            return "Samara";
        }
    }
}