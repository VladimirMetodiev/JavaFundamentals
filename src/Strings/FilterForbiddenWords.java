package Strings;

import java.util.Scanner;

public class FilterForbiddenWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] bannedWords = input.nextLine().split(",\\s+");
        String text = input.nextLine();

        String bannedWord = "";
        StringBuilder replacedWith = new StringBuilder();

        for(int a = 0; a < bannedWords.length; a++){
            bannedWord = bannedWords[a];

            for(int b = 0; b < bannedWord.length(); b++){
                replacedWith.append("*");
            }

            text = text.replace(bannedWord, replacedWith);

            replacedWith.setLength(0);
        }

        System.out.println(text);
    }
}
