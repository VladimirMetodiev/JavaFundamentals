package BasicSyntax;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double miles = Double.parseDouble(input.nextLine());

        double kilometers = miles * 1.60934;

        System.out.printf("%.2f", kilometers);
    }
}
