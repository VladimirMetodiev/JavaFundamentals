package Strings;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuilder exp = new StringBuilder(input.nextLine());
        int length = exp.length(), strength = 0;

        for(int a = 0; a < length; a++){
            if(exp.charAt(a) == '>' && a < length - 1){
                strength += Integer.parseInt("" + (char)exp.charAt(a + 1));
                continue;
            }

            if(strength > 0){
                exp = exp.replace(a, a + 1, "");
                a--;
                length--;
                strength--;
            }
        }

        System.out.println(exp.toString());
    }
}
