public class Employee extends User {
    private static int employeeCounter = 0;
    private int employeeId;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.employeeId = ++employeeCounter;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Client addClient(String firstName, String lastName) {
        return new Client(firstName, lastName);
    }

    public void acceptDeposit(BankAccount account, double amount) {
        account.deposit(amount);
    }
}