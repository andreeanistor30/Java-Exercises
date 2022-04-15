package isp.lab6.exercise4;

public class Account {

    private String owner;
    private double balance;
    private Card card;

    public Account(String owner, double balance, Card card) {
        this.owner = owner;
        this.balance = balance;
        this.card = card;
    }

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Card getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "Account{" + "owner=" + owner + ", balance=" + balance + ", card=" + card + '}';
    }

}
