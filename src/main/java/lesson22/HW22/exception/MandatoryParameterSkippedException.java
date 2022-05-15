package lesson22.HW22.exception;

//если appId не указан при запуске программы
public class MandatoryParameterSkippedException extends RuntimeException {
    public MandatoryParameterSkippedException(String message) {
        super(message);
    }
}
