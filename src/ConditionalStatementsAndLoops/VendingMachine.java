package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String anInput = "";
        double coins;
        double sum = 0.0;

        while(true){
            anInput = input.nextLine().toLowerCase();

            if(anInput.equals("start")){
                break;
            }

            coins = Double.parseDouble(anInput);
            int money = (int)(coins * 10);

            switch (money){
                case 1: sum += 0.1; break;
                case 2: sum += 0.2; break;
                case 5: sum += 0.5; break;
                case 10: sum += 1; break;
                case 20: sum += 2; break;
                default: System.out.printf("Cannot accept %.2f%n", coins); break;
            }
        }

        while(true){
            anInput = input.nextLine().toLowerCase();

            if(anInput.equals("end")){
                break;
            }

            switch (anInput){
                case "nuts":{
                    if(sum - 2 >= 0){
                        sum -= 2;
                        System.out.println("Purchased Nuts");
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                }
                case "water":{
                    if(sum - 0.7 >= 0){
                        sum -= 0.7;
                        System.out.println("Purchased Water");
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                }
                case "crisps":{
                    if(sum - 1.5 >= 0){
                        sum -= 1.5;
                        System.out.println("Purchased Crisps");
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                }
                case "soda":{
                    if(sum - 0.8 >= 0){
                        sum -= 0.8;
                        System.out.println("Purchased Soda");
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                }
                case "coke":{
                    if(sum - 1 >= 0){
                        sum -= 1;
                        System.out.println("Purchased Coke");
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                }
                default:{
                    System.out.println("Invalid product");
                    break;
                }
            }
        }

        System.out.printf("Change: %.2f", sum);
    }
}
