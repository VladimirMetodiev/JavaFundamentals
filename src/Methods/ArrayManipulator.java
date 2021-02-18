package Methods;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayManipulator {
    static int[] manipulateTheArray(int[]numbers, String order){
        String[] commandAndParameters = new String[3];
        commandAndParameters = order.split(" ");
        String command = commandAndParameters[0];
        int num = -1, current = 0, count = 0;
        String evenOrOdd = "";

        switch (command){
            case "exchange":{
                num = Integer.parseInt(commandAndParameters[1]);

                if(num < 0 || num >= numbers.length){
                    System.out.println("Invalid index");
                    break;
                }

                for (int a = 0; a < num + 1; a++) {
                    current = numbers[0];
                    for (int b = 0; b < numbers.length - 1; b++) {
                        numbers[b] = numbers[b + 1];
                    }
                    numbers[numbers.length - 1] = current;
                }

                break;
            }
            case "max": getMaxNumber(numbers, evenOrOdd = commandAndParameters[1]); break;
            case "min": getMinNumber(numbers, evenOrOdd = commandAndParameters[1]); break;
            case "first": takeTheFirstOneCorrespondingTo(numbers, count = Integer.parseInt(commandAndParameters[1]), evenOrOdd = commandAndParameters[2]); break;
            case "last": takeTheLastOneCorrespondingTo(numbers, count = Integer.parseInt(commandAndParameters[1]), evenOrOdd = commandAndParameters[2]); break;
            default: break;
        }

        return numbers;
    }

    static void getMaxNumber(int[] anotherNumbers, String parameter){
        int saveNumber = Integer.MIN_VALUE, saveIndex = -1;

        for(int c = 0; c < anotherNumbers.length; c++){
            if(parameter.equals("even") && anotherNumbers[c] % 2 == 0 && anotherNumbers[c] >= saveNumber){
                saveIndex = c;
                saveNumber = anotherNumbers[c];
            }
            else if(parameter.equals("odd") && anotherNumbers[c] % 2 != 0 && anotherNumbers[c] >= saveNumber){
                saveIndex = c;
                saveNumber = anotherNumbers[c];
            }
        }

        if(saveIndex == -1){
            System.out.println("No matches");
        }
        else{
            System.out.println(saveIndex);
        }

        saveIndex = - 1;
        saveNumber = Integer.MIN_VALUE;
    }

    static void getMinNumber(int[] anotherNumbers, String parameter){
        int saveNumber = Integer.MAX_VALUE, saveIndex = -1;

        for(int c = 0; c < anotherNumbers.length; c++){
            if(parameter.equals("even") && anotherNumbers[c] % 2 == 0 && anotherNumbers[c] <= saveNumber){
                saveIndex = c;
                saveNumber = anotherNumbers[c];
            }
            else if(parameter.equals("odd") && anotherNumbers[c] % 2 != 0 && anotherNumbers[c] <= saveNumber){
                saveIndex = c;
                saveNumber = anotherNumbers[c];
            }
        }

        if(saveIndex == -1){
            System.out.println("No matches");
        }
        else{
            System.out.println(saveIndex);
        }

        saveIndex = - 1;
        saveNumber = Integer.MAX_VALUE;
    }

    static void takeTheFirstOneCorrespondingTo(int[] anotherNumbers, int otherNumber, String parameter){
        int counter = 0;

        if(otherNumber <= anotherNumbers.length){
            System.out.print("[");
            for(int c = 0; c < anotherNumbers.length; c++){
                if(counter == otherNumber){
                    break;
                }

                if(parameter.equals("even") && anotherNumbers[c] % 2 == 0){
                    counter++;

                    if(counter == 1){
                        System.out.print(anotherNumbers[c]);
                    }
                    if(counter < otherNumber && counter != 1){
                        System.out.print(", " + anotherNumbers[c]);
                    }
                    else if(counter == otherNumber && counter != 1){
                        System.out.print(", " + anotherNumbers[c]);
                    }
                }
                else if(parameter.equals("odd") && anotherNumbers[c] % 2 != 0){
                    counter++;

                    if(counter == 1){
                        System.out.print(anotherNumbers[c]);
                    }
                    if(counter < otherNumber && counter != 1){
                        System.out.print(", " + anotherNumbers[c]);
                    }
                    else if(counter == otherNumber && counter != 1){
                        System.out.print(", " + anotherNumbers[c]);
                    }
                }
            }
            System.out.println("]");
        }
        else{
            System.out.println("Invalid count");
        }
    }

    static void takeTheLastOneCorrespondingTo(int[] anotherNumbers, int otherNumber, String parameter){
        int counter = 0;
        int[] otherArray = new int[otherNumber];

        if(otherNumber <= anotherNumbers.length){
            for(int c = anotherNumbers.length - 1; c >= 0; c--){
                if(counter == otherNumber){
                    break;
                }

                if(parameter.equals("even") && anotherNumbers[c] % 2 == 0){
                    otherArray[counter] = anotherNumbers[c];
                    counter++;
                }
                else if(parameter.equals("odd") && anotherNumbers[c] % 2 != 0){
                    otherArray[counter] = anotherNumbers[c];
                    counter++;
                }
            }

            System.out.print("[");
            for(int print = otherArray.length - 1; print >= 0; print--){
                if(otherArray[print] == 0){

                }
                else if(print > 0){
                    System.out.print(otherArray[print] + ", ");
                }
                else if(print == 0){
                    System.out.print(otherArray[print]);
                }
            }
            System.out.println("]");
        }
        else{
            System.out.println("Invalid count");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Arrays.stream(input.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        String command = "";

        while(!(command = input.nextLine().toLowerCase()).equals("end")){
            array = manipulateTheArray(array, command);
        }

        System.out.print("[");
        for(int print = 0; print < array.length; print++){
            if(print == array.length - 1){
                System.out.print(array[print]);
            }
            else{
                System.out.print(array[print] + ", ");
            }
        }
        System.out.println("]");
    }
}
