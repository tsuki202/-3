public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Іван", "Петренко", "Кафедра математики", false, 20);
        Administrator administrator = new Administrator("Олена", "Коваль", "Кафедра адміністрації", true, 160);

        // Розрахунок зарплати
        System.out.println(professor.firstName + " salary: " + professor.calculateSalary());
        System.out.println(administrator.firstName + " salary: " + administrator.calculateSalary());

        // Виконання обов'язків
        professor.performDuties();
        administrator.performDuties();

        // Перевірка військової служби
        System.out.println(professor.firstName + " on duty: " + professor.isDuty());
        System.out.println(administrator.firstName + " on duty: " + administrator.isDuty());
    }
}