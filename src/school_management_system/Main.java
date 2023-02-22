package school_management_system;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher mac = new Teacher(1, "Mac", 500);
        Teacher arthur = new Teacher(2, "Arthur", 700);
        Teacher rachel = new Teacher(3, "Rachel", 600);

        ArrayList<Teacher> teachersList = new ArrayList<>();
        teachersList.add(mac);
        teachersList.add(arthur);
        teachersList.add(rachel);

        Student john = new Student(1, "John", 4);
        Student rakshit = new Student(2, "Rakshit Vasudev", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(john);
        studentsList.add(rakshit);
        studentsList.add(rabbi);

        School ghs = new School(teachersList, studentsList);

        System.out.println("\n--------Students paying some fees---------");
        john.payFees(11000);
        System.out.println("Fees paid by John up until now is " + john.getFeesPaid());
        rakshit.payFees(1250);
        System.out.println("Fees paid by Rakshit up until now is " + rakshit.getFeesPaid());
        System.out.format("GHS has earned $%d\n", ghs.getTotalMoneyEarned());

        System.out.println("\n--------Making GHS pay teachers salary---------");
        mac.receiveSalary(500);
        System.out.format("Salary earned by teacher Mac is $%d\n", mac.getSalaryEarned());
        System.out.format("GHS has spent $%d\n\n", ghs.getTotalMoneySpent());
        System.out.format("Total current funds of GHS are $%d\n\n",
                ghs.getTotalMoneyEarned() - ghs.getTotalMoneySpent());

        System.out.println(rakshit);
        System.out.println(mac);
    }
}