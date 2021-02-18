package BasicSyntax;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DebitCardNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0000.#");

        int num1 = Integer.parseInt(input.nextLine());
        int num2 = Integer.parseInt(input.nextLine());
        int num3 = Integer.parseInt(input.nextLine());
        int num4 = Integer.parseInt(input.nextLine());

        System.out.println(df.format(num1) + " " + df.format(num2) + " " + df.format(num3) + " " + df.format(num4));
    }
}
