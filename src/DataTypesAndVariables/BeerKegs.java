package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        String model = "";
        double radius = 0d;
        int height = 0;
        String theBiggestKeg ="";
        double theBiggestVolume = 0d;
        double volume;

        for (int i = 1; i <= number; i++) {
            model = input.nextLine();
            radius = Double.parseDouble(input.nextLine());
            height = Integer.parseInt(input.nextLine());

            volume = Math.PI * Math.pow(radius, 2) * height;
            if(volume > theBiggestVolume){
                theBiggestKeg = model;
                theBiggestVolume = volume;
            }
        }

        System.out.println(theBiggestKeg);
    }
}
