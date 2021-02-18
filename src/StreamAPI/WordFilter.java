package StreamAPI;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = Arrays.stream(input.nextLine().split("\\s+")).filter(word -> word.length() % 2 == 0).toArray(String[]::new);

        for (String vocable : words){
            System.out.println(vocable);
        }
    }
}


//Input:

//apple banana orange pear apricot peach kiwi
