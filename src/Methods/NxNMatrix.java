package Methods;

import java.util.Scanner;

public class NxNMatrix {
    static void printAMatrixOfNumbers(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        printAMatrixOfNumbers(number);
    }
}
