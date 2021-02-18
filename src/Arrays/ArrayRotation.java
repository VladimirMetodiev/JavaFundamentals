package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int number = Integer.parseInt(input.nextLine());
        int current = 0;

        for(int a = 0; a < number; a++){
            current = myArray[0];
            for(int b = 0; b < myArray.length; b++){
                if(b < myArray.length - 1){
                    myArray[b] = myArray[b + 1];
                }
            }
            myArray[myArray.length - 1] = current;
        }

        for(int num : myArray){
            System.out.printf("%d ", num);
        }
    }
}
