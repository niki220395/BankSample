import Exception.Alerts;

public class Credit extends Transfer {

  public Credit(Account payer, Account payee, double ammountOfMoneyForTransfer, Date transferDate) {
    super(payer, payee, ammountOfMoneyForTransfer, transferDate);
  }

  public String typeOfTransfer() {
    return "Credit";
  }

  public void transferringMoney() throws Alerts {
    payee.changeAccountBalance(getAmountOfMoney() * 0.95, "addCash");
    payer.changeAccountBalance(getAmountOfMoney(), "takeCash");
  }

  @Override
  public String toString() {
    return super.toString() + "[" + getAmountOfMoney() + "]";
  }
}