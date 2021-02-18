package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String month = input.nextLine().toLowerCase();
        int nightsCount = Integer.parseInt(input.nextLine());

        double studioPrice = 0.0;
        double doublePrice = 0.0;
        double suitePrice = 0.0;

        if(month.equals("may") || month.equals("october")){
            studioPrice = 50.0 * nightsCount;
            doublePrice = 65.0 * nightsCount;
            suitePrice = 75.0 * nightsCount;
            if(nightsCount > 7){
                studioPrice *= 0.95;
            }
            if(nightsCount > 7 && month.equals("october")){
                studioPrice -= 50.0 * 0.95;
            }
        }
        else if(month.equals("june") || month.equals("september")){
            studioPrice = 60.0 * nightsCount;
            doublePrice = 72.0 * nightsCount;
            suitePrice = 82.0 * nightsCount;
            if(nightsCount > 14){
                doublePrice *= 0.9;
            }
            if(nightsCount > 7 && month.equals("september")){
                studioPrice -= 60.0;
            }
        }
        else if(month.equals("july") || month.equals("august") || month.equals("december")){
            studioPrice = 68.0 * nightsCount;
            doublePrice = 77.0 * nightsCount;
            suitePrice = 89.0 * nightsCount;
            if(nightsCount > 14){
                suitePrice *= 0.85;
            }
        }

        System.out.printf("Studio: %.2f lv.%n", studioPrice);
        System.out.printf("Double: %.2f lv.%n", doublePrice);
        System.out.printf("Suite: %.2f lv.%n", suitePrice);
    }
}
