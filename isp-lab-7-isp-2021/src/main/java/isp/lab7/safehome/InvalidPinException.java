package isp.lab7.safehome;

public class InvalidPinException extends Exception{

    public InvalidPinException() {
    }
    public InvalidPinException(String msg){
        super(msg); 
    }
}
