package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class MegaPixels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = Integer.parseInt(input.nextLine());
        int height = Integer.parseInt(input.nextLine());

        double mPic = width * height / 1000000d;

        System.out.printf("%.1fMP", mPic);
    }
}
