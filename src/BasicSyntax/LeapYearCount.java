package BasicSyntax;

import java.util.Scanner;

public class LeapYearCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = Integer.parseInt(input.nextLine());

        int result = countsLeapYears(year);
        System.out.println(result);
    }


    public static int countsLeapYears(int year){
        return (year - (year % 4)) / 4 - ((year - (year % 100)) / 100 - (year - (year % 400)) / 400);
    }
}


//В григорианския календар годината е високосна в два случая: когато е кратна на 4, но не е кратна на 100, или е кратна на 400.
//Изчислете броя на високосните години от началото на нашата ера (първа година) до дадена година включително.


//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int year = Integer.parseInt(input.nextLine());
//
//        int result = countsLeapYears(year);
//        System.out.println(result);
//    }
//
//
//    public static int countsLeapYears(int endYear){
//        int counter = 0;
//
//        for (int a = 1; a <= endYear; a++) {
//            if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
//                counter++;
//            }
//        }
//
//        return counter;
//    }



//Tests:

//100       24
//400       97
//1000      242
//2019      489
