package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MagicSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int standard = Integer.parseInt(input.nextLine());

        int sum;

        for(int a = 0; a < numbers.length; a++){
            for(int b = a + 1; b < numbers.length; b++){
                sum = numbers[a] + numbers[b];
                if(sum == standard){
                    System.out.printf("%d %d%n", numbers[a], numbers[b]);
                }
            }
        }
    }
}
