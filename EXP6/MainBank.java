public class MainBank {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}
