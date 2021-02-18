package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumOfEvenNum = 0;
        int sumOfOddNum = 0;
        int difference = 0;

        for(int a = 0; a < myArray.length; a++){
            if(myArray[a] % 2 == 0){
                sumOfEvenNum += myArray[a];
            }
            else{
                sumOfOddNum += myArray[a];
            }
        }

        difference = sumOfEvenNum - sumOfOddNum;
        System.out.println(difference);
    }
}
