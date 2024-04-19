package domain;
public class Editor extends Artist {

    /**
     * Конструктор класу Editor з параметрами.
     *
     * @param electronicEditing логічне значення, яке вказує, чи використовує редактор електронне редагування
     * @param skills масив рядків, що представляє навичності редактора
     * @param name ім'я редактора
     * @param jobTitle посада редактора
     * @param level рівень редактора
     * @param dept відділ, до якого належить редактор
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу Editor з навичностями.
     *
     * @param electronicEditing логічне значення, яке вказує, чи використовує редактор електронне редагування
     * @param skills масив рядків, що представляє навичності редактора
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу Editor з параметрами за замовчуванням.
     *
     * @param electronicEditing логічне значення, яке вказує, чи використовує редактор електронне редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Конструктор класу Editor з параметрами за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Перевизначений метод toString().
     * Повертає рядкове представлення об'єкта Editor.
     *
     * @return рядкове представлення об'єкта Editor
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Отримує вподобання редактора щодо редагування.
     *
     * @return логічне значення, яке вказує, чи використовує редактор електронне редагування
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює вподобання редактора щодо редагування.
     *
     * @param electronic логічне значення, яке вказує, чи використовує редактор електронне редагування
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
