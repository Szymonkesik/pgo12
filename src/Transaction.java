public class Transaction {
    private double amount;
    private BankAccount sourceAccount;
    private BankAccount targetAccount;

    public Transaction(double amount, BankAccount sourceAccount, BankAccount targetAccount) {
        this.amount = amount;
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
    }

    public double getAmount() {
        return amount;
    }

    public BankAccount getSourceAccount() {
        return sourceAccount;
    }

    public BankAccount getTargetAccount() {
        return targetAccount;
    }
}