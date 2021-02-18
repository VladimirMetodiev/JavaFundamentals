package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SumEvenNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        //int[] myArray = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        for(int a = 0; a < numbers.length; a++){
            if(numbers[a] % 2 == 0){
                sum += numbers[a];
            }
        }

        System.out.println(sum);
    }
}
