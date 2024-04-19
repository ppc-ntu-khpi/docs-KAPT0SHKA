package domain;
public class Employee {

    /**
     * Перевизначений метод toString().
     * Повертає рядкове представлення об'єкта Employee.
     *
     * @return рядкове представлення об'єкта Employee
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Конструктор класу Employee з параметрами.
     *
     * @param name ім'я працівника
     * @param jobTitle посада працівника
     * @param level рівень працівника
     * @param dept відділ, до якого належить працівник
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор класу Employee з параметрами за замовчуванням.
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Встановлює посаду працівника.
     *
     * @param job посада працівника
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Отримує посаду працівника.
     *
     * @return посада працівника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Отримує ім'я працівника.
     *
     * @return ім'я працівника
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника.
     *
     * @param level рівень працівника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Отримує рівень працівника.
     *
     * @return рівень працівника
     */
    public int getLevel() {
        return level;
    }

    /**
     * Отримує відділ, до якого належить працівник.
     *
     * @return відділ, до якого належить працівник
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ, до якого належить працівник.
     *
     * @param dept відділ, до якого належить працівник
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я працівника.
     *
     * @param name ім'я працівника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
