package domain;
public class Manager extends Employee {

    /**
     * Конструктор класу Manager з параметрами.
     *
     * @param employees масив працівників, яким керує менеджер
     * @param name ім'я менеджера
     * @param jobTitle посада менеджера
     * @param level рівень менеджера
     * @param dept відділ, до якого належить менеджер
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Перевизначений метод toString().
     * Повертає рядкове представлення об'єкта Manager.
     *
     * @return рядкове представлення об'єкта Manager
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Конструктор класу Manager з параметрами за замовчуванням.
     *
     * @param employees масив працівників, яким керує менеджер
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Конструктор класу Manager з параметрами за замовчуванням.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Отримує рядок, що містить імена працівників, яким керує менеджер.
     *
     * @return рядок, що містить імена працівників, яким керує менеджер
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює працівників, яким керує менеджер.
     *
     * @param employees масив працівників, яким керує менеджер
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Отримує масив працівників, яким керує менеджер.
     *
     * @return масив працівників, яким керує менеджер
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
