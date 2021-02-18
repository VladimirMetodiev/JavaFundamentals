package BasicSyntax;

import java.util.Scanner;

public class CharacterStats {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int currentHealth = input.nextInt();
        int maximumHealth = input.nextInt();
        int currentEnergy = input.nextInt();
        int maximumEnergy = input.nextInt();

        System.out.println("Name: " + name);

        System.out.print("Health: |");
        for (int i = 1; i <= maximumHealth; i++) {
            if(currentHealth >= i){
                System.out.print("|");
            }
            else{
                System.out.print(".");
            }
        }
        System.out.println("|");

        System.out.print("Energy: |");
        for (int j = 1; j <= maximumEnergy; j++) {
            if(currentEnergy >= j){
                System.out.print("|");
            }
            else{
                System.out.print(".");
            }
        }
        System.out.println("|");
    }
}
