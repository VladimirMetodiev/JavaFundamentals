package Regex;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] expression = input.nextLine().split("\\|");

        String capitals = "";
        char letter;
        int length;
        String[] message;
        String[] text = expression[2].split("\\s+");

        Pattern pattern1 = Pattern.compile("([#$%*&])(?<capitalLetters>[A-Z]+)([#$%*&])");
        Matcher matcher1 = pattern1.matcher(expression[0]);

        Pattern pattern2 = Pattern.compile("(?<one>\\d+):(?<two>\\d{2})");
        Matcher matcher2 = pattern2.matcher(expression[1]);

        while(matcher1.find()){
            capitals = matcher1.group("capitalLetters");
        }

        message = new String[capitals.length()];

        while(matcher2.find()){
            letter = (char)(Integer.parseInt(matcher2.group("one")));
            length = 1 + Integer.parseInt(matcher2.group("two"));

            for (int a = 0; a < capitals.length(); a++) {
                if(capitals.charAt(a) == letter){
                    for (int b = 0; b < text.length; b++) {
                        if(text[b].charAt(0) == letter && text[b].length() == length){
                            message[a] = text[b];
                        }
                    }
                }
            }
        }

        for(String word : message){
            System.out.println(word);
        }
    }
}



//100/100

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] expression = input.nextLine().split("\\|");
//
//        String current = "", message = "";
//        int length, letter;
//        LinkedHashMap<Integer, Integer> codeAndLength = new LinkedHashMap<>();
//        String[] text = expression[2].split("\\s+");
//
//        Pattern pattern1 = Pattern.compile("([#$%*&])(?<capitalLetters>[A-Z]+)([#$%*&])");
//        Matcher matcher1 = pattern1.matcher(expression[0]);
//
//        Pattern pattern2 = Pattern.compile("(?<one>\\d+):(?<two>\\d{2})");
//        Matcher matcher2 = pattern2.matcher(expression[1]);
//
//        while(matcher1.find()){
//            message = matcher1.group("capitalLetters");
//        }
//
//        while(matcher2.find()){
//            letter = Integer.parseInt(matcher2.group("one"));
//            length = 1 + Integer.parseInt(matcher2.group("two"));
//
//            codeAndLength.put(letter, length);
//        }
//
//        for (int b = 0; b < message.length(); b++) {
//            int asciiCode = (int)message.charAt(b);
//            for(Map.Entry<Integer, Integer> element : codeAndLength.entrySet()){
//                if(asciiCode == element.getKey()){
//                    for (int c = 0; c < text.length; c++) {
//                        if(element.getKey() == (int)text[c].charAt(0) && element.getValue() == text[c].length()){
//                            System.out.println(text[c]);
//                        }
//                    }
//                }
//            }
//        }
//    }



//80/100

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] expression = input.nextLine().split("\\|");
//
//        String current = "";
//        char letter = ' ';
//        int length = 0;
//        ArrayList<String> message = new ArrayList<>();
//        String[] text = expression[2].split("\\s+");
//
//        Pattern pattern1 = Pattern.compile("[#$%*&][A-Z]+[#$%*&]");
//        Matcher matcher1 = pattern1.matcher(expression[0]);
//
//        Pattern pattern2 = Pattern.compile("(?<one>\\d+):(?<two>\\d{2})");
//        Matcher matcher2 = pattern2.matcher(expression[1]);
//
//        while(matcher1.find()){
//            for(int a = 0; a < matcher1.group().length(); a++){
//                current = "" + matcher1.group().charAt(a);
//                if(!current.equals("#") && !current.equals("$") && !current.equals("%") && !current.equals("*") && !current.equals("&")){
//                    message.add(current);
//                }
//            }
//        }
//
//        while(matcher2.find()){
//            letter = (char)(Integer.parseInt(matcher2.group("one")));
//            length = 1 + Integer.parseInt(matcher2.group("two"));
//
//            for (int b = 0; b < text.length; b++) {
//                if(letter == text[b].charAt(0) && length == text[b].length()){
//                    current = text[b];
//                    for (int c = 0; c < message.size(); c++) {
//                        if(message.get(c).equals("" + letter)){
//                            message.set(c, current);
//                        }
//                    }
//                }
//            }
//        }
//
//        for(String word : message){
//            System.out.println(word);
//        }
//
//    }

