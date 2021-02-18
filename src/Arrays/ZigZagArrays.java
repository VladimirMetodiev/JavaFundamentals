package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int[] firstArray = new int[number];
        int[] secondArray = new int[number];
        int[] current = new int[2];

        for(int a = 0; a < number; a++){
            current = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(a % 2 == 0){
                firstArray[a] = current[0];
                secondArray[a] = current[1];
            }
            else{
                secondArray[a] = current[0];
                firstArray[a] = current[1];
            }
        }

        for(int num : firstArray){
            System.out.print(num + " ");
        }
        System.out.println();
        for(int num : secondArray){
            System.out.print(num + " ");
        }
    }
}
