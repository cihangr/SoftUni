package InterfaceAndAbstraction.Interface;

public class Main {
    public static void main(String[] args) {
        Payable payable = new CreditCardPay();
        Payable payable1 = new MoneyTransfer();

        payable.pay();
        payable1.pay();
    }
}
