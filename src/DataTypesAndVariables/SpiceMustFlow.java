package DataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int yield = Integer.parseInt(input.nextLine());

        int spiceInStock = 0;
        int days = 0;

        while (yield >= 100){
            spiceInStock += yield - 26;
            yield -= 10;
            days++;
            if(yield < 100){
                spiceInStock -= 26;
                break;
            }
        }

        System.out.println(days);
        System.out.println(spiceInStock);
    }
}
