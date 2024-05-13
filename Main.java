class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Salary (with bonus): $" + getSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("John Doe", 1001, 50000);

        // Displaying Employee details
        System.out.println("Employee Details:");
        employee.displayDetails();

        // Creating a DevOpsEngineer object
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("Alice Smith", 1002, 60000, 5000);

        // Displaying DevOpsEngineer details
        System.out.println("\nDevOps Engineer Details:");
        devOpsEngineer.displayDetails();
    }
}