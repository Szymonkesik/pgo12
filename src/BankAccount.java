import java.util.ArrayList;
import java.util.List;

public class BankAccount implements AccountOperations {
    private double balance;
    private List<Transaction> transactions;

    public BankAccount() {
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public void transfer(double amount, BankAccount targetAccount) throws AccountOperationException {
        if (amount <= 0) {
            throw new AccountOperationException("Amount must be greater than zero.");
        }
        if (this.balance < amount) {
            throw new AccountOperationException("Insufficient funds.");
        }
        this.balance -= amount;
        targetAccount.deposit(amount);
        Transaction transaction = new Transaction(amount, this, targetAccount);
        this.transactions.add(transaction);
        targetAccount.addTransaction(transaction);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            Transaction transaction = new Transaction(amount, null, this);
            this.transactions.add(transaction);
        }
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return this.transactions;
    }
}