package BasicSyntax;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        float grate = Float.parseFloat(input.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grate);
    }
}
