package Regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfMessages = Integer.parseInt(input.nextLine());

        String expression, decryptedMessage, planet, typeOfAttack;

        boolean isItValid = true;

        Pattern pattern = Pattern.compile("@(?<planet>[A-Z][a-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<typeOfAttack>[A-Z])![^@\\-!:>]*\\->(?<soldiers>\\d+)");

        TreeMap<String, ArrayList<String>> warInformation = new TreeMap<>();
        warInformation.put("Attacked planets", new ArrayList<>());
        warInformation.put("Destroyed planets", new ArrayList<>());

        for(int a = 1; a <= numberOfMessages; a++){
            expression = input.nextLine();
            decryptedMessage = decryptsTheMessage(expression);

            Matcher matcher = pattern.matcher(decryptedMessage);

            while(matcher.find() ? true : isItValid == false){
                if(!isItValid){
                    isItValid = true;
                    continue;
                }

                planet = matcher.group("planet");
                typeOfAttack = matcher.group("typeOfAttack");

                if(typeOfAttack.equals("A")){
                    warInformation.get("Attacked planets").add(planet);
                }
                else if(typeOfAttack.equals("D")){
                    warInformation.get("Destroyed planets").add(planet);
                }
            }
        }

        warInformation
                .entrySet()
                .stream()
                .forEach(k -> {
                    System.out.printf("%s: %d%n", k.getKey(), k.getValue().size());

                    k
                            .getValue()
                            .stream()
                            .sorted(String::compareTo)
                            .forEach(pl -> System.out.println("-> " + pl));
                });
    }


    public static String decryptsTheMessage(String message){
        int code = countsTheSymbols(message);
        String decryptedMessage = "";

        for (int c = 0; c < message.length(); c++) {
            decryptedMessage = decryptedMessage + (char)((int)message.charAt(c) - code);
        }

        return decryptedMessage;
    }


    public static int countsTheSymbols(String message){
        int counter = 0;

        for (int b = 0; b < message.length(); b++) {
            if(message.charAt(b) == 's'
                    || message.charAt(b) == 't'
                    || message.charAt(b) == 'a'
                    || message.charAt(b) == 'r'
                    || message.charAt(b) == 'S'
                    || message.charAt(b) == 'T'
                    || message.charAt(b) == 'A'
                    || message.charAt(b) == 'R'){
                counter++;
            }
        }

        return counter;
    }
}
