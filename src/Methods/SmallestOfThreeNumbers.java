package Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    static void getTheSmallestNumber(int[] array){
        int current = 0;
        for (int z = 2; z > 0; z--){
            current = array[z];
            if(array[z] < array[z - 1]){
                array[z - 1] = array[z];
                array[z] = current;
            }
        }
        System.out.println(array[0]);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];

        for(int a = 0; a < 3; a++){
            numbers[a] = Integer.parseInt(input.nextLine());
        }

        getTheSmallestNumber(numbers);
    }
}
