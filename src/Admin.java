import java.util.ArrayList;
import java.util.List;

public class Admin extends Employee {
    private List<Employee> employees;

    public Admin(String firstName, String lastName) {
        super(firstName, lastName);
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}