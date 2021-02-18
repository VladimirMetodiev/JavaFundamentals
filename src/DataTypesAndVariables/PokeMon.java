package DataTypesAndVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int thePokePower = Integer.parseInt(input.nextLine());
        int energyForApproaching = Integer.parseInt(input.nextLine());
        int exhaustionFactor = Integer.parseInt(input.nextLine());

        boolean judge = true;
        int counterOfTargets = 0;
        int currentEnergy = thePokePower;

        while(currentEnergy >= energyForApproaching){
            counterOfTargets++;
            currentEnergy -= energyForApproaching;
            if(currentEnergy == thePokePower / 2.0 && judge == true){
                if (exhaustionFactor > 0){
                    currentEnergy /= exhaustionFactor;
                }
                judge = false;
            }
            if(currentEnergy < energyForApproaching){
                break;
            }
        }
        System.out.println(currentEnergy);
        System.out.println(counterOfTargets);
    }
}
