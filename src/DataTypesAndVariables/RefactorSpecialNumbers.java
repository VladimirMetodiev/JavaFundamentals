package DataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int num;

        boolean isIt;

        for (int i = 1; i <= number; i++) {
            num = i;

            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            isIt = (sum == 5) || (sum == 7) || (sum == 11);

            if(isIt == true){
                System.out.printf("%d -> True%n", i);
            }
            else{
                System.out.printf("%d -> False%n", i);
            }

            sum = 0;
        }
    }
}
