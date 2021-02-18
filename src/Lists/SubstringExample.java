package Lists;

import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String expression = input.nextLine();
        //Взимам от конзалата низ от думи разделене със спейс
        int indexOfSpace = expression.indexOf(" ");
        //Изразът открива първият появил се спейс и взима неговият индекс; Този израз ще върне -1, ако няма нито един спейс
        String name = expression.substring(0, indexOfSpace);
        //Взимаме първата дума от expression
        System.out.println(name);
    }
}




