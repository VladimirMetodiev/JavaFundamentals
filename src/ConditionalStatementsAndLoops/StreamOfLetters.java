package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String expression, result = "";
        boolean isItCCommand = false, isItOCommand = false, isItNCommand = false;

        while (true) {

            expression = input.nextLine();

            if (isItCCommand == true && isItNCommand == true && isItOCommand == true) {
                System.out.print(result+ " ");
                result = "";
                isItCCommand = false;
                isItNCommand = false;
                isItOCommand = false;
            }

            if(expression.equals("End")){
                break;
            }

            char letter = expression.charAt(0);

            if (((int) letter >= 65 && (int) letter <= 90) || ((int) letter >= 97 && (int) letter <= 122)) {

                if (letter == 'c' && isItCCommand == false) {
                    isItCCommand = true;
                    continue;
                } else if (letter == 'c' && isItCCommand == true) {
                    result = result + "" + letter;
                    continue;
                }

                if (letter == 'o' && isItOCommand == false) {
                    isItOCommand = true;
                    continue;
                } else if (letter == 'o' && isItOCommand == true) {
                    result = result + "" + letter;
                    continue;
                }

                if (letter == 'n' && isItNCommand == false) {
                    isItNCommand = true;
                    continue;
                } else if (letter == 'n' && isItNCommand == true) {
                    result = result + "" + letter;
                    continue;
                }

                result = result + "" + letter;

            }
        }
    }
}
