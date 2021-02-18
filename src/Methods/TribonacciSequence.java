package Methods;

import java.util.Scanner;

public class TribonacciSequence {
    static void getTribonacciNumbers(int num){
        int first = 1, second = 1, third = 2, fourth;
        System.out.printf("%d %d %d ", first, second, third);

        for(int a = 1; a <= num - 3; a++){
            fourth = third + second + first;
            System.out.printf("%d ", fourth);
            first = second;
            second = third;
            third = fourth;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        if(number == 1){
            System.out.print("1 ");
        }
        else if(number == 2){
            System.out.print("1 1");
        }
        else if(number == 3){
            System.out.print("1 1 2");
        }
        else{
            getTribonacciNumbers(number);
        }
    }
}
