package DataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        char letter;
        int sum = 0;

        for(int a = 0; a < number; a++){
            letter = input.nextLine().charAt(0);
            sum += (int)letter;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
