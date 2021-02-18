package Arrays;

import java.util.Scanner;

public class RecursiveFibonacci {
    static long calculateFibonacciNumber(int num){
        if (num <= 2) {
            return 1;
        }

        return calculateFibonacciNumber(num - 1) + calculateFibonacciNumber(num - 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        if(number > 0){
            long result = calculateFibonacciNumber(number);
            System.out.println(result);
        }
        else{
            System.out.println(0);
        }
    }
}



//    static long calculateFibonacciNumber(int num){
//        long current = 0L;
//        long firstFibonacci = 1L;
//        long secondFibonacci = 1L;
//
//        if(num <= 2){
//
//        }
//        else if(num > 2){
//            for(long a = 3; a <= num; a++){
//                current = secondFibonacci;
//                secondFibonacci = secondFibonacci + firstFibonacci;
//                firstFibonacci = current;
//            }
//        }
//
//        return secondFibonacci;
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = Integer.parseInt(input.nextLine());
//
//        if(number > 0){
//            long result = calculateFibonacciNumber(number);
//            System.out.println(result);
//        }
//        else{
//            System.out.println(0);
//        }
//    }


