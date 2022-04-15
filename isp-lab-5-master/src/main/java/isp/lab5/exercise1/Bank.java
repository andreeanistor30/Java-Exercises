package isp.lab5.exercise1;

import java.util.*;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<Account>(10);

    public Bank() {
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public String executeTransaction(Transaction transaction) {
        return transaction.execute();
    }

    public Account getAccountByCardId(String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getCard().getCardId() == cardId) {
                return accounts.get(i);
            }
        }
        return null;
    }

}
