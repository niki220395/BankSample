import Exception.Alerts;
import java.util.LinkedList;

public class Bank {

  private Account bankAccount;
  private LinkedList<Transfer> transferCollection;

  public Bank(Account bankAccount) {
    this.bankAccount = bankAccount;
    transferCollection = new LinkedList<>();
  }

  public void addTransfer(Transfer transfer) {
    transferCollection.add(transfer);
  }

  public Transfer takeTransfer() throws Alerts {
    return transferCollection.removeFirst();
  }

  @Override
  public String toString() {
    String txt = "";
    for (int i = 0; i < transferCollection.size(); i++) {
      txt += transferCollection.get(i).toString() + "\n";
    }
    return "Bank Account Balance: " + bankAccount.getAccountBalance() + "\n" + txt;
  }
}


