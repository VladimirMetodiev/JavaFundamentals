package Regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecretHelperOfSanta {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        String expression;
        StringBuilder decryptedMessage = new StringBuilder();
        ArrayList<String> goodChildren = new ArrayList<>();

        Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^@\\-!:>]+!(?<behaviour>[G|N])!");

        while(!(expression = input.nextLine()).equals("end")){
            for (int a = 0; a < expression.length(); a++) {
                decryptedMessage.append((char)((int)expression.charAt(a) - number));
            }

            Matcher child = pattern.matcher(decryptedMessage);

            while (child.find()){
                if(child.group("behaviour").equals("G")){
                    goodChildren.add(child.group("name"));
                }
            }

            decryptedMessage.setLength(0);
        }

        for(String name : goodChildren){
            System.out.println(name);
        }
    }
}


//Първоначално бях написал регулярният израз по следният начин: @(?<name>[A-Z][a-z]+)[^@\-!:>]+!(?<behaviour>[G|N])!
//За да получа 100/100 го промених на @(?<name>[A-Za-z]+)[^@\-!:>]+!(?<behaviour>[GN])!
