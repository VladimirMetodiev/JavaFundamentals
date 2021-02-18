package Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int[] myArray = new int[number];

        for(int a = number - 1; a >= 0; a--){
            myArray[a] = Integer.parseInt(input.nextLine());
        }

        for(int b = 0; b < number; b++){
            System.out.printf("%d ", myArray[b]);
        }
    }
}
