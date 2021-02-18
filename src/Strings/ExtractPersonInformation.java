package Strings;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        String expression, name = "";
        int startPositionOfName, endPositionOfName, startPositionOfAge, endPositionOfAge, age = 0;

        for(int a = 0; a < number; a++){
            expression = input.nextLine();

            startPositionOfName = expression.indexOf("@") + 1;
            endPositionOfName = expression.indexOf("|");
            startPositionOfAge = expression.indexOf("#") + 1;
            endPositionOfAge = expression.indexOf("*");

            name = expression.substring(startPositionOfName, endPositionOfName);
            age = Integer.parseInt(expression.substring(startPositionOfAge, endPositionOfAge));

            System.out.printf("%s is %d years old.%n", name, age);
        }
    }
}
