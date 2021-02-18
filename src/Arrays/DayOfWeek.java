package Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int day = Integer.parseInt(input.nextLine());

        String printNameOfDay = "";

        switch(day){
            case 1: printNameOfDay = "Monday"; break;
            case 2: printNameOfDay = "Tuesday"; break;
            case 3: printNameOfDay = "Wednesday"; break;
            case 4: printNameOfDay = "Thursday"; break;
            case 5: printNameOfDay = "Friday"; break;
            case 6: printNameOfDay = "Saturday"; break;
            case 7: printNameOfDay = "Sunday"; break;
            default: printNameOfDay = "Invalid day!"; break;
        }

        System.out.println(printNameOfDay);
    }
}
