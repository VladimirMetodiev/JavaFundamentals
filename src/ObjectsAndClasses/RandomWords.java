package ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> words = Arrays.stream(input.nextLine().split(" ")).collect(Collectors.toList());

        RandomNumberGenerator rmdWords = new RandomNumberGenerator();

        rmdWords.printsARandomWord(words);
    }
}

class RandomNumberGenerator{
    void printsARandomWord(List<String> str){
//Когато два класа се намират в един файл, само единят може да има модификатор public

        String current;
        int randomIndex = 0;
        Random rnd = new Random();

        for (int a = 0; a < str.size(); a++) {
            randomIndex = rnd.nextInt(str.size()); //в скобите се записва граничната стойност, до която могат да се избират случайни числа
            current = str.get(a);
            str.set(a, str.get(randomIndex));
            str.set(randomIndex, current);
        }

        for(int b = 0; b < str.size(); b++){
            System.out.println(str.get(b));
        }
    }
}



//A bad code

//public class RandomWords {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        List<String> words = Arrays.stream(input.nextLine().split(" ")).collect(Collectors.toList());
//
//        RandomNumberGenerator rmdWords = new RandomNumberGenerator();
//
//        rmdWords.printsARandomWord(words);
//    }
//}
//
//class RandomNumberGenerator{
//    void printsARandomWord(List<String> str){
//        List<String> result = new ArrayList<>();
//
//        for (int a = 0; a < str.size(); a++) {
//            if(result.size() == 0){
//                result.add(str.get(a));
//            }
//            else if(result.size() != 0 && str.get(a).length() % 2 == 0){
//                result.add(str.get(a));
//            }
//            else if(result.size() != 0 && str.get(a).length() % 2 != 0){
//                result.add(0, str.get(a));
//            }
//        }
//
//        for(int b = 0; b < result.size(); b++){
//            System.out.println(result.get(b));
//        }
//    }
//}
