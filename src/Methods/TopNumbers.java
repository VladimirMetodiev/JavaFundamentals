package Methods;

import java.util.Scanner;

public class TopNumbers {
    static void getTopNumbers(int num){
        for(int a = 1; a <= num; a++){
            boolean judge = true;
            int anotherNumber = a, sumOfDigits = 0, digit = a;
            String current = "" + anotherNumber;

            for (int addition = 1; addition <= current.length(); addition++) {
                sumOfDigits += digit % 10;
                digit /= 10;
            }

            if(sumOfDigits % 8 != 0){
                continue;
            }

            for (int b = 1; b <= current.length() ; b++) {
                if((anotherNumber % 10) % 2 == 0){
                    judge = false;
                }
                else{
                    judge = true;
                    break;
                }
                anotherNumber /= 10;
            }

            if(judge == true){
                System.out.println(a);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        getTopNumbers(number);
    }
}
