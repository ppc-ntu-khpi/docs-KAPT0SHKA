package domain;

public class Artist extends Employee {

    /**
     * Конструктор класу Artist з параметрами.
     *
     * @param skills масив рядків, що представляє навичності артиста
     * @param name ім'я артиста
     * @param jobTitle посада артиста
     * @param level рівень артиста
     * @param dept відділ, до якого належить артист
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Конструктор класу Artist з навичностями.
     *
     * @param skills масив рядків, що представляє навичності артиста
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }
    
    /**
     * Конструктор класу Artist з параметрами за замовчуванням.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Перевизначений метод toString().
     * Повертає рядкове представлення об'єкта Artist.
     *
     * @return рядкове представлення об'єкта Artist
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skills;

    /**
     * Отримує навичності артиста.
     *
     * @return рядок, що містить навичності артиста
     */
    public String getSkills() {
        String s = "";
        for (String e : skills) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює навичності артиста.
     *
     * @param skills масив рядків, що представляє навичності артиста
     */
    public void setSkills(String[] skills) {
        this.skills=skills;
    }

    /**
     * Отримує навичності артиста у форматі масиву рядків.
     *
     * @return масив рядків, що містить навичності артиста
     */
    public String[] getSkillsList() {
        return skills;
    }
}
