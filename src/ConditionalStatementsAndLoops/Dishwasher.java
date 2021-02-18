package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfBottles = Integer.parseInt(input.nextLine());
        int quantityPreparation = countOfBottles * 750;

        int counter = 0, forWashing, quantityOfDishes = 0, spendOnDishes = 0, quantityOfPots = 0, spendOnPots = 0, total = 0;

        while (true){
            String expression = input.nextLine();

            if(expression.equals("End")){
                break;
            }

            forWashing = Integer.parseInt(expression);
            counter++;

            if(counter % 3 == 0){
                quantityOfPots += forWashing;
                spendOnPots += forWashing * 15;
                total += forWashing * 15;
            }
            else{
                quantityOfDishes += forWashing;
                spendOnDishes += forWashing * 5;
                total += forWashing * 5;
            }

            if(quantityPreparation < total){
                break;
            }
        }

        if(quantityPreparation >= total){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", quantityOfDishes, quantityOfPots);
            System.out.printf("Leftover detergent %d ml.", quantityPreparation - total);
        }
        else{
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(total - quantityPreparation));
        }
    }
}
