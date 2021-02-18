package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[3];
        int number;

        for (int i = 0; i < 3; i++) {
            number = Integer.parseInt(input.nextLine());
            myArray[i] = number;
        }


        if(myArray[0] < myArray[1]){
            number = myArray[0];
            myArray[0] = myArray[1];
            myArray[1] = number;
        }
        if(myArray[0] < myArray[2]){
            number = myArray[0];
            myArray[0] = myArray[2];
            myArray[2] = number;
        }
        if(myArray[1] < myArray[2]){
            number = myArray[1];
            myArray[1] = myArray[2];
            myArray[2] = number;
        }

        for (int print = 0; print < 3; print++) {
            System.out.println(myArray[print]);
        }
    }
}
