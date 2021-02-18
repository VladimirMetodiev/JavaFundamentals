package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(input.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String expression;
        String[] commands = new String[3];

        while(!(expression = input.nextLine().toLowerCase()).equals("end")){
            commands = expression.split("\\s+");
            switch (commands[0]){
                case "delete": {
                    numbers = removesNumbers(numbers, Integer.parseInt(commands[1]));
                    break;
                }
                case "insert": {
                    numbers = insertsNumber(numbers, Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                }
                default: {
                    break;
                }
            }
        }

        numbers.forEach(e -> System.out.print(e + " "));
    }

    static List<Integer> removesNumbers(List<Integer> num, int anotherNumber){
        for(int index = 0; index < num.size(); index++){
            if(num.get(index) == anotherNumber){
                num.remove(index);
                index--;
            }
        }
        return num;
    }

    static List<Integer> insertsNumber(List<Integer> num, int anotherNumber, int index){
        if(index < num.size()){
            num.add(index, anotherNumber);
        }
        return num;
    }
}
