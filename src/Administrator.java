
class Administrator extends Employee {
    private int hoursWorked;

    public Administrator(String firstName, String lastName, String department, boolean isMilitary, int hoursWorked) {
        super(firstName, lastName, department, isMilitary);
        this.hoursWorked = hoursWorked;
    }

    // Реалізація методу для розрахунку зарплати на основі відпрацьованих годин
    @Override
    public double calculateSalary() {
        return hoursWorked * 50; // наприклад, 50 грн за годину
    }

    public void performDuties() {
        System.out.println("Administrator " + firstName + " is performing administrative tasks.");
    }

    public boolean isDuty() {
        return isMilitary;
    }
}