package isp.lab7.safehome;

import java.time.LocalDateTime;

public class AccessLog {

    private String tenantName;
    private String operation;
    private DoorStatus doorStatus;
    private String errorrMessage;
    private LocalDateTime dateTime;

    public AccessLog() {
    }

    public AccessLog(String tenantName, String operation, DoorStatus doorStatus, String errorrMessage) {
        this.tenantName = tenantName;
        this.operation = operation;
        this.doorStatus = doorStatus;
        this.errorrMessage = errorrMessage;
    }

    public AccessLog(String tenantName, String operation, DoorStatus doorStatus, String errorrMessage, LocalDateTime dateTime) {
        this.tenantName = tenantName;
        this.operation = operation;
        this.doorStatus = doorStatus;
        this.errorrMessage = errorrMessage;
        this.dateTime = dateTime;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public String getErrorrMessage() {
        return errorrMessage;
    }

    public String getOperation() {
        return operation;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setErrorrMessage(String errorrMessage) {
        this.errorrMessage = errorrMessage;
    }

    @Override
    public String toString() {
        return "AccessLog{" + "tenantName=" + tenantName + ", operation=" + operation + ", doorStatus=" + doorStatus + ", errorrMessage=" + errorrMessage + ", dateTime=" + dateTime + '}' ;
    }

}
