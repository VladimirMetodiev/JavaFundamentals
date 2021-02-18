package DataTypesAndVariables;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String town = input.nextLine();
        long population = Long.parseLong(input.nextLine());
        int area = Integer.parseInt(input.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", town, population, area);
    }
}
