package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class DifferentNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = Integer.parseInt(input.nextLine());
        int secondNumber = Integer.parseInt(input.nextLine());

        if(secondNumber - firstNumber >= 5){
            for(int i = firstNumber; i <= secondNumber - 4; i++){
                for(int j = firstNumber + 1; j <= secondNumber - 3; j++){
                    for (int k = firstNumber + 2; k <= secondNumber - 2; k++){
                        for (int n = firstNumber + 3; n <= secondNumber - 1; n++){
                            for (int m = firstNumber + 4; m <= secondNumber; m++){
                                if(i < j && j < k && k < n && n < m) {
                                    System.out.printf("%d %d %d %d %d%n", i, j, k, n, m);
                                }
                            }
                        }
                    }
                }
            }
        }
        else{
            System.out.println("No");
        }
    }
}



// За да имам 5 числа трябва да направя 5 цикъла и да принтирам стойностите на индексите на циклите.
// "i" се принтира в първата колона, неговата стойност е от "а" до "b - 4", защото в задачата е указано диапазонът между "а" и "b" да бъде 5.
// "j" се принтира във втората колона и т.н.