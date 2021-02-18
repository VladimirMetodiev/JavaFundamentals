package Strings;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        while(expression.contains("\\")){
            int position = expression.indexOf("\\");
            expression = expression.substring(position + 1);
        }

        String fileName = expression.substring(0, expression.lastIndexOf("."));
        String fileExtension = expression.substring(expression.indexOf(".") + 1);
        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}
