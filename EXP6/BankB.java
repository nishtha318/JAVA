class BankB extends Bank {
    private double balance = 150;

    @Override
    void getBalance() {
        System.out.println("Balance in Bank B: $" + balance);
    }
}
