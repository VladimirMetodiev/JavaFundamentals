package Lists;

import java.util.Scanner;

public class ContainsExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        boolean isContains = expression.contains("Java");

        System.out.printf("%b", isContains);

        //System.out.println(expression.contains("Java"));
    }
}



//    public static void main(String args[]){
//        String expression ="What do you know about me?";
//        System.out.println(expression.contains("What"));
//    }



//    public static void main(String[] args) {
//        String expression = "To learn Java visit SoftUni.";
//        if(expression.contains("SoftUni")) {
//            System.out.println("This string contains SoftUni.");
//        }
//        else{
//            System.out.println("Result not found.");
//        }
//    }
