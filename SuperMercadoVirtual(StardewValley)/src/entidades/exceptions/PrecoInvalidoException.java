package entidades.exceptions;

public class PrecoInvalidoException extends RuntimeException {
    public PrecoInvalidoException(String message){
        super(message);
    }
}
