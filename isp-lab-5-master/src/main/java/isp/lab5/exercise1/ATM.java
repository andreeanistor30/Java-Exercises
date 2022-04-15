package isp.lab5.exercise1;

public class ATM {

    private Bank bank;
    private Card card;

    public ATM(Bank bank, Card card) {
        this.bank = bank;
        this.card = card;
    }

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void changePin(String oldPin, String newPin) {
        Account acc = bank.getAccountByCardId(card.getCardId());
        Transaction transaction = new ChangePin(oldPin, newPin, acc);
        if (oldPin == card.getPin()) {
            card.setPin(newPin);
        }

    }

    public void withdraw(double amount) {
        if (card != null) {
            Account acc = bank.getAccountByCardId(card.getCardId());
            Transaction tw = new WithdrawMoney(amount, acc);
            System.out.println(acc);
            bank.executeTransaction(tw);

        } else {
            System.out.println("No card present.");
        }
    }

    public void checkMoney() {
        if (card != null) {
            Account acc = bank.getAccountByCardId(card.getCardId());
            System.out.println(acc.getBalance());
        } else {
            System.out.println("This card doesn't exist");
        }
    }

    public boolean insertCard(Card c, String pin) {
        if (c != null) {
            if (c.getPin().equals(pin)) { 
                card = c;
                return true;
               
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void removeCard() {
        card = null;
    }

}
