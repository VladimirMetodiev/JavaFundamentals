package Strings;

import java.util.Scanner;

public class SortTheCharactersIntoAString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String exp = input.nextLine();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        for(int a = 0; a < exp.length(); a++){
            if(exp.charAt(a) >= (char)48 && exp.charAt(a) <= (char)57){
                sb1.append(exp.charAt(a));
            }
            else if(exp.charAt(a) >= (char)65 && exp.charAt(a) <= (char)90 || exp.charAt(a) >= (char)97 && exp.charAt(a) <= (char)122){
                sb2.append(exp.charAt(a));
            }
            else{
                sb3.append(exp.charAt(a));
            }
        }

        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
        System.out.println(sb3.toString());
    }
}

//Agd#53Dfg^&4F53
