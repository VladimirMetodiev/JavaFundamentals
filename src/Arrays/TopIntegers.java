package Arrays;

import java.util.Scanner;
        import java.util.Arrays;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean judge = true;

        for (int a = 0; a < numbers.length; a++){
            for (int b = a + 1; b < numbers.length; b++){
                if(numbers[a] <= numbers[b]){
                    judge = false;
                }
            }
            if(judge == true){
                System.out.print(numbers[a] + " ");
            }
            judge = true;
        }
    }
}
