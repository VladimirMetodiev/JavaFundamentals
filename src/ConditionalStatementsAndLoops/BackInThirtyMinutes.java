package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class BackInThirtyMinutes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int hours = Integer.parseInt(input.nextLine());
        int minutes = Integer.parseInt(input.nextLine());

        minutes += 30;

        if(minutes >= 60){
            hours++;
            minutes = minutes - 60;
        }

        if(hours == 24){
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
