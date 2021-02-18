package DataTypesAndVariables;

import java.util.Scanner;

public class ConvertBritishPoundsToDollars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double britishPounds = Double.parseDouble(input.nextLine());

        double dollars = britishPounds * 1.31;

        System.out.printf("%.3f", dollars);
    }
}
