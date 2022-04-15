package isp.lab5.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        Card c1 = new Card("12345", "0000");
        Card c2 = new Card("12455", "0011");
        Account a1 = new Account("Mihai", 1000, c1);
        Account a2 = new Account("Andreea", 100, c2);
        Bank bank = new Bank();
        bank.addAccount(a1);
        bank.addAccount(a2);
        System.out.println(bank.getAccountByCardId("12345"));
        ATM atm = new ATM(bank);
        atm.insertCard(c1, "0000");
        atm.withdraw(900);
        atm.checkMoney();
        atm.changePin("0000", "1234");
        System.out.println(bank.getAccounts());
         
         

    }
}
