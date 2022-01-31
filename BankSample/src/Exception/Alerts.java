package Exception;

public class Alerts extends  Exception {
    private String alert1 = "You donot have enough money on your account !";
    private String alert2 = "Transfer collection is empty !";

    public String getAlert1() {
        return alert1;
    }
    public String getAlert2() {
        return alert2;
    }
}
