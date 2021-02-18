package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class ChooseADrinkVarTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String profession = input.nextLine();
        int quantity = Integer.parseInt(input.nextLine());

        double price = 0.0;

        if (profession.equals("Athlete")) {
            price = 0.7 * quantity;
            System.out.printf("The %s has to pay %.2f.", profession, price);
        }
        else if (profession.equals("Businessman")) {
            price = 1.0 * quantity;
            System.out.printf("The %s has to pay %.2f.", profession, price);
        }
        else if (profession.equals("Businesswoman")) {
            price = 1.0 * quantity;
            System.out.printf("The %s has to pay %.2f.", profession, price);
        }
        else if (profession.equals("SoftUni Student")) {
            price = 1.7 * quantity;
            System.out.printf("The %s has to pay %.2f.", profession, price);
        }
        else {
            price = 1.2 * quantity;
            System.out.printf("The %s has to pay %.2f.", profession, price);
        }
    }
}
