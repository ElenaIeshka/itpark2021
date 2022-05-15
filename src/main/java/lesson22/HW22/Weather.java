package lesson22.HW22;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private MainDto main;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MainDto {
        private Double temp;
    }

}
