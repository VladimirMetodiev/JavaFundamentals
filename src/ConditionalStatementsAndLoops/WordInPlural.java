package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class WordInPlural {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        if(word.endsWith("y")){
            for (int i = 0; i < word.length() - 1; i++) {
                System.out.print(word.charAt(i));
            }
            System.out.println("ies");
        }
        else if(word.endsWith("o") || word.endsWith("s") || word.endsWith("x") || word.endsWith("z") || word.endsWith("ch") || word.endsWith("sh")){
            System.out.printf("%ses", word);
        }
        else{
            System.out.printf("%ss", word);
        }
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String word = input.nextLine();
//
//        char lastLetter = word.charAt(word.length() - 1);
//
//        if(lastLetter == 'y'){
//            for (int i = 0; i < word.length() - 1; i++) {
//                System.out.print(word.charAt(i));
//            }
//            System.out.println("ies");
//        }
//        else if(lastLetter == 'o' || lastLetter == 's' || lastLetter == 'x' || lastLetter == 'z' || lastLetter == 'h'){
//            for (int i = 0; i < word.length(); i++) {
//                System.out.print(word.charAt(i));
//            }
//            System.out.println("es");
//        }
//        else{
//            for (int i = 0; i < word.length(); i++) {
//                System.out.print(word.charAt(i));
//            }
//            System.out.println("s");
//        }
//    }
