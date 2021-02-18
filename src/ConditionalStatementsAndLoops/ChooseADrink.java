package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class ChooseADrink {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String profession = input.nextLine().toLowerCase();

        if (profession.equals("athlete")) {
            System.out.print("Water");
        }
        else if (profession.equals("businessman") || profession.equals("businesswoman")) {
            System.out.print("Coffee");
        }
        else if (profession.equals("softuni student")) {
            System.out.print("Beer");
        }
        else {
            System.out.print("Tea");
        }
    }
}
