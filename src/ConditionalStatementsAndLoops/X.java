package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oddNumber = Integer.parseInt(input.nextLine());

        for (int upRows = 0; upRows < oddNumber / 2; upRows++) {
            for (int leftUpSpace = 0; leftUpSpace < upRows; leftUpSpace++) {
                System.out.print(" ");
            }
            System.out.print("x");
            for (int middleUp = oddNumber - upRows - 2; middleUp > upRows; middleUp--) {
                System.out.print(" ");
            }
            System.out.println("x");
        }
        for (int middleSpace = 0; middleSpace < oddNumber /2; middleSpace++){
            System.out.print(" ");
        }
        System.out.println("x");
        for (int downRows = 0; downRows < oddNumber / 2; downRows++) {
            for (int leftDownSpace = oddNumber / 2 - downRows - 1; leftDownSpace > 0; leftDownSpace--) {
                System.out.print(" ");
            }
            System.out.print("x");
            for (int downMiddle = 0; downMiddle < 2 * downRows + 1; downMiddle++) {
                System.out.print(" ");
            }
            System.out.println("x");
        }

    }
}
