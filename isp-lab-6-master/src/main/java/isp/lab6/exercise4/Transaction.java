package isp.lab6.exercise4;

abstract class Transaction {

    protected Account account;

    public Transaction(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    abstract String execute();
}
