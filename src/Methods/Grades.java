package Methods;

import java.util.Scanner;

public class Grades {
    static void rateSuccess(float num){
        if(num < 3f){
            System.out.println("Fail");
        }
        else if(num < 3.5f){
            System.out.println("Poor");
        }
        else if(num < 4.5f){
            System.out.println("Good");
        }
        else if(num < 5.5f){
            System.out.println("Very good");
        }
        else if(num >= 5.5f){
            System.out.println("Excellent");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float number = Float.parseFloat(input.nextLine());

        rateSuccess(number);
    }
}
