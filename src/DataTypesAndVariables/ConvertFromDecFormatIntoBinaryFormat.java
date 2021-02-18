package DataTypesAndVariables;

import java.util.Scanner;

public class ConvertFromDecFormatIntoBinaryFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decNum = Integer.parseInt(input.nextLine());
        String binaryNum = Integer.toBinaryString(decNum);
        System.out.println(binaryNum);
    }
}
