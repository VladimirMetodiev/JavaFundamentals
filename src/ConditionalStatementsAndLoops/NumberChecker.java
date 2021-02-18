package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        try{
            int number = Integer.parseInt(word);
            System.out.println("It is a number.");
        }
        catch (Exception ex){
            System.out.println("Invalid input!");
        }
    }
}
