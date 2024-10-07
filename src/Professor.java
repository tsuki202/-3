class Professor extends Employee {
    private int numberOfLectures;

    public Professor(String firstName, String lastName, String department, boolean isMilitary, int numberOfLectures) {
        super(firstName, lastName, department, isMilitary);
        this.numberOfLectures = numberOfLectures;
    }

    // Реалізація методу для розрахунку зарплати на основі кількості лекцій
    @Override
    public double calculateSalary() {
        return numberOfLectures * 100; // наприклад, 100 грн за лекцію
    }

    public void performDuties() {
        System.out.println("Professor " + firstName + " is teaching lectures.");
    }

    public boolean isDuty() {
        return isMilitary;
    }
}