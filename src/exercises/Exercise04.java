package exercises;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public void showEmployeeData() {
        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.printf("Salary: %.2f%n", getSalary());
    }
}

public class Exercise04 {
    public static void main(String[] args) {
        Employee employee = new Employee("Ezequias", "Backend", 8500);
        employee.showEmployeeData();

        System.out.println();
        System.out.println("---- Updated data ----");
        employee.setSalary(12500);
        employee.showEmployeeData();

        System.out.println();
        System.out.println("---- Invalid update attempt ----");
        employee.setSalary(-3000);
        employee.showEmployeeData();
    }
 }