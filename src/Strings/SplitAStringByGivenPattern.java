package Strings;

import java.util.Scanner;

public class SplitAStringByGivenPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        String[] words = text.split("[,;:.\\s]+");

        for(String exp : words){
            System.out.println(exp);
        }
    }
}

//I study programming. I have completed the following classes: Java Starter, Java Essential;