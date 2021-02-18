package Arrays;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int numbers = 1;

        for(int index = 1; index < number; index++){
            numbers += index + 1;
        }

        int[][] pascalTriangleOfNumbers = new int[number][numbers];

        for(int firstElement = 0; firstElement < number; firstElement++){
            pascalTriangleOfNumbers[firstElement][0] = 1;
        }

        for(int rows = 1; rows < number; rows++){
            for(int columns = 1; columns < rows + 1; columns++){
                if(pascalTriangleOfNumbers[rows - 1][columns] == 0){
                    pascalTriangleOfNumbers[rows][columns] = 1;
                    break;
                }
                else if(pascalTriangleOfNumbers[rows - 1][columns] > 0){
                    pascalTriangleOfNumbers[rows][columns] = pascalTriangleOfNumbers[rows - 1][columns] + pascalTriangleOfNumbers[rows - 1][columns - 1];
                }
            }
        }

        for(int a = 0; a < number; a++){
            for(int b = 0; b < a + 1; b++){
                if(b < a){
                    System.out.print(pascalTriangleOfNumbers[a][b] + " ");
                }
                else{
                    System.out.print(pascalTriangleOfNumbers[a][b]);
                }
            }
            System.out.println();
        }
    }
}
