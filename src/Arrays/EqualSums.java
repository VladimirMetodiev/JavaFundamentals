package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EqualSums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int leftSum = 0;
        int rightSum = 0;
        int saveIndex = -1;

        for(int a = 0; a < numbers.length; a++){
            for(int b = 0; b < a; b++){
                leftSum += numbers[b];
            }
            for(int c = a + 1; c < numbers.length; c++){
                rightSum += numbers[c];
            }
            if(leftSum == rightSum){
                saveIndex = a;
                break;
            }
            leftSum = 0;
            rightSum = 0;
        }

        if(saveIndex >= 0){
            System.out.println(saveIndex);
        }
        else{
            System.out.println("no");
        }
    }
}
