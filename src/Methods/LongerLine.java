package Methods;

import java.util.Scanner;

public class LongerLine {
    static double calculateTheHypotenuse(double x1, double y1, double x2, double y2){
        double hypotenuse = Math.sqrt(Math.pow((Math.max(x1, x2) - Math.min(x1, x2)), 2) + Math.pow((Math.max(y1, y2) - Math.min(y1, y2)), 2));
        return hypotenuse;
    }

    static double calculateDistanceToTheCentre(double x, double y){
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }

    static void printTheClosestPoint(double first, double second, double a, double b, double c, double d){
        if(first <= second){
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", a, b, c, d);
        }
        else{
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", c, d, a, b);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = Double.parseDouble(input.nextLine());
        double y1 = Double.parseDouble(input.nextLine());
        double x2 = Double.parseDouble(input.nextLine());
        double y2 = Double.parseDouble(input.nextLine());

        double x3 = Double.parseDouble(input.nextLine());
        double y3 = Double.parseDouble(input.nextLine());
        double x4 = Double.parseDouble(input.nextLine());
        double y4 = Double.parseDouble(input.nextLine());

        double firstLength = calculateTheHypotenuse(x1, y1, x2, y2);
        double secondLength = calculateTheHypotenuse(x3, y3, x4, y4);

        double firstDistance = 0d, secondDistance = 0d;

        if(firstLength >= secondLength){
            firstDistance = calculateDistanceToTheCentre(x1, y1);
            secondDistance = calculateDistanceToTheCentre(x2, y2);
            printTheClosestPoint(firstDistance, secondDistance, x1, y1, x2, y2);

        }
        else{
            firstDistance = calculateDistanceToTheCentre(x3, y3);
            secondDistance = calculateDistanceToTheCentre(x4, y4);
            printTheClosestPoint(firstDistance, secondDistance, x3, y3, x4, y4);

        }
    }
}
