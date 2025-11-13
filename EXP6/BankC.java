class BankC extends Bank {
    private double balance = 200;

    @Override
    void getBalance() {
        System.out.println("Balance in Bank C: $" + balance);
    }
}
