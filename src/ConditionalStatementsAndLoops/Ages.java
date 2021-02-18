package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = Integer.parseInt(input.nextLine());

        if(age < 3){
            System.out.println("baby");
        }
        else if(age < 14){
            System.out.println("child");
        }
        else if(age < 20){
            System.out.println("teenager");
        }
        else if(age < 66){
            System.out.println("adult");
        }
        else if(age >= 66){
            System.out.println("elder");
        }
    }
}
