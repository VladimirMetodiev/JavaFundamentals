package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    static void determineOnAPalindrome(String number){
        int a = 0, b = 0;
        boolean isTheNumberAPalindrome = true;

        for(int z = 0; z < number.length() / 2; z++){
            a = Integer.parseInt("" + number.charAt(z));
            b = Integer.parseInt("" + number.charAt(number.length() - 1 - z));
            if(a != b){
                isTheNumberAPalindrome = false;
                System.out.printf("%b%n", isTheNumberAPalindrome);
                break;
            }
        }

        if(isTheNumberAPalindrome == true){
            System.out.printf("%b%n", isTheNumberAPalindrome);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String command = "";

        while(!(command = input.nextLine().toUpperCase()).equals("END")){
            determineOnAPalindrome(command);
        }
    }
}
