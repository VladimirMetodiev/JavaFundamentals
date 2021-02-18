package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfLosses = Integer.parseInt(input.nextLine());
        double headsetPrice = Double.parseDouble(input.nextLine());
        double mousePrice = Double.parseDouble(input.nextLine());
        double keyboardPrice = Double.parseDouble(input.nextLine());
        double displayPrice = Double.parseDouble(input.nextLine());

        double sum = 0.0;
        int counter = 0;

        for (int i = 1; i <= numberOfLosses; i++) {
            if(i % 2 == 0 && i % 3 == 0){
                sum += headsetPrice + mousePrice + keyboardPrice;
                counter++;
                if(counter == 2){
                    sum += displayPrice;
                    counter = 0;
                }
            }
            else if(i % 3 == 0){
                sum += mousePrice;
            }
            else if(i % 2 == 0){
                sum += headsetPrice;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
