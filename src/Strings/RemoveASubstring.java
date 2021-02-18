package Strings;

import java.util.Scanner;

public class RemoveASubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String removeWord = input.nextLine();
        String text = input.nextLine();

        while(text.contains(removeWord)){
            text = text.replace(removeWord, "");
        }

        System.out.println(text);
    }
}
