package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class GamingStore {
    static double checkTheBudget(String game, double budget){
        double gamePrice = 0.0;
        switch(game){
            case "outfall 4": gamePrice = 39.99; break;
            case "cs: og": gamePrice = 15.99; break;
            case "zplinter zell": gamePrice = 19.99; break;
            case "honored 2": gamePrice = 59.99; break;
            case "roverwatch": gamePrice = 29.99; break;
            case "roverwatch origins edition": gamePrice = 39.99; break;
            default: break;
        }
        gamePrice = gamePrice > budget ? 0 : gamePrice;
        return gamePrice;
    }
    static boolean checkTheStock(String game){
        boolean hasIt = false;
        switch(game){
            case "outfall 4": hasIt = true; break;
            case "cs: og": hasIt = true; break;
            case "zplinter zell": hasIt = true; break;
            case "honored 2": hasIt = true; break;
            case "roverwatch": hasIt = true; break;
            case "roverwatch origins edition": hasIt = true; break;
            default: break;
        }
        return hasIt;
    }
    static void note(String name){
        switch(name){
            case "outfall 4": System.out.println("Bought OutFall 4"); break;
            case "cs: og": System.out.println("Bought CS: OG"); break;
            case "zplinter zell": System.out.println("Bought Zplinter Zell"); break;
            case "honored 2": System.out.println("Bought Honored 2"); break;
            case "roverwatch": System.out.println("Bought RoverWatch"); break;
            case "roverwatch origins edition": System.out.println("Bought RoverWatch Origins Edition"); break;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double budget = Double.parseDouble(input.nextLine());

        double money = budget;
        double price;
        String game = "";
        boolean thereIsAGame;

        while(true){
            game = input.nextLine().toLowerCase();

            if(money == 0){
                System.out.println("Out of money!");
                break;
            }

            if(game.equals("game time")){
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", budget - money, money);
                break;
            }

            thereIsAGame = checkTheStock(game);
            if(thereIsAGame == true){
                price = checkTheBudget(game, money);
                if(price == 0){
                    System.out.println("Too Expensive");
                }
                else{
                    money -= price;
                    note(game);
                }
            }
            else{
                System.out.println("Not Found");
            }
        }
    }
}
