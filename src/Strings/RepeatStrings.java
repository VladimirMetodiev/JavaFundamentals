package Strings;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] array = input.nextLine().split("\\s+");
        for(int a = 0; a < array.length; a++){
            for(int b = 0; b < array[a].length(); b++){
                System.out.print(array[a]);
            }
        }
    }
}
