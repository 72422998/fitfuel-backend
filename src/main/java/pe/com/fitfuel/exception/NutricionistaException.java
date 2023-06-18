package pe.com.fitfuel.exception;

public class NutricionistaException extends RuntimeException{
    public NutricionistaException(String message){
        super(message);
    }
    public NutricionistaException(String message,Throwable cause){
        super(message,cause);
    }
}
