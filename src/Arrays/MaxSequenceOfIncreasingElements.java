package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MaxSequenceOfIncreasingElements {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] longestSequence = new int[numbers.length];
        int[] saveLongestSequence = new int[numbers.length];
        boolean itHasANumber = false;
        int counter = 0, saveCounter = 0;

        for(int a = 1; a < numbers.length; a++){
            if(itHasANumber == false){
                longestSequence[0] = numbers[a - 1];
                itHasANumber = true;
            }

            if(numbers[a] > numbers[a - 1]){
                longestSequence[counter + 1] = numbers[a];
                counter++;
                if(counter > saveCounter){
                    saveCounter = counter;
                    for (int b = 0; b < counter + 1; b++) {
                        saveLongestSequence[b] = longestSequence[b];
                    }
                }
            }
            else if(numbers[a] <= numbers[a - 1] && counter == 0){
                itHasANumber = false;
                continue;
            }
            else if(numbers[a] <= numbers[a - 1] && counter > 0){
                itHasANumber = false;
                counter = 0;
            }
        }

        for(int c = 0; c < saveCounter + 1; c++){
            System.out.print(saveLongestSequence[c] + " ");
        }
    }
}
