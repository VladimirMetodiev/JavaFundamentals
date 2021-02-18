package Regex;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = input.nextLine().split(",\\s+");

        LinkedHashMap<String, Integer> participants = new LinkedHashMap<>();
        ArrayList<String> printResult = new ArrayList<>();

        for(int a = 0; a < names.length; a++){
            participants.put(names[a], 0);
        }

        String expression, player = "", current = "";
        int sum = 0, counter = 1;

        while(!(expression = input.nextLine()).equals("end of race")){
            Pattern pattern1 = Pattern.compile("[^\\W\\d]+");
            Pattern pattern2 = Pattern.compile("[\\d]+");

            Matcher name = pattern1.matcher(expression);
            Matcher distance = pattern2.matcher(expression);

            while(distance.find()){
                current = current + distance.group();
            }

            while (name.find()){
                player = player + name.group();
            }

            sum = calculatesSum(current);

            for(Map.Entry<String, Integer> verification : participants.entrySet()){
                if(verification.getKey().equals(player)){
                    participants.put(verification.getKey(), verification.getValue() + sum);
                }
            }

            current = "";
            player = "";
        }

        participants
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .forEach(p -> printResult.add(p.getKey()));

        for(String element : printResult){
            switch (counter){
                case 1: System.out.printf("1st place: %s%n", element); break;
                case 2: System.out.printf("2nd place: %s%n", element); break;
                case 3: System.out.printf("3rd place: %s%n", element); break;
                default: break;
            }
            counter++;
        }
    }


    public static int calculatesSum(String str){
        int sum = 0;
        for (int b = 0; b < str.length(); b++) {
            sum += Integer.parseInt("" + str.charAt(b));
        }
        return sum;
    }
}
