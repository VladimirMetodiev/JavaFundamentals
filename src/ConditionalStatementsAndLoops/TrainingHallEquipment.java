package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class TrainingHallEquipment {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float budget = Float.parseFloat(input.nextLine());
        int items = Integer.parseInt(input.nextLine());

        String name;
        float price;
        int itemCount;
        float subTotal = 0f;

        for(int a = 1; a <= items; a++){
            name = input.nextLine();
            price = Float.parseFloat(input.nextLine());
            itemCount = Integer.parseInt(input.nextLine());
            subTotal += price * itemCount;
            budget -= price * itemCount;
            if(itemCount == 1){
                System.out.printf("Adding %d %s to cart.%n", itemCount, name);
            }
            else{
                System.out.printf("Adding %d %ss to cart.%n", itemCount, name);
            }
        }

        if(budget >= 0){
            System.out.printf("Subtotal: $%.2f%n", subTotal);
            System.out.printf("Money left: $%.2f", budget);
        }
        else{
            System.out.printf("Subtotal: $%.2f%n", subTotal);
            System.out.printf("Not enough. We need $%.2f more.", Math.abs(budget));
        }
    }
}
