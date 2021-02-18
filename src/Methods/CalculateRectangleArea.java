package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    static double calculateTheArea(int a, int b){
        double area = a * b;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = Integer.parseInt(input.nextLine());
        int height = Integer.parseInt(input.nextLine());

        double area = calculateTheArea(length, height);

        System.out.printf("%.0f", area);
    }
}
