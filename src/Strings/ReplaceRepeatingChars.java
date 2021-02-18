package Strings;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuilder expression = new StringBuilder(input.nextLine());

        for(int a = 0; a < expression.length() - 1; a++){
            if(expression.charAt(a) == expression.charAt(a + 1)){
                expression.replace(a, a + 1,"");
                a--;
            }
        }

        System.out.println(expression.toString());
    }
}
