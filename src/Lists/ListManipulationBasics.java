package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(input.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String expression;
        String[] parameter = new String[3];
        String command = "";
        int firstValue = 0, secondValue = 0;

        while(!(expression = input.nextLine().toLowerCase()).equals("end")){
            parameter = expression.split(" ");
            command = parameter[0];
            firstValue = Integer.parseInt(parameter[1]);

            switch(command){
                case "add": numbers.add(firstValue); break;
                case "remove": numbers.remove(Integer.valueOf(firstValue)); break;
                case "removeat": numbers.remove(firstValue); break;
                case "insert": numbers.add(secondValue = Integer.parseInt(parameter[2]), firstValue); break;
                default: break;
            }
        }

        for(int a = 0; a < numbers.size(); a++){
            System.out.printf("%d ", numbers.get(a));
        }
    }
}



//    static List<Integer> addNewInteger(List<Integer> num, int value){
//        num.add(value);
//        return num;
//    }
//
//    static List<Integer> removeANumber(List<Integer> num, int value){
//        num.remove(Integer.valueOf(value));
//        return num;
//    }
//
//    static List<Integer> removeAnIndex(List<Integer> num, int value){
//        num.remove(value);
//        return num;
//    }
//
//    static List<Integer> insertANumber(List<Integer> num, int firstVal, int secondVal){
//        num.add(secondVal, firstVal);
//        return num;
//    }
//
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        List<Integer> numbers = Arrays.stream(input.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
//
//        String expression;
//        String[] parameter = new String[3];
//        String command = "";
//        int firstValue = 0, secondValue = 0;
//
//        while(!(expression = input.nextLine().toLowerCase()).equals("end")){
//            parameter = expression.split(" ");
//            command = parameter[0];
//            firstValue = Integer.parseInt(parameter[1]);
//            try{
//                secondValue = Integer.parseInt(parameter[2]);
//            }
//            catch(Exception exc){
//
//            }
//
//            switch(command){
//                case "add": numbers = addNewInteger(numbers, firstValue); break;
//                case "remove": numbers = removeANumber(numbers, firstValue); break;
//                case "removeat": numbers = removeAnIndex(numbers, firstValue); break;
//                case "insert": numbers = insertANumber(numbers, firstValue, secondValue); break;
//                default: break;
//            }
//        }
//
//        for(int a = 0; a < numbers.size(); a++){
//            System.out.printf("%d ", numbers.get(a));
//        }
//    }



