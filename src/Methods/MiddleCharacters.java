package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    static void getAMiddleCharacter(String exp){
        int length = exp.length();
        if(length % 2 == 0){
            System.out.println("" + exp.charAt((length / 2) - 1) + exp.charAt((length / 2)));
        }
        else{
            System.out.println(exp.charAt(length / 2));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        getAMiddleCharacter(expression);
    }
}
