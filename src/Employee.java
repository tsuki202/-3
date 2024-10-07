abstract class Employee {
    protected static String firstName;
    protected String lastName;
    protected String department;
    protected boolean isMilitary;

    public Employee(String firstName, String lastName, String department, boolean isMilitary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.isMilitary = isMilitary;
    }

    // Абстрактний метод для розрахунку зарплати
    public abstract double calculateSalary();
}