package Methods;

import java.util.Scanner;

public class PasswordValidator {
    static void validateAPassword(String exp){
        boolean judge = true;
        boolean hasOnlyLettersAndDigits = true;

        int length = exp.length();
        if(length < 6 || length > 10){
            judge = false;
            System.out.println("Password must be between 6 and 10 characters");
        }

        int symbol = 0;

        for (int a = 0; a < length; a++) {
            symbol = (int)exp.charAt(a);
            if(symbol < 48 || (symbol > 57 && symbol < 65) || (symbol > 90 && symbol < 97) || symbol > 122){
                judge = false;
                hasOnlyLettersAndDigits = false;
                break;
            }
        }

        if(hasOnlyLettersAndDigits == false){
            System.out.println("Password must consist only of letters and digits");
        }

        int counter = 0;

        for (int b = 0; b < length; b++) {
            try{
                int num = Integer.parseInt("" + exp.charAt(b));
                counter++;
            }
            catch (Exception ex){

            }
        }

        if(counter < 2){
            judge = false;
            System.out.println("Password must have at least 2 digits");
        }

        if(judge == true){
            System.out.println("Password is valid");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        validateAPassword(password);
    }
}
