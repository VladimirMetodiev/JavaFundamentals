package Methods;

import java.util.Scanner;

public class VowelsCount {
    static void countVowels(String exp){
        int counter = 0;
        for (int a = 0; a < exp.length(); a++){
            char letter = exp.charAt(a);
            if(letter == 'A' ||
                    letter == 'E' ||
                    letter == 'I' ||
                    letter == 'O' ||
                    letter == 'U' ||
                    letter == 'a' ||
                    letter == 'e' ||
                    letter == 'i' ||
                    letter == 'o' ||
                    letter == 'u'){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        countVowels(expression);
    }
}
