package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        boolean itIsValid = true;
        double price = 0.0, totalIncome = 0.0;
        String expression, name = "", product = "";

        while(!(expression = input.nextLine()).equals("end of shift")){
            Pattern pattern = Pattern.compile("^(%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<realNumber>\\d+\\.?\\d+)\\$)$");

            Matcher order = pattern.matcher(expression);

            while(order.find() ? true : itIsValid == false){
                if(!itIsValid){
                    itIsValid = true;
                    continue;
                }

                name = order.group("name");
                product = order.group("product");
                count = Integer.parseInt(order.group("count"));
                price = Double.parseDouble(order.group("realNumber"));

                totalIncome += count * price;
                System.out.printf("%s: %s - %.2f%n", name, product, count * price);
            }
        }

        System.out.printf("Total income: %.2f", totalIncome);
    }
}

//При горният код получавах резултат 70/100, докато промених групата product от [A-Z][a-z]+ на \w+

//Bad code

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        double price = 0.0, totalIncome = 0.0;
//        String expression, name = "", product = "", currentCount = "", currentPrice = "";
//        int count = 0;
//
//        while(!(expression = input.nextLine()).equals("end of shift")){
//            Pattern pattern1 = Pattern.compile("(?<name>(?<=%)[A-Z][a-z]+(?=%))");
//            Pattern pattern2 = Pattern.compile("(?<product>(?<=<)[A-Z][a-z]+(?=>))");
//            Pattern pattern3 = Pattern.compile("(?<count>(?<=\\|)\\d+(?=\\|))");
//            Pattern pattern4 = Pattern.compile("(?<realNumber>\\d+\\.*\\d+(?=\\$))");
//
//            Matcher anotherName = pattern1.matcher(expression);
//            Matcher anotherProduct = pattern2.matcher(expression);
//            Matcher anotherCount = pattern3.matcher(expression);
//            Matcher anotherPrice = pattern4.matcher(expression);
//
//            while(anotherName.find()){
//                name = anotherName.group("name");
//            }
//
//            while(anotherProduct.find()){
//                product = anotherProduct.group("product");
//            }
//
//            while(anotherCount.find()){
//                currentCount = anotherCount.group("count");
//                count = Integer.parseInt(currentCount);
//            }
//
//            while(anotherPrice.find()){
//                currentPrice = anotherPrice.group("realNumber");
//                price = Double.parseDouble(currentPrice);
//            }
//
//            if(name.equals("") || product.equals("") || currentCount.equals("") || currentPrice.equals("")){
//                name = "";
//                product = "";
//                currentCount = "";
//                currentPrice = "";
//                count = 0;
//                price = 0.0;
//                continue;
//            }
//
//            totalIncome += count * price;
//            System.out.printf("%s: %s - %.2f%n", name, product, count * price);
//
//            name = "";
//            product = "";
//            currentCount = "";
//            currentPrice = "";
//            count = 0;
//            price = 0.0;
//        }
//
//        System.out.printf("Total income: %.2f", totalIncome);
//    }
