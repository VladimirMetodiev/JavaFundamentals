package DataTypesAndVariables;

import java.math.BigInteger;
import java.util.Scanner;

public class ConvertFromHexFormatIntoDecFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int zeroCurrent = 1;
        int zero = 0;
        int oneCurrent = 1;
        int one = 0;
        int twoCurrent = 1;
        int two = 0;
        int threeCurrent = 1;
        int three = 0;
        int fourCurrent = 1;
        int four = 0;
        int fiveCurrent = 1;
        int five = 0;
        int sixCurrent = 1;
        int six = 0;
        int sevenCurrent = 1;
        int seven = 0;
        int eightCurrent = 1;
        int eight = 0;
        int nineCurrent = 1;
        int nine = 0;
        int aCurrent = 1;
        int a = 0;
        int bCurrent = 1;
        int b = 0;
        int cCurrent = 1;
        int c = 0;
        int dCurrent = 1;
        int d = 0;
        int eCurrent = 1;
        int e = 0;
        int fCurrent = 1;
        int f = 0;
        int sum = 0;

        String hexNumber = input.nextLine();

        if(hexNumber.charAt(1) == 'x'){
            for (int i = 0; i < hexNumber.length() - 2; i++) {
                char letter = hexNumber.charAt(i + 2);
                switch (letter) {
                    case '0': {
                        zero = 0;
                        break;
                    }
                    case '1': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            oneCurrent *= 16;
                        }
                        one = 1 * oneCurrent;
                        break;
                    }
                    case '2': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            twoCurrent *= 16;
                        }
                        two = 2 * twoCurrent;
                        break;
                    }
                    case '3': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            threeCurrent *= 16;
                        }
                        three = 3 * threeCurrent;
                        break;
                    }
                    case '4': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            fourCurrent *= 16;
                        }
                        four = 4 * fourCurrent;
                        break;
                    }
                    case '5': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            fiveCurrent *= 16;
                        }
                        five = 5 * fiveCurrent;
                        break;
                    }
                    case '6': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            sixCurrent *= 16;
                        }
                        six = 6 * sixCurrent;
                        break;
                    }
                    case '7': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            sevenCurrent *= 16;
                        }
                        seven = 7 * sevenCurrent;
                        break;
                    }
                    case '8': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            eightCurrent *= 16;
                        }
                        eight = 8 * eightCurrent;
                        break;
                    }
                    case '9': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            nineCurrent *= 16;
                        }
                        nine = 9 * nineCurrent;
                        break;
                    }
                    case 'A': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            aCurrent *= 16;
                        }
                        a = 10 * aCurrent;
                        break;
                    }
                    case 'B': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            bCurrent *= 16;
                        }
                        b = 11 * bCurrent;
                        break;
                    }
                    case 'C': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            cCurrent *= 16;
                        }
                        c = 12 * cCurrent;
                        break;
                    }
                    case 'D': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            dCurrent *= 16;
                        }
                        d = 13 * dCurrent;
                        break;
                    }
                    case 'E': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            eCurrent *= 16;
                        }
                        e = 14 * eCurrent;
                        break;
                    }
                    case 'F': {
                        for (int j = i + 2; j < hexNumber.length() - 1; j++) {
                            fCurrent *= 16;
                        }
                        f = 15 * fCurrent;
                        break;
                    }
                }
                sum = sum + one + two + three + four + five + six + seven + eight + nine + a + b + c + d + e + f;
                one = 0;
                two = 0;
                three = 0;
                four = 0;
                five = 0;
                six = 0;
                seven = 0;
                eight = 0;
                nine = 0;
                a = 0;
                b = 0;
                c = 0;
                d = 0;
                e = 0;
                f = 0;

            }
            System.out.println(sum);
        }
        else {
            for (int i = 0; i < hexNumber.length(); i++) {
                char letter = hexNumber.charAt(i);
                switch (letter) {
                    case '0': {
                        zero = 0;
                        break;
                    }
                    case '1': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            oneCurrent *= 16;
                        }
                        one = 1 * oneCurrent;
                        break;
                    }
                    case '2': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            twoCurrent *= 16;
                        }
                        two = 2 * twoCurrent;
                        break;
                    }
                    case '3': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            threeCurrent *= 16;
                        }
                        three = 3 * threeCurrent;
                        break;
                    }
                    case '4': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            fourCurrent *= 16;
                        }
                        four = 4 * fourCurrent;
                        break;
                    }
                    case '5': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            fiveCurrent *= 16;
                        }
                        five = 5 * fiveCurrent;
                        break;
                    }
                    case '6': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            sixCurrent *= 16;
                        }
                        six = 6 * sixCurrent;
                        break;
                    }
                    case '7': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            sevenCurrent *= 16;
                        }
                        seven = 7 * sevenCurrent;
                        break;
                    }
                    case '8': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            eightCurrent *= 16;
                        }
                        eight = 8 * eightCurrent;
                        break;
                    }
                    case '9': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            nineCurrent *= 16;
                        }
                        nine = 9 * nineCurrent;
                        break;
                    }
                    case 'A': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            aCurrent *= 16;
                        }
                        a = 10 * aCurrent;
                        break;
                    }
                    case 'B': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            bCurrent *= 16;
                        }
                        b = 11 * bCurrent;
                        break;
                    }
                    case 'C': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            cCurrent *= 16;
                        }
                        c = 12 * cCurrent;
                        break;
                    }
                    case 'D': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            dCurrent *= 16;
                        }
                        d = 13 * dCurrent;
                        break;
                    }
                    case 'E': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            eCurrent *= 16;
                        }
                        e = 14 * eCurrent;
                        break;
                    }
                    case 'F': {
                        for (int j = i; j < hexNumber.length() - 1; j++) {
                            fCurrent *= 16;
                        }
                        f = 15 * fCurrent;
                        break;
                    }
                }
                sum = sum + one + two + three + four + five + six + seven + eight + nine + a + b + c + d + e + f;
                one = 0;
                two = 0;
                three = 0;
                four = 0;
                five = 0;
                six = 0;
                seven = 0;
                eight = 0;
                nine = 0;
                a = 0;
                b = 0;
                c = 0;
                d = 0;
                e = 0;
                f = 0;

            }
            System.out.println(sum);
        }
//        String hexNumber = input.nextLine();
//        int decNumber = Integer.parseInt(hexNumber, 16);
//        System.out.println(decNumber);

//        String inputHexNum = input.nextLine();
//        long outputDecNum = Long.parseLong(inputHexNum, 16);
//        System.out.println(outputDecNum);

//        String hexNum = input.nextLine();
//        BigInteger decNum = new BigInteger(hexNum, 16);
//        System.out.println(decNum);
    }
}
