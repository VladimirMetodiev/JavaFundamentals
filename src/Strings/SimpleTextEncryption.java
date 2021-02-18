package Strings;

import java.util.Scanner;

public class SimpleTextEncryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for(int a = 0; a < text.length(); a++){
            encryptedText.append((char)((int)text.charAt(a) + 3));
        }

        System.out.println(encryptedText.toString());
    }
}
