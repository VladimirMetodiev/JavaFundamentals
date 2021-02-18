package DataTypesAndVariables;

import java.util.Scanner;

public class ConcatenationOfNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName = input.nextLine();
        String lastName = input.nextLine();
        String delimiter = input.nextLine();

        System.out.println(firstName + delimiter + lastName);
    }
}
