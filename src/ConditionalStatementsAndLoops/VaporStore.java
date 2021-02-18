package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class VaporStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double budget = Double.parseDouble(input.nextLine());

        String game = " ";
        double price = 0d;
        double totalSpent = 0d;

        while(true){
            game = input.nextLine();

            if(game.equals("Game Time")){
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, budget);
                break;
            }

            switch(game){
                case "OutFall 4": price = 39.99; break;
                case "CS: OG": price = 15.99; break;
                case "Zplinter Zell": price = 19.99; break;
                case "Honored 2": price = 59.99; break;
                case "RoverWatch": price = 29.99; break;
                case "RoverWatch Origins Edition": price = 39.99; break;
                default: System.out.println("Not Found"); continue;
            }

            if(budget < price){
                System.out.println("Too Expensive");
                continue;
            }
            else{
                System.out.printf("Bought %s%n", game);
                totalSpent += price;
                budget -= price;
            }

            if(budget == 0){
                System.out.println("Out of money!");
                break;
            }
        }
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double balance = Double.parseDouble(input.nextLine());
//        double purchase = 0.0;
//
//        while(balance > 0){
//            String command = input.nextLine().toLowerCase();
//            if(command.equals("game time")){
//                System.out.printf("Total spent: $%.02f. Remaining: $%.02f", purchase, balance);
//                return;
//            }
//            switch(command){
//                case "outfall 4":
//                    if(balance >= 39.99) {
//                        balance -= 39.99;
//                        purchase += 39.99;
//                        System.out.println("Bought OutFall 4");
//                    }
//                    else{
//                        System.out.println("Too Expensive");
//                    }
//                    break;
//                case "cs: og":
//                    if(balance >= 15.99) {
//                        balance -= 15.99;
//                        purchase += 15.99;
//                        System.out.println("Bought CS: OG");
//                    }
//                    else{
//                        System.out.println("Too Expensive");
//                    }
//                    break;
//                case "zplinter zell":
//                    if(balance >= 19.99) {
//                        balance -= 19.99;
//                        purchase += 19.99;
//                        System.out.println("Bought Zplinter Zell");
//                    }
//                    else{
//                        System.out.println("Too Expensive");
//                    }
//                    break;
//                case "honored 2":
//                    if(balance >= 59.99) {
//                        balance -= 59.99;
//                        purchase += 59.99;
//                        System.out.println("Bought Honored 2");
//                    }
//                    else{
//                        System.out.println("Too Expensive");
//                    }
//                    break;
//                case "roverwatch":
//                    if(balance >= 29.99) {
//                        balance -= 29.99;
//                        purchase += 29.99;
//                        System.out.println("Bought RoverWatch");
//                    }
//                    else{
//                        System.out.println("Too Expensive");
//                    }
//                    break;
//                case "roverwatch origins edition":
//                    if(balance >= 39.99) {
//                        balance -= 39.99;
//                        purchase += 39.99;
//                        System.out.println("Bought RoverWatch Origins Edition");
//                    }
//                    else{
//                        System.out.println("Too Expensive");
//                    }
//                    break;
//                default:
//                    System.out.println("Not Found");
//                    break;
//            }
//        }
//        if(balance == 0) {
//            System.out.println("Out of money!");
//        }