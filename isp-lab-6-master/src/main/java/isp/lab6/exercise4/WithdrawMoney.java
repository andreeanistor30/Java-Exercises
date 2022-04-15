package isp.lab6.exercise4;

public class WithdrawMoney extends Transaction {

    public double amount;

    public WithdrawMoney(double amount, Account account) {
        super(account);
        this.amount = amount;

    }

    @Override
    public String execute() {
        if (account.getBalance() > amount) {
            account.setBalance((account.getBalance() - amount));
            System.out.println("Transaction executed");
        }
        return "Executed";

    }
}
