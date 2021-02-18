package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class HTMLFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String title = input.nextLine();
        String content = input.nextLine();

        String expression;
        ArrayList<String> comments = new ArrayList<>();

        while(!(expression = input.nextLine()).equals("end of comments")){
            comments.add(expression);
        }

        printTheInformation(title, content, comments);
    }


    public static void printTheInformation(String title, String content, ArrayList<String> comments){
        System.out.println("<h1>");
        System.out.printf("    %s%n", title);
        System.out.println("</h1>");

        System.out.println("<article>");
        System.out.printf("    %s%n", content);
        System.out.println("</article>");

        for(String comment : comments){
            System.out.println("<div>");
            System.out.printf("    %s%n", comment);
            System.out.println("</div>");
        }
    }
}


