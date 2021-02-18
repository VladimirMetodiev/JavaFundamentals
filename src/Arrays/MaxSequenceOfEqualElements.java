package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int current = 0;
        int currentNumber = 0;
        int maxSequence = 0;
        int saveNumber = 0;

        for(int a = 1; a < numbers.length; a++){
            if(numbers[a - 1] == numbers[a]){
                current++;
                currentNumber = numbers[a];

                if(current > maxSequence){
                    maxSequence = current;
                    saveNumber = currentNumber;
                }
            }
            else if(numbers[a - 1] != numbers[a]){
                current = 0;
            }
        }

        for(int b = 0; b < maxSequence + 1; b++){
            System.out.printf("%d ", saveNumber);
        }
    }
}
