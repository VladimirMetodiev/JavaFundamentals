package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    static double calculatePower(double base, int exponent){
        double result = 0.0;
        result = Math.pow(base, exponent);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = Double.parseDouble(input.nextLine());
        int exponent = Integer.parseInt(input.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");

        double power = calculatePower(base, exponent);
        System.out.println(df.format(power));
    }
}
