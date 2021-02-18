package ConditionalStatementsAndLoops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PhotoGallery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int name = Integer.parseInt(input.nextLine());
        int day = Integer.parseInt(input.nextLine());
        int month = Integer.parseInt(input.nextLine());
        int year = Integer.parseInt(input.nextLine());
        int hour = Integer.parseInt(input.nextLine());
        int minutes = Integer.parseInt(input.nextLine());
        int size = Integer.parseInt(input.nextLine());
        int width = Integer.parseInt(input.nextLine());
        int height = Integer.parseInt(input.nextLine());

        String orientation = "";
        double readableSize = 0d;
        String bytes = "";

        DecimalFormat df = new DecimalFormat("0.#");

        if(width > height){
            orientation = "landscape";
        }
        else if(width < height){
            orientation = "portrait";
        }
        else{
            orientation = "square";
        }

        if(size < 1000){
            readableSize = size;
            bytes = "B";
        }
        else if(size < 1000000){
            readableSize = Math.round(size / 1000d);
            bytes = "KB";
        }
        else if(size >= 1000000){
            readableSize = size / 1000000d;
            bytes = "MB";
        }

        System.out.printf("Name: DSC_%04d.jpg%n", name);
        System.out.printf("Date Taken: %02d/%02d/%d %02d:%02d%n", day, month, year, hour, minutes);
        System.out.println("Size: " + df.format(readableSize) + bytes);
        System.out.printf("Resolution: %dx%d (%s)", width, height, orientation);
    }
}
