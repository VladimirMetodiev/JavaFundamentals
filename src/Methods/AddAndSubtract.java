package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    static int addNumbers(int a, int b){
        return a + b;
    }
    static int subtractNumbers(int c, int d){
        return c - d;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = Integer.parseInt(input.nextLine());
        int second = Integer.parseInt(input.nextLine());
        int third = Integer.parseInt(input.nextLine());

        int addition = addNumbers(first, second);
        int subtraction = subtractNumbers(addition, third);

        System.out.println(subtraction);
    }
}
