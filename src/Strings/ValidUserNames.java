package Strings;

import java.util.Scanner;

public class ValidUserNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String exp = input.nextLine();
        String[] data = exp.split(", ");


        for (int a = 0; a < data.length; a++) {
            if (data[a].length() < 3 || data[a].length() > 16) {
                continue;
            }

            if (!checkTheSymbols(data[a])) {
                continue;
            }

            System.out.println(data[a]);
        }
    }

    public static boolean checkTheSymbols(String userName) {
        boolean result = true;

        for (int a = 0; a < userName.length(); a++) {
            if (!(userName.charAt(a) >= (char) 48 && userName.charAt(a) <= (char) 57) &&
                    !(userName.charAt(a) >= (char) 65 && userName.charAt(a) <= (char) 90) &&
                    !(userName.charAt(a) >= (char) 97 && userName.charAt(a) <= (char) 122) &&
                    !(userName.charAt(a) == (char) 45) &&
                    !(userName.charAt(a) == (char) 95)){
                        result = false;
                        if(!result){
                            break;
                        }
            }
        }

        return result;
    }
}

//hyphen = -            ASCII code: 45
//underscore = _        ASCII code: 95