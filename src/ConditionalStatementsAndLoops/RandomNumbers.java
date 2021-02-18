package ConditionalStatementsAndLoops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        Random rnd = new Random();

        for (int a = 0; a < number; a++) {
            System.out.print(rnd.nextInt(number) + " ");
        }
    }
}
