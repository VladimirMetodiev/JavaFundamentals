package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class MagicLetter {
    static void print(char a, char b, char c, char forbidden){
        if(a != forbidden && b != forbidden && c != forbidden){
            System.out.printf("%c%c%c ", a, b, c);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char firstLetter = input.nextLine().charAt(0);
        char secondLetter = input.nextLine().charAt(0);
        char thirdLetter = input.nextLine().charAt(0);

        for (char i = firstLetter; i <= secondLetter; i++) {
            for (char j = firstLetter; j <= secondLetter; j++) {
                for (char k = firstLetter; k <= secondLetter; k++) {
                    print(i, j, k, thirdLetter);
                }
            }
        }
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        char firstLetter = input.nextLine().charAt(0);
//        char secondLetter = input.nextLine().charAt(0);
//        char thirdLetter = input.nextLine().charAt(0);
//
//        for (char i = firstLetter; i <= secondLetter; i++) {
//            for (char j = firstLetter; j <= secondLetter; j++) {
//                for (char k = firstLetter; k <= secondLetter; k++) {
//                    if(i != thirdLetter && j != thirdLetter && k != thirdLetter){
//                        System.out.printf("%c%c%c ", i, j, k);
//                    }
//                }
//            }
//        }
//    }