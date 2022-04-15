package isp.lab7.safehome;

public class TooManyAttemptsException extends Exception {

    public TooManyAttemptsException() {
    }
    
    public TooManyAttemptsException(String msg) {
        super(msg) ;
    }
    
}
