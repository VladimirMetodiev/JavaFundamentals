package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        for(int rows = 0; rows < number; rows++){
            for (int columns = 1; columns <= rows + 1; columns++) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
        for (int downRows = number; downRows > 1; downRows--) {
            for (int downColumns = 1; downColumns < downRows; downColumns++) {
                System.out.print(downColumns + " ");
            }
            System.out.println();
        }
    }
}
