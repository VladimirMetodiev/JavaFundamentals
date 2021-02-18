package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    static int getLength(int a){
        String expression = "" + a;
        int expressionLength = expression.length();
        return expressionLength;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());
        int addend;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int length = getLength(i);
            int num = i;

            for (int j = 1; j <= length; j++) {
                addend = num % 10;
                num /= 10;
                sum += addend;
            }

            if(sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True%n", i);
            }
            else{
                System.out.printf("%d -> False%n", i);
            }
            sum = 0;
        }
    }
}
