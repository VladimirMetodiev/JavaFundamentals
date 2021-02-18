package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class CountTheIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        int counter = 0;
        String enter = "";

        try{
            while(true){
                enter = input.nextLine();
                number = Integer.parseInt(enter);
                counter++;
            }
        }
        catch(Exception ex){
            System.out.println(counter);
        }
    }
}
