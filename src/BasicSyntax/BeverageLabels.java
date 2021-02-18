package BasicSyntax;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BeverageLabels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.#");

        String name = input.nextLine();
        int volume = Integer.parseInt(input.nextLine());
        int energyContent = Integer.parseInt(input.nextLine());
        int sugarContent = Integer.parseInt(input.nextLine());

        double kKal = volume / 100.0 * energyContent;
        double gSugar = volume / 100.0 * sugarContent;

        System.out.printf("%dml %s: %n", volume, name);
        System.out.println(df.format(kKal) + "kcal, " + df.format(gSugar) + "g sugars");
    }
}



