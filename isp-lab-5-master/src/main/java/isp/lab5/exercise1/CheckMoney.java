package isp.lab5.exercise1;

public class CheckMoney extends Transaction {

    @Override
    public String execute() {
        return Double.toString(account.getBalance());

    }

}
