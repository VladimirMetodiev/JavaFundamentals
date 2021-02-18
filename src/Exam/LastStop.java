package Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastStop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(input.nextLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String expression;
        String[] instructions;

        while(!(expression = input.nextLine()).equals("END")){
            instructions = expression.split("\\s+");

            switch(instructions[0]){
                case "Change": numbers = changesThePaintings(numbers, Integer.parseInt(instructions[1]), Integer.parseInt(instructions[2])); break;
                case "Hide": numbers = hidesThePainting(numbers, Integer.parseInt(instructions[1])); break;
                case "Switch": numbers = switchesThePaintings(numbers, Integer.parseInt(instructions[1]), Integer.parseInt(instructions[2])); break;
                case "Insert": numbers = insertsThePainting(numbers, Integer.parseInt(instructions[1]), Integer.parseInt(instructions[2])); break;
                case "Reverse": numbers = reversesThePaintings(numbers); break;
                default: break;
            }
        }

        numbers.forEach(painting -> System.out.printf("%d ", painting));
    }


    public static List<Integer> changesThePaintings(List<Integer> numbers, int paintingNumber, int changedNumber){
        if(numbers.contains(paintingNumber)){
            numbers.set(numbers.indexOf(paintingNumber), changedNumber);
        }
        return numbers;
    }


    public static List<Integer> hidesThePainting(List<Integer> numbers, int paintingNumber){
        if(numbers.contains(paintingNumber)){
            numbers.remove(numbers.indexOf(paintingNumber));
        }
        return numbers;
    }


    public static List<Integer> switchesThePaintings(List<Integer> numbers, int paintingNumber, int changedNumber){
        if(numbers.contains(paintingNumber) && numbers.contains(changedNumber)){
            int firstPaintingIndex = numbers.indexOf(paintingNumber);
            int secondPaintingIndex = numbers.indexOf(changedNumber);

            numbers.set(firstPaintingIndex, changedNumber);
            numbers.set(secondPaintingIndex, paintingNumber);
        }

        return numbers;
    }


    public static List<Integer> insertsThePainting(List<Integer> numbers, int index, int paintingNumber){
        if(index >= 0 && index < numbers.size()){
            numbers.add(index + 1, paintingNumber);
        }
        return numbers;
    }


    public static List<Integer> reversesThePaintings(List<Integer> numbers){
        Collections.reverse(numbers);
        return numbers;
    }
}



//Mid Exam - 10 March 2019
