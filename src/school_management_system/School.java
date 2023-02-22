package school_management_system;

import java.util.ArrayList;

/**
 * School can have many teachers, many students
 * Implements teachers and students using ArrayList
 * This class will keep track of school funds etc
 */

public class School {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * New school object is created.
     *
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneyEarned = 0;
    }

    /**
     * @return the list of teachers in the school
     */
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     *
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return the list of students in the school
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     *
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     *
     * @param MoneyEarned money that is supposed to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Update the total money spent by the school which is the money
     * of the salary given by the school to teachers
     *
     * @param MoneySpent money spent by the school
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneySpent += MoneySpent;
    }
}