public class Main {
    public static void maxAndMin(Employee[] employee) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < employee[min].getSalary()) {
                min = i;
                System.out.println("Минимальная зарплата: " + employee[i].getSalary() + "₽ - " + employee[i].getName());
            } else if (employee[i].getSalary() > employee[max].getSalary()) {
                max = i;
                System.out.println("Максимальная зарплпта: " + employee[i].getSalary() + "₽ - " + employee[i].getName());
            }
        }
    }

    public static void fullListOfEmployee(Employee[] employee) {
        for (Employee x : employee) {
            System.out.println(x);
        }
    }

    public static void nameEmployee(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName());
        }

    }

    public static void monthlyAmountSalary(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        System.out.println(sum + "₽: Сумма затрат на зарплаты в месяц.");
    }

    public static void averageSalary(Employee[] employee) {
        int x = 0;
        for (int i = 0; i < employee.length; i++) {
            x += employee[i].getSalary() / 10;
        }
        System.out.println(x + "₽ : Средняя зарплата.");
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Пушкин Александр Сергеевич", 2, 50_000);
        employee[1] = new Employee("Фет Афанасий Афанасьевич", 1, 1_510_000);
        employee[2] = new Employee("Лермонтов Михаил Юрьевич", 3, 410_000);
        employee[3] = new Employee("Некрасов Николай Алексеевич", 4, 30_000);
        employee[4] = new Employee("Чехов Антон Павлович", 5, 100_000);
        employee[5] = new Employee("Достоевский Федор Михайлович", 1, 110_000);
        employee[6] = new Employee("Грибоедов Александр Сергеевич", 2, 111_000);
        employee[7] = new Employee("Тютчев Федор Иванович", 3, 130_000);
        employee[8] = new Employee("Гоголь Николай Васильевич", 4, 140_000);
        employee[9] = new Employee("Толстой Лев Николаевич", 5, 150_000);


        fullListOfEmployee(employee);
        nameEmployee(employee);
        monthlyAmountSalary(employee);
        averageSalary(employee);
        maxAndMin(employee);

    }
}