package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> expressions = Arrays.stream(input.nextLine().split("\\|+")).collect(Collectors.toList());

        List<String> finalList = new ArrayList<>();

        for(int a = 0; a < expressions.size(); a++){
            String[] current = expressions.get(expressions.size() - 1 - a).trim().split("\\s+");
            for(int b = 0; b < current.length; b++){
                if(!current[b].equals("")) {
                    finalList.add(current[b]);
                }
            }
        }

        String print = finalList.toString();
        System.out.println(print.replaceAll("[\\[,\\]]", ""));
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        List<String> expressions = Arrays.stream(input.nextLine().split("\\|+")).collect(Collectors.toList());
//
//        List<Integer> finalList = new ArrayList<>();
//
//        for(int a = 0; a < expressions.size(); a++){
//            List<Integer> currentList = Arrays.stream(expressions.get(a).trim().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
//
//            for(int b = 0; b < currentList.size(); b++){
//                finalList.add(0, currentList.get(currentList.size() - 1 - b));
//            }
//            while(currentList.size() > 0) {
//                currentList.remove(0);
//            }
//        }
//
//        finalList.forEach(e -> System.out.print(e + " "));
//    }



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        List<String> expressions = Arrays.stream(input.nextLine().split("\\|+")).collect(Collectors.toList());
//
//        List<String> finalList = new ArrayList<>();
//
//        for(int a = 0; a < expressions.size(); a++){
//            String[] current = expressions.get(expressions.size() - 1 - a).trim().split("\\s+");
//
//            for(int b = 0; b < current.length; b++){
//                if(!current[b].equals("")) {
//                    //current e String -> .equals()
//                    finalList.add(current[b]);
//                }
//            }
//        }
//
//        finalList.forEach(e -> System.out.print(e.replaceAll("[\\[,\\]]", "") + " "));
//    }