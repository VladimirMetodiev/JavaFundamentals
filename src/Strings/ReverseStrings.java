package Strings;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String expression, reversedExpression = "", result;

        while(!(expression = input.nextLine()).equals("end")){
            for(int a = expression.length() - 1; a >= 0; a--){
                reversedExpression = reversedExpression + expression.charAt(a);
            }
            result = String.join(" = ", expression, reversedExpression);
            System.out.println(result);
            reversedExpression = "";
        }
    }
}
