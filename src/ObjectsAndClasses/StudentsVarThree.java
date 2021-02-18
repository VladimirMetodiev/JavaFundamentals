package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentsVarThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        String[] expression;
        SoftUniStudent softUniStudent = new SoftUniStudent();
        List<SoftUniStudent> allStudents = new ArrayList<>();

        for (int a = 0; a < number; a++) {
            expression = input.nextLine().split("\\s+");
            softUniStudent = new SoftUniStudent(expression[0], expression[1], Double.parseDouble(expression[2]));

            allStudents.add(a, softUniStudent);
        }

        allStudents.sort(Comparator.comparingDouble(SoftUniStudent::getGrade).reversed());

        for (int b = 0; b < allStudents.size(); b++) {
            System.out.println(allStudents.get(b).toString());
        }
    }

    static class SoftUniStudent {
        private String firstName;
        private String lastName;
        private double grade;

        public SoftUniStudent(){

        }

        public SoftUniStudent(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getLastName() {
            return this.lastName;
        }

        public Double getGrade() {
            return this.grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.getFirstName(), this.getLastName(), this.getGrade());
        }
    }
}
