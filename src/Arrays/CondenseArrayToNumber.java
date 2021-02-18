package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int length = array.length;

        while(length > 1){
            for(int a = 0; a < length; a++){
                if(a < length - 1){
                    array[a] = array[a] + array[a + 1];
                }
            }
            length--;
        }

        System.out.println(array[0]);
    }
}
