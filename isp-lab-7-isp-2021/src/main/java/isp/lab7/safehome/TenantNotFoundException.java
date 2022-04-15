package isp.lab7.safehome;

public class TenantNotFoundException extends Exception{

    public TenantNotFoundException() {
    }
    public TenantNotFoundException(String msg)
    {
        super(msg);
    }
}
