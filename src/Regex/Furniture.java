package Regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0d;
        String expression, current;
        ArrayList<String> purchase = new ArrayList<>();
        Pattern pattern = Pattern.compile("[>]{2}(?<product>[A-za-z]+)[<]{2}(?<num1>\\d+)[\\.]*(?<num2>\\d*)[\\!](?<number>\\d+)");

        while(!(expression = input.nextLine()).equals("Purchase")){
            Matcher furniture = pattern.matcher(expression);

            while(furniture.find()){
                purchase.add(furniture.group("product"));
                current = furniture.group("num1") + "." + furniture.group("num2");
                sum += Double.parseDouble(current) * Double.parseDouble(furniture.group("number"));
            }
        }

        System.out.println("Bought furniture:");

        for(String result : purchase){
            System.out.println(result);
        }

        System.out.printf("Total money spend: %.2f", sum);
    }
}
