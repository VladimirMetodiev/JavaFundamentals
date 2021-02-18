package Regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pattern pattern = Pattern.compile("[\\+][359]+([ -])[2]\\1[\\d]{3}\\1[\\d]{4}\\b");
        Matcher matcher = pattern.matcher(input.nextLine());

        ArrayList<String> phones = new ArrayList<>();

        while (matcher.find()){
            phones.add(matcher.group());
        }

        System.out.print(String.join(", ", phones));
    }
}
