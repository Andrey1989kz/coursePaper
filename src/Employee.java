public class Employee {
    private static int Counter;
    private String name;
    private int department;
    private int salary;
    private int id;

    public String getName() {
        return this.name;
    }
    public int getDepartment() {
        return this.department;
    }
    public int getSalary() {
        return this.salary;
    }
    public int getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = ++Counter;
    }
    @Override
    public String toString() {
        return "id - " + id + ".  ФИО сотрудника: " + name + ". Отдел: " + department +
                ". Зарплата: " + salary + "₽";
    }
}
