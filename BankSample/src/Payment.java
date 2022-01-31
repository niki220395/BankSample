import Exception.Alerts;

public class Payment extends Transfer {

  public Payment(Account payer, Account payee, double amountOfMoneyForTransfer,
      Date transferDate) {
    super(payer, payee, amountOfMoneyForTransfer, transferDate);
  }

  public String typeOfTransfer() {
    return "Payment";
  }

  public void transferringMoney() throws Alerts {
    payer.changeAccountBalance((getAmountOfMoney() * 1.01), "takeCash");
    payee.changeAccountBalance(getAmountOfMoney(), "addCash");
  }

  @Override
  public String toString() {
    return super.toString() + "[Provision:" + getAmountOfMoney() * 0.01 + "]";
  }
}

