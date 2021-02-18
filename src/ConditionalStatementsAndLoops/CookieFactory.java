package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int counter = 0;
        String expression;
        boolean doesItContainFlour = false, doesItContainEggs = false, doesItContainSugar = false;

        while(counter++ < number){
            while (true){
                expression = input.nextLine().toLowerCase();

                if(expression.equals("flour")){
                    doesItContainFlour = true;
                }

                if(expression.equals("eggs")){
                    doesItContainEggs = true;
                }

                if(expression.equals("sugar")){
                    doesItContainSugar = true;
                }

                if(expression.equals("bake!")){
                    if(doesItContainFlour == true && doesItContainEggs == true && doesItContainSugar == true){
                        System.out.printf("Baking batch number %d...%n", counter);
                        doesItContainFlour = false;
                        doesItContainEggs = false;
                        doesItContainSugar = false;
                    }
                    else if(!doesItContainFlour == true || !doesItContainEggs == true || !doesItContainSugar == true){
                        System.out.println("The batter should contain flour, eggs and sugar!");
                        counter--;
                    }

                    break;
                }
            }
        }
    }
}

//Input:

//3
//flour
//eggs
//jam
//Bake!
//sugar
//Bake!
//flour
//eggs
//milk
//almonds
//sugar
//Bake!
//flour
//eggs
//sugar
//Bake!

