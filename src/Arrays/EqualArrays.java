package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] firstArray = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] secondArray = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean judge = true;
        int saveIndex = 0;
        int sum = 0;

        for(int a = 0; a < firstArray.length; a++){
            sum += firstArray[a];
            if(firstArray[a] != secondArray[a] && judge == true){
                judge = false;
                saveIndex = a;
            }
        }

        if(judge == true){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
        else if(judge == false && saveIndex > 0){
            System.out.printf("Arrays are not identical. Found difference at %d index.", saveIndex);
        }
        else if(judge == false && saveIndex == 0){
            System.out.printf("Arrays are not identical. Found difference at %d index.", saveIndex);
        }
    }
}
