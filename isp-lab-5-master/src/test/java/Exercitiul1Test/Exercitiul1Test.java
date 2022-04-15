package Exercitiul1Test;
import isp.lab5.exercise1.ATM;
import isp.lab5.exercise1.Account;
import isp.lab5.exercise1.Card;
import isp.lab5.exercise1.Bank;
import org.junit.Test;

import junit.framework.Assert;

public class Exercitiul1Test {
    @Test
    public void testInsertCard(){
         Card c1 = new Card("1456", "1234");
         Account a1 = new Account("Andra", 200, c1);
         Bank bank = new Bank();
         bank.addAccount(a1);
         ATM atm = new ATM(bank);
         Assert.assertEquals("Should display true",true,atm.insertCard(c1, "1234"));
    }
    @Test
    public void testChangePin(){
        Card c1 = new Card("1456", "1234");
         Account a1 = new Account("Andra", 200, c1);
         Bank bank = new Bank();
         bank.addAccount(a1);
         ATM atm = new ATM(bank);
          atm.insertCard(c1, "1234");
         atm.changePin("1234", "0000");
         Assert.assertEquals("Should display 0000","0000",c1.getPin());
    }
    
    
}
