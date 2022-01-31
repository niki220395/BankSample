import Exception.Alerts;

public class Account {

  private static int idGenerator;
  private int accountID = 21000 + ++idGenerator;
  private double accountBalance;
  private double overdraftLimit;

  public Account(double accountBalance, double overdraftLimit) {
    this.accountBalance = accountBalance;
    this.overdraftLimit = overdraftLimit;
  }

  public double getAccountBalance() {
    return accountBalance;
  }

  public double getOverdraftLimit() {
    return overdraftLimit;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setAccountBalance(double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public void changeAccountBalance(double sum, String typeOfTransaction) throws Alerts {
      if (typeOfTransaction.equals("addCash")) {
          accountBalance = accountBalance + sum;
      } else if (typeOfTransaction.equals("takeCash") && (accountBalance >= sum)) {
          accountBalance = accountBalance - sum;
      } else {
          throw new Alerts();
      }
  }
}
