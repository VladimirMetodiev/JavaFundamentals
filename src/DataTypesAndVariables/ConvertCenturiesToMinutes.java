package DataTypesAndVariables;

import java.util.Scanner;

public class ConvertCenturiesToMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long centuries = Long.parseLong(input.nextLine());
        long years = centuries * 100;
        long days = (long)(years * 365.2422);
        long hours = days * 24;
        long minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes", centuries, years, days, hours, minutes);
    }
}
