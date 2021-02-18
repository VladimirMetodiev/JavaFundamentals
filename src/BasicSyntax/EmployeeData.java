package BasicSyntax;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00000000.#");

        String name = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        int employeeID = Integer.parseInt(input.nextLine());
        double salary = Double.parseDouble(input.nextLine());

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.println("Employee ID: " + df.format(employeeID));
        System.out.printf("Salary: %.2f", salary);
    }
}
