package isp.lab7.safehome;

public class Door {
    private DoorStatus status = DoorStatus.CLOSE;
    
    public void lockDoor()
    {
        status=DoorStatus.CLOSE ;
    }
    public void unlockDoor()
    {
        status=DoorStatus.OPEN;
    }

    public DoorStatus getStatus() {
        return status;
    }

    public void setStatus(DoorStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Door{" + "status=" + status + '}';
    }
    
}
