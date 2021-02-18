package Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wagons = Integer.parseInt(input.nextLine());

        int[] passengers = new int[wagons];
        int sum = 0;

        for (int a = 0; a < passengers.length; a++){
            passengers[a] = Integer.parseInt(input.nextLine());
            sum += passengers[a];
        }

        for(int num : passengers){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
