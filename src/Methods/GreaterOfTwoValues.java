package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    static String getStrings(String a, String b){
        String result = "";
        if(a.compareTo(b) >= 0){
            result = a;
        }
        else{
            result = b;
        }

        return result;
    }

    static String getCharacters(String a, String b){
        String result = "";
        char first = a.charAt(0);
        char second = b.charAt(0);

        if((int)first >= (int)second){
            result = "" + first;
        }
        else{
            result = "" + second;
        }

        return result;
    }

    static String getIntegers(String a, String b){
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);
        String result = "";

        if(first >= second){
            result = "" + first;
        }
        else{
            result = "" + second;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String type = input.nextLine().toLowerCase();
        String firstExpression = input.nextLine();
        String secondExpression = input.nextLine();

        String result = "";

        switch (type){
            case "string": result = getStrings(firstExpression, secondExpression); break;
            case "char": result = getCharacters(firstExpression, secondExpression); break;
            case "int": result = getIntegers(firstExpression, secondExpression); break;
            default: break;
        }

        System.out.println(result);
    }
}
