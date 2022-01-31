import Exception.Alerts;

public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {
    Account user1 = new Account(500, 1000);
    Account user2 = new Account(150, 500);
    Account bankAcc = new Account(100000, 1000000);
    Bank uniCreditBank = new Bank(bankAcc);
    Transfer transfer1 = new Credit(user1, bankAcc, 4000, new Date(12, 3, 2021));
    Transfer transfer2 = new Payment(user2, bankAcc, 100, new Date(12, 2, 2020));
    Payment paymentClone = (Payment) transfer2.clone();
    uniCreditBank.addTransfer(transfer1);
    uniCreditBank.addTransfer(transfer2);
    uniCreditBank.addTransfer(paymentClone);
    System.out.println(uniCreditBank);

    try {
      transfer1.transferringMoney();
      transfer2.transferringMoney();
    } catch (Alerts alerts) {
      System.out.println(alerts.getAlert1());
    }
    System.out.println(uniCreditBank);

  }
}
