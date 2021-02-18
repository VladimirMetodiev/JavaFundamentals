package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int currentQuantity;
        int totalQuantity = 255;

        for(int a = 1; a <= number; a++){
            currentQuantity = Integer.parseInt(input.nextLine());
            if(totalQuantity - currentQuantity >= 0){
                totalQuantity -= currentQuantity;
            }
            else{
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.printf("%d", 255 - totalQuantity);
    }
}
