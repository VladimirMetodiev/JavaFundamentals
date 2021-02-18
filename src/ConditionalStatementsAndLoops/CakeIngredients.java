package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class CakeIngredients {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String ingredient = "";
        int counter = 0;

        while(true){
            ingredient = input.nextLine();
            if(ingredient.equals("Bake!")){
                System.out.printf("Preparing cake with %d ingredients.", counter);
                break;
            }
            counter++;
            System.out.printf("Adding ingredient %s.%n", ingredient);
        }
    }
}
