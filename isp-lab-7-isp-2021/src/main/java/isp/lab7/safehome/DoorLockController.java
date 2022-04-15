package isp.lab7.safehome;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DoorLockController implements ControllerInterface {

    private HashMap<Tenant, AccessKey> validAccess;
    private Door door;
    private List<AccessLog> list;
    private int numberOfTries;

    public DoorLockController() {
        validAccess = new HashMap<Tenant, AccessKey>();
        door = new Door();
        list = new ArrayList<AccessLog>();
    }

    @Override

    public void addTenant(String pin, String name) throws TenantAlreadyExistsException {
        AccessLog accessLog = new AccessLog(name, "add", door.getStatus(), null, LocalDateTime.now());
        for (Tenant tenant : validAccess.keySet()) {
            if (name.equals(tenant.getName())) {
                accessLog.setErrorrMessage("Eror!");
                list.add(accessLog);
                throw new TenantAlreadyExistsException("Error!");
            }

        }
        list.add(accessLog);
        Tenant tenant = new Tenant(name);
        AccessKey accesKey = new AccessKey(pin);
        validAccess.put(tenant, accesKey);

    }

    @Override
    public DoorStatus enterPin(String pin) throws InvalidPinException, TooManyAttemptsException {
        if (pin.equals(ControllerInterface.MASTER_KEY)) {
            numberOfTries = 0;
            door.unlockDoor();
            return DoorStatus.OPEN;
        }
        if (numberOfTries < 3) {
            for (AccessKey a : validAccess.values()) {
                if (pin.equals(a.getPin())) {
                    if (door.getStatus() == DoorStatus.CLOSE) {
                        door.unlockDoor();
                        return DoorStatus.OPEN;
                    } else {
                        door.lockDoor();
                        return DoorStatus.CLOSE;
                    }
                }
            }
        }
        numberOfTries++;
        if (numberOfTries >= 3) {
            door.lockDoor();
            throw new TooManyAttemptsException("TooManyAttemptsException") ;
        }
        throw new InvalidPinException("Invalid pin");
    }

    @Override
    public void removeTenant(String name) throws TenantNotFoundException {
        AccessLog accessLog = new AccessLog(name, "remove", door.getStatus(), null, LocalDateTime.now());
        boolean ok = true;
        for (Tenant tenant : validAccess.keySet()) {
            if (name.equals(tenant.getName())) {
                ok = false;
            }
        }
        Tenant tenant = new Tenant(name);
        if (ok == false) {
            validAccess.remove(tenant);
            list.add(accessLog);
        } else {
            accessLog.setErrorrMessage("Tenant not found");
            list.add(accessLog);
            throw new TenantNotFoundException("Tenant not found");
        }

    }

    public List<AccessLog> getAcccessLogs() {
        return list;

    }

    @Override
    public String toString() {
        return "DoorLockController{" + "validAccess=" + validAccess + '}';
    }

}
