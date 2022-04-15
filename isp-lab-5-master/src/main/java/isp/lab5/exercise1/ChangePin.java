package isp.lab5.exercise1;

public class ChangePin extends Transaction {

    public String oldPin;
    public String newPin;

    public ChangePin(String oldPin, String newPin, Account acc) {
        super(acc);
        this.oldPin = oldPin;
        this.newPin = newPin;
    }

    public String getNewPin() {
        return newPin;
    }

    public String getOldPin() {
        return oldPin;
    }

    public void setOldPin(String oldPin) {
        this.oldPin = oldPin;
    }

    @Override
    public String execute() {
        if (oldPin != newPin) {
            return "Executed";
        }
        return null;
    }

}
