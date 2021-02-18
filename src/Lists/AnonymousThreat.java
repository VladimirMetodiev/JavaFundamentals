package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> elements = Arrays.stream(input.nextLine().split("\\s+")).collect(Collectors.toList());

        String expression;
        String[] command;

        while(!(expression = input.nextLine().toLowerCase()).equals("3:1")){
            command = expression.split("\\s+");
            switch (command[0]){
                case "merge": elements = mergesStrings(elements, Integer.parseInt(command[1]), Integer.parseInt(command[2])); break;
                case "divide": elements = dividesString(elements, Integer.parseInt(command[1]), Integer.parseInt(command[2])); break;
                default: break;
            }
        }

        elements.forEach(e -> System.out.print(e + " "));
    }

    static List<String> mergesStrings(List<String> str, int startIndex, int endIndex){
        String newExpression = "";

        if(startIndex < 0){
            startIndex = 0;
        }

        if(endIndex > str.size() - 1){
            endIndex = str.size() - 1;
        }

        int indexOfTheNewExpression = startIndex;

        for (int otherIndex = startIndex; otherIndex <= endIndex; otherIndex++) {
            newExpression += str.get(indexOfTheNewExpression);
            str.remove(indexOfTheNewExpression);
        }

        if(str.size() < indexOfTheNewExpression){
            str.add(newExpression);
        }
        else{
            str.add(indexOfTheNewExpression, newExpression);
        }

        return str;
    }

    static List<String> dividesString(List<String> str, int index, int partitions){
        if(index >= 0 && index < str.size() && partitions >= 0 && partitions <= 100){
            String newExpression = str.get(index);
            str.remove(index);
            int number = newExpression.length();
            int portionLength = number / partitions;

            if(number % partitions == 0){
                int anotherStartIndex = 0;
                int anotherEndIndex = portionLength;

                for(int a = 0; a < partitions; a++){
                    str.add(index + a, newExpression.substring(anotherStartIndex, anotherEndIndex));
                    anotherStartIndex += portionLength;
                    anotherEndIndex += portionLength;
                }
            }
            else if(number % partitions != 0){
                int anotherStartIndex = 0;
                int anotherEndIndex = portionLength;


                for(int a = 0; a < partitions; a++){
                    if(a == partitions - 1){
                        str.add(index + partitions - 1, newExpression.substring(number - 1 - portionLength, number - 1));
                        break;
                    }

                    str.add(index + a, newExpression.substring(anotherStartIndex, anotherEndIndex));
                    anotherStartIndex += portionLength;
                    anotherEndIndex += portionLength;
                }
            }
        }

        return str;
    }
}


// 80/100

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        List<String> elements = Arrays.stream(input.nextLine().split("\\s+")).collect(Collectors.toList());
//
//        String expression;
//        String[] command;
//
//        while(!(expression = input.nextLine().toLowerCase()).equals("3:1")){
//            command = expression.split("\\s+");
//            switch (command[0]){
//                case "merge": elements = mergesStrings(elements, Integer.parseInt(command[1]), Integer.parseInt(command[2])); break;
//                case "divide": elements = dividesString(elements, Integer.parseInt(command[1]), Integer.parseInt(command[2])); break;
//                default: break;
//            }
//        }
//
//        elements.forEach(e -> System.out.print(e + " "));
//    }
//
//    static List<String> mergesStrings(List<String> str, int startIndex, int endIndex){
//        String newExpression = "";
//
//        //за вход мога да получа startIndex и endIndex в интервала [-1000, 1000]
//
//        if(startIndex < 0){
//            startIndex = 0;
//        }
//
//        if(endIndex > str.size() - 1){
//            endIndex = str.size() - 1;
//        }
//
//        if(startIndex <= str.size() - 2){
//            for (int otherIndex = startIndex; otherIndex <= endIndex; otherIndex++) {
//                newExpression += str.get(otherIndex);
//            }
//
//            for (int anotherIndex = endIndex; anotherIndex >= startIndex; anotherIndex--) {
//                str.remove(anotherIndex);
//            }
//            str.add(startIndex, newExpression);
//        }
//
//        return str;
//    }
//
//    static List<String> dividesString(List<String> str, int index, int partitions){
//
//        //index винаги трябва да бъде в рамките на елементите на масива, а partitions трябва да бъде в диапазона [0, 100]
//
//        if(index >= 0 && index < str.size() && partitions >= 0 && partitions <= 100){
//            String newExpression = str.get(index);
//            str.remove(index);
//            int number = newExpression.length();
//
//            if(number % partitions == 0){
//                int anotherStartIndex = 0;
//                int anotherEndIndex = (number / partitions);
//
//                for(int a = 0; a < partitions; a++){
//                    str.add(index + a, newExpression.substring(anotherStartIndex, anotherEndIndex));
//                    anotherStartIndex += number / partitions;
//                    anotherEndIndex += number / partitions;
//                }
//            }
//            else if(number % partitions != 0){
//                int anotherStartIndex = 0;
//                int anotherEndIndex = (number / partitions);
//
//                for(int a = 0; a < partitions; a++){
//                    if(a == partitions - 1){
//                        str.add(index + partitions - 1, newExpression.substring(number - (number / partitions) - 1, number - 1));
//                        break;
//                    }
//
//                    str.add(index + a, newExpression.substring(anotherStartIndex, anotherEndIndex));
//                    anotherStartIndex += number / partitions;
//                    anotherEndIndex += number / partitions;
//                }
//            }
//        }
//
//        return str;
//    }



//    public static void main(String[] args) {
//        Scanner trickyProblem = new Scanner(System.in);
//        List<String> elements = Arrays.stream(trickyProblem.nextLine().split("\\s+")).collect(Collectors.toList());
//
//        String expression;
//
//        while(!(expression = trickyProblem.nextLine().toLowerCase()).equals("3:1")){
//            String[] tokens = expression.split(" ");
//            String command = tokens[0];
//            int start = Math.min(Integer.parseInt(tokens[1]), elements.size() - 1);
//            start = Math.max(0, start);
//            int end = Integer.parseInt(tokens[2]);
//
//            List<String> result = new ArrayList<>();
//
//            if(command.equals("merge")){
//                end = Math.min(Integer.parseInt(tokens[2]), elements.size() - 1);
//                end = Math.max(0, end);
//                if(start > 0){
//                    result.addAll(elements.subList(0, start));
//                }
//                String merged = elements.subList(start, end + 1).stream().reduce((res, el) -> res + el).get();
//                result.add(merged);
//                if(end + 1 < elements.size()){
//                    result.addAll(elements.subList(end + 1, elements.size()));
//                }
//                elements = result;
//            }
//            else{
//                String element = elements.get(start);
//                end = Math.min(end, element.length());
//                int symbols = element.length() / end;
//                int lastElementLength = symbols + element.length() % end;
//                int parts = element.length() - lastElementLength;
//
//                String lastElement = element.substring(element.length() - lastElementLength);
//                element = element.substring(0, element.length() - lastElementLength);
//
//                for(int a = 0; a < parts && element.length() > 0; a++){
//                    result.add(element.substring(0, symbols));
//                    element = element.substring(symbols);
//                }
//
//                if(!element.isEmpty()){
//                    result.add(element);
//                }
//
//                if(!lastElement.isEmpty()){
//                    result.add(lastElement);
//                }
//
//                elements.remove(start);
//                elements.addAll(start, result);
//            }
//        }
//
//        elements.forEach(e -> System.out.print(e + " "));
//    }



