package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String expression = input.nextLine();

        Pattern pattern = Pattern.compile("([^.,;\\:\\!\\s\\-\\_][a-z.\\-_]+@[a-z\\-]+\\.[a-z.]+[^.,;\\:\\!\\s\\-\\_])");
        Matcher matcher = pattern.matcher(expression);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
