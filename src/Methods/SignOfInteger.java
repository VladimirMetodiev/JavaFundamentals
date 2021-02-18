package Methods;

import java.util.Scanner;

public class SignOfInteger {
    static void specifyASignOfNumber(int num){
        if(num > 0){
            System.out.printf("The number %d is positive.", num);
        }
        else if(num < 0){
            System.out.printf("The number %d is negative.", num);
        }
        else{
            System.out.printf("The number %d is zero.", num);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        specifyASignOfNumber(number);
    }
}
