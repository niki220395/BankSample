import Exception.Alerts;

public abstract class Transfer implements Cloneable {

  private static int idGenerator = 0;
  protected Account payee;
  protected Account payer;
  private int transferID = ++idGenerator;

  private double amountOfMoneyForTransfer;
  private Date transferDate;

  public Transfer(Account payer, Account payee, double ammountOfMoneyForTransfer,
      Date transferDate) {
    this.payee = payee;
    this.payer = payer;
    this.transferDate = transferDate;
    this.amountOfMoneyForTransfer = ammountOfMoneyForTransfer;
  }

  public int getTransferID() {
    return transferID;
  }

  public double getAmountOfMoney() {
    return amountOfMoneyForTransfer;
  }

  public void setAmountOfMoney(double ammountOfMoneyForTransfer) {
    this.amountOfMoneyForTransfer = ammountOfMoneyForTransfer;
  }

  public Date getTransferDate() {
    return transferDate;
  }

  public void setTransferDate(Date transferDate) {
    this.transferDate = transferDate;
  }

  public abstract String typeOfTransfer();

  public abstract void transferringMoney() throws Alerts;

  public Transfer clone() throws CloneNotSupportedException {
    Transfer cloneOfTransfer = null;
    try {
      cloneOfTransfer = (Transfer) super.clone();
      cloneOfTransfer.transferID = ++idGenerator;
      cloneOfTransfer.transferDate = new Date(transferDate.getDay(), transferDate.getMonth(),
          transferDate.getYear());

    } catch (CloneNotSupportedException cloneNotSupportedException) {
      cloneNotSupportedException.printStackTrace();
    }
    return cloneOfTransfer;
  }

  @Override
  public String toString() {
    return typeOfTransfer() + "/" + transferDate + "/" + transferID;
  }
}
