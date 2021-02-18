package Regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine().toUpperCase();

        StringBuilder rage = new StringBuilder();

        Pattern pattern = Pattern.compile("(?<rage>[^\\d]+)(?<number>\\d+)");
        Matcher matcher = pattern.matcher(expression);

        while(matcher.find()){
            int number = Integer.parseInt(matcher.group("number"));

            for (int b = 0; b < number; b++) {
                rage.append(matcher.group("rage"));
            }
        }

        ArrayList<Integer> symbols = new ArrayList<>();

        for (int a = 0; a < rage.length(); a++) {
            if(!symbols.contains((int)rage.charAt(a))){
                symbols.add((int)rage.charAt(a));
            }
        }

        System.out.println("Unique symbols used: " + symbols.size());
        System.out.println(rage);
    }
}



//Test

//e-!btI17z=E:DMJ19U1Tvg VQ>11P"qCmo.-0YHYu~o%/%b.}a[=d15fz^"{0^/pg.Ft{W12`aD<l&$W&)*yF1WLV9_GmTf(d0($!$`e/{D'xi]-~17 *%p"%|N>zq@ %xBD18<Y(fHh`@gu#Z#p"Z<v13fI]':\Iz.17*W:\mwV`z-15g@hUYE{_$~}+X%*nytkW15

//Unique symbols:53





//Работещо решение

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String expression = input.nextLine().toUpperCase();
//
//        StringBuilder rage = new StringBuilder();
//
//        Pattern pattern = Pattern.compile("(?<rage>[^\\d]+)(?<number>\\d+)");
//        Matcher matcher = pattern.matcher(expression);
//
//        while(matcher.find()){
//            int number = Integer.parseInt(matcher.group("number"));
//
//            for (int b = 0; b < number; b++) {
//                rage.append(matcher.group("rage"));
//            }
//        }
//
//        System.out.printf("Unique symbols used: %d%n", rage.chars().distinct().count());
//
//        System.out.println(rage);
//    }
