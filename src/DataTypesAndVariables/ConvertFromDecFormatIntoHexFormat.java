package DataTypesAndVariables;

import java.util.Scanner;

public class ConvertFromDecFormatIntoHexFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decNum = Integer.parseInt(input.nextLine());
        String hexNum = Integer.toHexString(decNum).toUpperCase();
        System.out.println(hexNum);
    }
}
