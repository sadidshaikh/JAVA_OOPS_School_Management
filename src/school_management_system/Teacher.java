package school_management_system;

/*
 * This class is responsible for keeping the track of teachers id, name and salary.
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create a new Teacher object.
     *
     * @param id     id for the teacher
     * @param name   name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * @return id of the teacher
     */
    public int getId() {
        return id;
    }

    /**
     * @return name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     * @return the salary of the teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Set the salary
     *
     * @param salary new salary of the teacher
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the salary earned by teacher
     */
    public int getSalaryEarned() {
        return salaryEarned;
    }

    /**
     * Teacher receives salary and school spends money
     *
     * @param salary received by the teacher
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", salaryEarned=" + salaryEarned +
                '}';
    }
}
