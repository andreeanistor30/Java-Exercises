package isp.lab6.exercise4;

public class CheckMoney extends Transaction {

    @Override
    public String execute() {
        return Double.toString(account.getBalance());

    }

}
