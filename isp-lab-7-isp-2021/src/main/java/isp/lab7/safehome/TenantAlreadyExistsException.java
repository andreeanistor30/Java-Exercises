
package isp.lab7.safehome;

class TenantAlreadyExistsException extends Exception{

    public TenantAlreadyExistsException() {
    }
    public TenantAlreadyExistsException(String msg) {
      super(msg);
    }
    
    
}
