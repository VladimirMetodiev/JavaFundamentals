package Methods;

import java.util.Scanner;

public class CenterPoint {
    static double calculateTheHypotenuse(double x, double y){
        double hypotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return hypotenuse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = Double.parseDouble(input.nextLine());
        double y1 = Double.parseDouble(input.nextLine());
        double x2 = Double.parseDouble(input.nextLine());
        double y2 = Double.parseDouble(input.nextLine());

        double firstDistance = calculateTheHypotenuse(x1, y1);
        double secondDistance = calculateTheHypotenuse(x2, y2);

        if(firstDistance <= secondDistance){
            System.out.printf("(%.0f, %.0f)", x1, y1);
        }
        else{
            System.out.printf("(%.0f, %.0f)", x2, y2);
        }
    }
}
