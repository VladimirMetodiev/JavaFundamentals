package Strings;

import java.util.Scanner;

public class ASCIISum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char firstSymbol = input.nextLine().charAt(0);
        char secondSymbol = input.nextLine().charAt(0);
        String expression = input.nextLine();

        int number, sum = 0;

        for(int a = 0; a < expression.length(); a++){
            number = (int)expression.charAt(a);
            if((int)firstSymbol < number && number < (int)secondSymbol){
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
