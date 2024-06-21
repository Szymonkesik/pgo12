public interface AccountOperations {
    double checkBalance();
    void transfer(double amount, BankAccount targetAccount) throws AccountOperationException;
    void deposit(double amount);
}