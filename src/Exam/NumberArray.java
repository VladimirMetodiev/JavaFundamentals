package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numberArray = Arrays.stream(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String expression;
        String[] data;

        while (!(expression = input.nextLine()).equals("End")) {
            data = expression.split("\\s+");

            switch (data[0]) {
                case "Switch":
                    switchesTheNumber(numberArray, Integer.parseInt(data[1]));
                    break;
                case "Change":
                    changesTheNumber(numberArray, Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                    break;
                case "Sum":
                    choosesWhichNumbersToSum(numberArray, data[1]);
                    break;
                default:
                    break;
            }
        }

        for(int positiveNumber : numberArray){
            if(positiveNumber >= 0){
                System.out.printf("%d ", positiveNumber);
            }
        }
    }


    public static void switchesTheNumber(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            array[index] = -1 * array[index];
        }
    }


    public static void changesTheNumber(int[] array, int index, int number) {
        if (index >= 0 && index < array.length) {
            array[index] = number;
        }
    }


    public static void choosesWhichNumbersToSum(int[] array, String choice) {
        if (choice.equals("Negative")) {
            int sum = 0;
            for (int num : array) {
                if (num < 0) {
                    sum += num;
                }
            }
            System.out.println(sum);
        }
        else if (choice.equals("Positive")) {
            int sum = 0;
            for (int num : array) {
                if (num >= 0) {
                    sum += num;
                }
            }
            System.out.println(sum);
        }
        else {
            int sum = 0;
            for (int num : array){
                sum += num;
            }
            System.out.println(sum);
        }
    }
}

//Programming Fundamentals Mid Exam - 30 June 2019
