package DataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char letter = input.nextLine().charAt(0);
        int numberOfLetter = (int)letter;

        if(numberOfLetter >= 65 && numberOfLetter <= 90){
            System.out.println("upper-case");
        }
        else if(numberOfLetter >= 97 && numberOfLetter <= 122){
            System.out.println("lower-case");
        }
    }
}
