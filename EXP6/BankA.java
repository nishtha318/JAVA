class BankA extends Bank {
    private double balance = 100;

    @Override
    void getBalance() {
        System.out.println("Balance in Bank A: $" + balance);
    }
}
