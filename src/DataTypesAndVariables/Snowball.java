package DataTypesAndVariables;

import java.util.Scanner;

public class Snowball {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int snowballSnow, snowballTime, snowballQuality;
        int theHighestSnowballSnow = 0, theHighestSnowballTime = 0, theHighestSnowballQuality = 0;
        double snowballValue;
        double theHighestValue = 0.0;

        for (int i = 1; i <= number; i++) {
            snowballSnow = Integer.parseInt(input.nextLine());
            snowballTime = Integer.parseInt(input.nextLine());
            snowballQuality = Integer.parseInt(input.nextLine());
            snowballValue = Math.pow((double)(snowballSnow / snowballTime), snowballQuality);

            if(snowballValue > theHighestValue){
                theHighestSnowballSnow = snowballSnow;
                theHighestSnowballTime = snowballTime;
                theHighestSnowballQuality = snowballQuality;
                theHighestValue = snowballValue;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", theHighestSnowballSnow, theHighestSnowballTime, theHighestValue, theHighestSnowballQuality);
    }
}
