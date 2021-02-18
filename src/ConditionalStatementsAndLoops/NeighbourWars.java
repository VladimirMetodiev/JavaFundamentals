package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class NeighbourWars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int peterDamage = Integer.parseInt(input.nextLine());
        int georgyDamage = Integer.parseInt(input.nextLine());

        int peterHealth = 100;
        int georgyHealth = 100;

        int counter = 1;

        while(true){
            if(counter %2 != 0){
                georgyHealth -= peterDamage;
                if(georgyHealth <= 0){
                    System.out.printf("Pesho won in %dth round.", counter);
                    break;
                }
                System.out.printf("Pesho used Roundhouse kick and reduced Gosho to %d health.%n", georgyHealth);
            }
            else{
                peterHealth -= georgyDamage;
                if(peterHealth <= 0){
                    System.out.printf("Gosho won in %dth round.", counter);
                    break;
                }
                System.out.printf("Gosho used Thunderous fist and reduced Pesho to %d health.%n", peterHealth);
            }
            if(counter % 3 == 0){
                peterHealth += 10;
                georgyHealth += 10;
            }
            counter++;
        }
    }
}
