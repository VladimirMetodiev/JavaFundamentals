package BasicSyntax;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double width = Double.parseDouble(input.nextLine());
        double height = Double.parseDouble(input.nextLine());

        double area = width * height;

        System.out.printf("%.2f", area);
    }
}
