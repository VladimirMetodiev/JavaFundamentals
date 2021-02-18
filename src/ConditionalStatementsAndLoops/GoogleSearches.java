package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class GoogleSearches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = Integer.parseInt(input.nextLine());
        int usersPerDay = Integer.parseInt(input.nextLine());
        double profitFromASearch = Double.parseDouble(input.nextLine());

        int words;
        double profit = 0d;

        for (int index = 1; index <= usersPerDay; index++) {
            words = Integer.parseInt(input.nextLine());

            if(words > 5){
                continue;
            }
            else if(words == 1){
                if(index % 3 != 0){
                    profit += 2.0 * profitFromASearch * days;
                }
                else if(index % 3 == 0){
                    profit += 6.0 * profitFromASearch * days;
                }

            }
            else{
                if(index % 3 != 0){
                    profit += profitFromASearch * days;
                }
                else if(index % 3 == 0){
                    profit += 3.0 * profitFromASearch * days;
                }
            }
        }

        System.out.printf("Total money earned for %d days: %.2f", days, profit);
    }
}
