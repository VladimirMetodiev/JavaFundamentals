package Arrays;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] myArray = input.nextLine().split(" ");

        //String expression = input.nextLine();
        //String[] array = expression.split(" ");

        for(int a = myArray.length - 1; a >= 0; a--){
            System.out.printf("%s ", myArray[a]);
        }
    }
}
