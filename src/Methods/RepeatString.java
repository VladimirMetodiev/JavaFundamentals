package Methods;

import java.util.Scanner;

public class RepeatString {
    static void repeatExpression(String exp, int num){
        for(int a = 1; a <= num; a++){
            System.out.print(exp);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        int number = Integer.parseInt(input.nextLine());

        repeatExpression(expression, number);
    }
}
