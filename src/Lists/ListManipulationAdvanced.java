package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    static void containsANumber(List<Integer> numbers, int num){
        if(numbers.contains((Object)num)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No such number");
        }
    }

    static void printNumbers(List<Integer> numbers, String evenOrOdd){
        if(evenOrOdd.equals("even")){
            for(int a = 0; a < numbers.size(); a++){
                if(numbers.get(a) % 2 == 0){
                    System.out.printf("%d ", numbers.get(a));
                }
            }
            System.out.println();
        }
        else if(evenOrOdd.equals("odd")){
            for(int a = 0; a < numbers.size(); a++){
                if(numbers.get(a) % 2 != 0){
                    System.out.printf("%d ", numbers.get(a));
                }
            }
            System.out.println();
        }
    }

    static void getSum(List<Integer> numbers, boolean isContains){
        int sum = 0;
        if(isContains == true){
            for (int a = 0; a < numbers.size(); a++) {
                sum += numbers.get(a);
            }
            System.out.println(sum);
        }
    }

    static void compareAndPrint(List<Integer> numbers, String condition, int number){
        switch(condition){
            case ">": greaterThan(numbers, number); break;
            case "<": lessThan(numbers, number); break;
            case ">=": greaterThanOrEqualTo(numbers, number); break;
            case "<=": lessThanOrEqualTo(numbers, number); break;
            default: break;
        }

    }

    static void  greaterThan(List<Integer> numbers, int number){
        for (int a = 0; a < numbers.size(); a++) {
            if(numbers.get(a) > number){
                System.out.printf("%d ", numbers.get(a));
            }
        }
        System.out.println();
    }

    static void  lessThan(List<Integer> numbers, int number){
        for (int a = 0; a < numbers.size(); a++) {
            if(numbers.get(a) < number){
                System.out.printf("%d ", numbers.get(a));
            }
        }
        System.out.println();
    }

    static void  greaterThanOrEqualTo(List<Integer> numbers, int number){
        for (int a = 0; a < numbers.size(); a++) {
            if(numbers.get(a) >= number){
                System.out.printf("%d ", numbers.get(a));
            }
        }
        System.out.println();
    }

    static void  lessThanOrEqualTo(List<Integer> numbers, int number){
        for (int a = 0; a < numbers.size(); a++) {
            if(numbers.get(a) <= number){
                System.out.printf("%d ", numbers.get(a));
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] commandsAndConditions = new String[3];

        while(true){
            String expression = input.nextLine().toLowerCase();

            if(expression.equals("end")){
                break;
            }

            commandsAndConditions = expression.split(" ");

            switch(commandsAndConditions[0]){
                case "contains": containsANumber(numbers, Integer.parseInt(commandsAndConditions[1])); break;
                case "print": printNumbers(numbers, commandsAndConditions[1]); break;
                case "get": getSum(numbers, commandsAndConditions[1].contains("sum")); break;
                case "filter": compareAndPrint(numbers, commandsAndConditions[1], Integer.parseInt(commandsAndConditions[2])); break;
                default: break;
            }
        }

    }
}
