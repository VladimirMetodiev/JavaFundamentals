package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(input.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String expression;
        String[] commands = new String[3];

        while(true){
            expression = input.nextLine().toLowerCase();
            if(expression.equals("end")){
                break;
            }

            commands = expression.split("\\s+");

            switch(commands[0]){
                case "add": numbers = addsANumber(numbers, Integer.parseInt(commands[1])); break;
                case "insert": numbers = insertsANumber(numbers, Integer.parseInt(commands[1]), Integer.parseInt(commands[2])); break;
                case "remove": numbers = removesANumber(numbers, Integer.parseInt(commands[1])); break;
                case "shift": numbers = shiftsANumber(numbers, commands[1], Integer.parseInt(commands[2])); break;
                default: break;
            }
        }

        numbers.forEach(e -> System.out.print(e + " "));
    }

    static List<Integer> addsANumber(List<Integer> numbers, int num){
        numbers.add(num);
        return numbers;
    }

    static List<Integer> insertsANumber(List<Integer> numbers, int num, int index){
        try{
            numbers.add(index, num);
        }
        catch(Exception exc){
            System.out.println("Invalid index");
        }
        return numbers;
    }

    static List<Integer> removesANumber(List<Integer> numbers, int index){
        try{
            numbers.remove(index);
        }
        catch(Exception exc){
            System.out.println("Invalid index");
        }
        return numbers;
    }

    static List<Integer> shiftsANumber(List<Integer> numbers, String position, int num){
        int current = 0;
        if(position.equals("left")){
            for(int a = 0; a < num; a++){
                current = numbers.get(0);
                numbers.remove(0);
                numbers.add(current);
            }
        }
        else if(position.equals("right")){
            for(int a = 0; a < num; a++){
                current = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(0, current);
            }
        }
        return numbers;
    }
}
